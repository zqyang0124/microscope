package com.vipshop.microscope.storage;

import com.vipshop.microscope.common.util.TimeStampUtil;
import com.vipshop.microscope.trace.Constants;
import com.vipshop.microscope.trace.metric.MetricData;
import org.apache.hadoop.hbase.client.Result;
import org.apache.hadoop.hbase.client.Scan;
import org.apache.hadoop.hbase.filter.PageFilter;
import org.apache.hadoop.hbase.util.Bytes;
import org.springframework.data.hadoop.hbase.RowMapper;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Repository
public class MetricRepository extends AbstractRepository {

    public void initialize() {
        super.create(MetricTable.TABLE_TSDB, MetricTable.CF_T);
        super.create(MetricTable.TABLE_TSDBUID, new String[]{MetricTable.CF_NAME, MetricTable.CF_ID});
    }

    public void drop() {
        super.drop(MetricTable.TABLE_TSDB);
        super.drop(MetricTable.TABLE_TSDB);
    }

    public void save(final MetricData metrics) {
        String metric = metrics.getMetric();
        long timestamp = metrics.getTimestamp();
        Map<String, String> tags = metrics.getTags();
        Object value = metrics.getValue();


    }

    public List<Map<String, Object>> find(Map<String, String> query) {
        Scan scan = new Scan();

        /**
         * limit the size of result in [10, 1000]
         */
        long limit = 10;

        if (limit > 1000) {
            limit = 1000;
        }

        if (limit < 1) {
            limit = 10;
        }

        PageFilter pageFilter = new PageFilter(limit);
        scan.setFilter(pageFilter);

        String appName = query.get(Constants.APP);
        String ipAddress = query.get(Constants.IP);
        String metricsname = query.get(Constants.METRIC);

        long startTime = Long.valueOf(query.get(Constants.STARTTIME));
        long endTime = Long.valueOf(query.get(Constants.ENDTIME));

        startTime = TimeStampUtil.baseHourTime(startTime);
        endTime = TimeStampUtil.baseHourTime(endTime);

		/*
         * Query by rowKey : appName-traceName-timestamp-ipAddress-******
		 */
        String startKey = metricsname + "#" + startTime + "#" + appName + ipAddress;
        String endKey = metricsname + "#" + endTime + "#" + appName + ipAddress;

        scan.setStartRow(Bytes.toBytes(startKey));
        scan.setStopRow(Bytes.toBytes(endKey));

        scan.setCaching(100);
        scan.setCacheBlocks(true);

        final List<Map<String, Object>> resutls = new ArrayList<Map<String, Object>>();
        List<Map<String, Object>> tableTraces = hbaseTemplate.find(MetricTable.TABLE_TSDB, scan, new RowMapper<Map<String, Object>>() {
            @Override
            public Map<String, Object> mapRow(Result result, int rowNum) throws Exception {
                Map<String, Object> metricsResult = new HashMap<String, Object>();

                String row = Bytes.toString(result.getRow());
                String[] qunitifer = getColumnsInColumnFamily(result, MetricTable.CF_T);

                StringBuilder builder = new StringBuilder();
                for (int i = 0; i < qunitifer.length; i++) {
                    byte[] data = result.getValue(MetricTable.BYTE_CF_T, Bytes.toBytes(qunitifer[i]));
                    builder.append(qunitifer[i]).append(":").append(Bytes.toString(data)).append(",");
                }

                String tmp = builder.toString();

                metricsResult.put("basetime", row.split("#")[1]);
                metricsResult.put("value", tmp.substring(0, tmp.length() - 1));
                resutls.add(metricsResult);
                return metricsResult;
            }

        });

        return resutls;
    }


}