/**
 * Autogenerated by Thrift Compiler (0.9.0)
 *
 * DO NOT EDIT UNLESS YOU ARE SURE THAT YOU KNOW WHAT YOU ARE DOING
 *  @generated
 */
package com.vipshop.microscope.thrift;

import java.util.ArrayList;
import java.util.BitSet;
import java.util.Collections;
import java.util.EnumMap;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.thrift.protocol.TTupleProtocol;
import org.apache.thrift.scheme.IScheme;
import org.apache.thrift.scheme.SchemeFactory;
import org.apache.thrift.scheme.StandardScheme;
import org.apache.thrift.scheme.TupleScheme;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Send {

  public interface Iface {

    public ResultCode send(List<LogEntry> messages) throws org.apache.thrift.TException;

  }

  public interface AsyncIface {

    public void send(List<LogEntry> messages, org.apache.thrift.async.AsyncMethodCallback<AsyncClient.send_call> resultHandler) throws org.apache.thrift.TException;

  }

  public static class Client extends org.apache.thrift.TServiceClient implements Iface {
    public static class Factory implements org.apache.thrift.TServiceClientFactory<Client> {
      public Factory() {}
      public Client getClient(org.apache.thrift.protocol.TProtocol prot) {
        return new Client(prot);
      }
      public Client getClient(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
        return new Client(iprot, oprot);
      }
    }

    public Client(org.apache.thrift.protocol.TProtocol prot)
    {
      super(prot, prot);
    }

    public Client(org.apache.thrift.protocol.TProtocol iprot, org.apache.thrift.protocol.TProtocol oprot) {
      super(iprot, oprot);
    }

    public ResultCode send(List<LogEntry> messages) throws org.apache.thrift.TException
    {
      send_send(messages);
      return recv_send();
    }

    public void send_send(List<LogEntry> messages) throws org.apache.thrift.TException
    {
      send_args args = new send_args();
      args.setMessages(messages);
      sendBase("send", args);
    }

    public ResultCode recv_send() throws org.apache.thrift.TException
    {
      send_result result = new send_result();
      receiveBase(result, "send");
      if (result.isSetSuccess()) {
        return result.success;
      }
      throw new org.apache.thrift.TApplicationException(org.apache.thrift.TApplicationException.MISSING_RESULT, "send failed: unknown result");
    }

  }
  public static class AsyncClient extends org.apache.thrift.async.TAsyncClient implements AsyncIface {
    public static class Factory implements org.apache.thrift.async.TAsyncClientFactory<AsyncClient> {
      private org.apache.thrift.async.TAsyncClientManager clientManager;
      private org.apache.thrift.protocol.TProtocolFactory protocolFactory;
      public Factory(org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.protocol.TProtocolFactory protocolFactory) {
        this.clientManager = clientManager;
        this.protocolFactory = protocolFactory;
      }
      public AsyncClient getAsyncClient(org.apache.thrift.transport.TNonblockingTransport transport) {
        return new AsyncClient(protocolFactory, clientManager, transport);
      }
    }

    public AsyncClient(org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.async.TAsyncClientManager clientManager, org.apache.thrift.transport.TNonblockingTransport transport) {
      super(protocolFactory, clientManager, transport);
    }

    public void send(List<LogEntry> messages, org.apache.thrift.async.AsyncMethodCallback<send_call> resultHandler) throws org.apache.thrift.TException {
      checkReady();
      send_call method_call = new send_call(messages, resultHandler, this, ___protocolFactory, ___transport);
      this.___currentMethod = method_call;
      ___manager.call(method_call);
    }

    public static class send_call extends org.apache.thrift.async.TAsyncMethodCall {
      private List<LogEntry> messages;
      public send_call(List<LogEntry> messages, org.apache.thrift.async.AsyncMethodCallback<send_call> resultHandler, org.apache.thrift.async.TAsyncClient client, org.apache.thrift.protocol.TProtocolFactory protocolFactory, org.apache.thrift.transport.TNonblockingTransport transport) throws org.apache.thrift.TException {
        super(client, protocolFactory, transport, resultHandler, false);
        this.messages = messages;
      }

      public void write_args(org.apache.thrift.protocol.TProtocol prot) throws org.apache.thrift.TException {
        prot.writeMessageBegin(new org.apache.thrift.protocol.TMessage("send", org.apache.thrift.protocol.TMessageType.CALL, 0));
        send_args args = new send_args();
        args.setMessages(messages);
        args.write(prot);
        prot.writeMessageEnd();
      }

      public ResultCode getResult() throws org.apache.thrift.TException {
        if (getState() != org.apache.thrift.async.TAsyncMethodCall.State.RESPONSE_READ) {
          throw new IllegalStateException("Method call not finished!");
        }
        org.apache.thrift.transport.TMemoryInputTransport memoryTransport = new org.apache.thrift.transport.TMemoryInputTransport(getFrameBuffer().array());
        org.apache.thrift.protocol.TProtocol prot = client.getProtocolFactory().getProtocol(memoryTransport);
        return (new Client(prot)).recv_send();
      }
    }

  }

  public static class Processor<I extends Iface> extends org.apache.thrift.TBaseProcessor<I> implements org.apache.thrift.TProcessor {
    private static final Logger LOGGER = LoggerFactory.getLogger(Processor.class.getName());
    public Processor(I iface) {
      super(iface, getProcessMap(new HashMap<String, org.apache.thrift.ProcessFunction<I, ? extends org.apache.thrift.TBase>>()));
    }

    protected Processor(I iface, Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      super(iface, getProcessMap(processMap));
    }

    private static <I extends Iface> Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> getProcessMap(Map<String,  org.apache.thrift.ProcessFunction<I, ? extends  org.apache.thrift.TBase>> processMap) {
      processMap.put("send", new send());
      return processMap;
    }

    public static class send<I extends Iface> extends org.apache.thrift.ProcessFunction<I, send_args> {
      public send() {
        super("send");
      }

      public send_args getEmptyArgsInstance() {
        return new send_args();
      }

      protected boolean isOneway() {
        return false;
      }

      public send_result getResult(I iface, send_args args) throws org.apache.thrift.TException {
        send_result result = new send_result();
        result.success = iface.send(args.messages);
        return result;
      }
    }

  }

  public static class send_args implements org.apache.thrift.TBase<send_args, send_args._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("send_args");

    private static final org.apache.thrift.protocol.TField MESSAGES_FIELD_DESC = new org.apache.thrift.protocol.TField("messages", org.apache.thrift.protocol.TType.LIST, (short)1);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new send_argsStandardSchemeFactory());
      schemes.put(TupleScheme.class, new send_argsTupleSchemeFactory());
    }

    public List<LogEntry> messages; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      MESSAGES((short)1, "messages");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 1: // MESSAGES
            return MESSAGES;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.MESSAGES, new org.apache.thrift.meta_data.FieldMetaData("messages", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.ListMetaData(org.apache.thrift.protocol.TType.LIST, 
              new org.apache.thrift.meta_data.StructMetaData(org.apache.thrift.protocol.TType.STRUCT, LogEntry.class))));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(send_args.class, metaDataMap);
    }

    public send_args() {
    }

    public send_args(
      List<LogEntry> messages)
    {
      this();
      this.messages = messages;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public send_args(send_args other) {
      if (other.isSetMessages()) {
        List<LogEntry> __this__messages = new ArrayList<LogEntry>();
        for (LogEntry other_element : other.messages) {
          __this__messages.add(new LogEntry(other_element));
        }
        this.messages = __this__messages;
      }
    }

    public send_args deepCopy() {
      return new send_args(this);
    }

    @Override
    public void clear() {
      this.messages = null;
    }

    public int getMessagesSize() {
      return (this.messages == null) ? 0 : this.messages.size();
    }

    public java.util.Iterator<LogEntry> getMessagesIterator() {
      return (this.messages == null) ? null : this.messages.iterator();
    }

    public void addToMessages(LogEntry elem) {
      if (this.messages == null) {
        this.messages = new ArrayList<LogEntry>();
      }
      this.messages.add(elem);
    }

    public List<LogEntry> getMessages() {
      return this.messages;
    }

    public send_args setMessages(List<LogEntry> messages) {
      this.messages = messages;
      return this;
    }

    public void unsetMessages() {
      this.messages = null;
    }

    /** Returns true if field messages is set (has been assigned a value) and false otherwise */
    public boolean isSetMessages() {
      return this.messages != null;
    }

    public void setMessagesIsSet(boolean value) {
      if (!value) {
        this.messages = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case MESSAGES:
        if (value == null) {
          unsetMessages();
        } else {
          setMessages((List<LogEntry>)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case MESSAGES:
        return getMessages();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case MESSAGES:
        return isSetMessages();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof send_args)
        return this.equals((send_args)that);
      return false;
    }

    public boolean equals(send_args that) {
      if (that == null)
        return false;

      boolean this_present_messages = true && this.isSetMessages();
      boolean that_present_messages = true && that.isSetMessages();
      if (this_present_messages || that_present_messages) {
        if (!(this_present_messages && that_present_messages))
          return false;
        if (!this.messages.equals(that.messages))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(send_args other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      send_args typedOther = (send_args)other;

      lastComparison = Boolean.valueOf(isSetMessages()).compareTo(typedOther.isSetMessages());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetMessages()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.messages, typedOther.messages);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
    }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("send_args(");
      boolean first = true;

      sb.append("messages:");
      if (this.messages == null) {
        sb.append("null");
      } else {
        sb.append(this.messages);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class send_argsStandardSchemeFactory implements SchemeFactory {
      public send_argsStandardScheme getScheme() {
        return new send_argsStandardScheme();
      }
    }

    private static class send_argsStandardScheme extends StandardScheme<send_args> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, send_args struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 1: // MESSAGES
              if (schemeField.type == org.apache.thrift.protocol.TType.LIST) {
                {
                  org.apache.thrift.protocol.TList _list0 = iprot.readListBegin();
                  struct.messages = new ArrayList<LogEntry>(_list0.size);
                  for (int _i1 = 0; _i1 < _list0.size; ++_i1)
                  {
                    LogEntry _elem2; // required
                    _elem2 = new LogEntry();
                    _elem2.read(iprot);
                    struct.messages.add(_elem2);
                  }
                  iprot.readListEnd();
                }
                struct.setMessagesIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, send_args struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.messages != null) {
          oprot.writeFieldBegin(MESSAGES_FIELD_DESC);
          {
            oprot.writeListBegin(new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, struct.messages.size()));
            for (LogEntry _iter3 : struct.messages)
            {
              _iter3.write(oprot);
            }
            oprot.writeListEnd();
          }
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class send_argsTupleSchemeFactory implements SchemeFactory {
      public send_argsTupleScheme getScheme() {
        return new send_argsTupleScheme();
      }
    }

    private static class send_argsTupleScheme extends TupleScheme<send_args> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, send_args struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetMessages()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetMessages()) {
          {
            oprot.writeI32(struct.messages.size());
            for (LogEntry _iter4 : struct.messages)
            {
              _iter4.write(oprot);
            }
          }
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, send_args struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          {
            org.apache.thrift.protocol.TList _list5 = new org.apache.thrift.protocol.TList(org.apache.thrift.protocol.TType.STRUCT, iprot.readI32());
            struct.messages = new ArrayList<LogEntry>(_list5.size);
            for (int _i6 = 0; _i6 < _list5.size; ++_i6)
            {
              LogEntry _elem7; // required
              _elem7 = new LogEntry();
              _elem7.read(iprot);
              struct.messages.add(_elem7);
            }
          }
          struct.setMessagesIsSet(true);
        }
      }
    }

  }

  public static class send_result implements org.apache.thrift.TBase<send_result, send_result._Fields>, java.io.Serializable, Cloneable   {
    private static final org.apache.thrift.protocol.TStruct STRUCT_DESC = new org.apache.thrift.protocol.TStruct("send_result");

    private static final org.apache.thrift.protocol.TField SUCCESS_FIELD_DESC = new org.apache.thrift.protocol.TField("success", org.apache.thrift.protocol.TType.I32, (short)0);

    private static final Map<Class<? extends IScheme>, SchemeFactory> schemes = new HashMap<Class<? extends IScheme>, SchemeFactory>();
    static {
      schemes.put(StandardScheme.class, new send_resultStandardSchemeFactory());
      schemes.put(TupleScheme.class, new send_resultTupleSchemeFactory());
    }

    /**
     * 
     * @see ResultCode
     */
    public ResultCode success; // required

    /** The set of fields this struct contains, along with convenience methods for finding and manipulating them. */
    public enum _Fields implements org.apache.thrift.TFieldIdEnum {
      /**
       * 
       * @see ResultCode
       */
      SUCCESS((short)0, "success");

      private static final Map<String, _Fields> byName = new HashMap<String, _Fields>();

      static {
        for (_Fields field : EnumSet.allOf(_Fields.class)) {
          byName.put(field.getFieldName(), field);
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, or null if its not found.
       */
      public static _Fields findByThriftId(int fieldId) {
        switch(fieldId) {
          case 0: // SUCCESS
            return SUCCESS;
          default:
            return null;
        }
      }

      /**
       * Find the _Fields constant that matches fieldId, throwing an exception
       * if it is not found.
       */
      public static _Fields findByThriftIdOrThrow(int fieldId) {
        _Fields fields = findByThriftId(fieldId);
        if (fields == null) throw new IllegalArgumentException("Field " + fieldId + " doesn't exist!");
        return fields;
      }

      /**
       * Find the _Fields constant that matches name, or null if its not found.
       */
      public static _Fields findByName(String name) {
        return byName.get(name);
      }

      private final short _thriftId;
      private final String _fieldName;

      _Fields(short thriftId, String fieldName) {
        _thriftId = thriftId;
        _fieldName = fieldName;
      }

      public short getThriftFieldId() {
        return _thriftId;
      }

      public String getFieldName() {
        return _fieldName;
      }
    }

    // isset id assignments
    public static final Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> metaDataMap;
    static {
      Map<_Fields, org.apache.thrift.meta_data.FieldMetaData> tmpMap = new EnumMap<_Fields, org.apache.thrift.meta_data.FieldMetaData>(_Fields.class);
      tmpMap.put(_Fields.SUCCESS, new org.apache.thrift.meta_data.FieldMetaData("success", org.apache.thrift.TFieldRequirementType.DEFAULT, 
          new org.apache.thrift.meta_data.EnumMetaData(org.apache.thrift.protocol.TType.ENUM, ResultCode.class)));
      metaDataMap = Collections.unmodifiableMap(tmpMap);
      org.apache.thrift.meta_data.FieldMetaData.addStructMetaDataMap(send_result.class, metaDataMap);
    }

    public send_result() {
    }

    public send_result(
      ResultCode success)
    {
      this();
      this.success = success;
    }

    /**
     * Performs a deep copy on <i>other</i>.
     */
    public send_result(send_result other) {
      if (other.isSetSuccess()) {
        this.success = other.success;
      }
    }

    public send_result deepCopy() {
      return new send_result(this);
    }

    @Override
    public void clear() {
      this.success = null;
    }

    /**
     * 
     * @see ResultCode
     */
    public ResultCode getSuccess() {
      return this.success;
    }

    /**
     * 
     * @see ResultCode
     */
    public send_result setSuccess(ResultCode success) {
      this.success = success;
      return this;
    }

    public void unsetSuccess() {
      this.success = null;
    }

    /** Returns true if field success is set (has been assigned a value) and false otherwise */
    public boolean isSetSuccess() {
      return this.success != null;
    }

    public void setSuccessIsSet(boolean value) {
      if (!value) {
        this.success = null;
      }
    }

    public void setFieldValue(_Fields field, Object value) {
      switch (field) {
      case SUCCESS:
        if (value == null) {
          unsetSuccess();
        } else {
          setSuccess((ResultCode)value);
        }
        break;

      }
    }

    public Object getFieldValue(_Fields field) {
      switch (field) {
      case SUCCESS:
        return getSuccess();

      }
      throw new IllegalStateException();
    }

    /** Returns true if field corresponding to fieldID is set (has been assigned a value) and false otherwise */
    public boolean isSet(_Fields field) {
      if (field == null) {
        throw new IllegalArgumentException();
      }

      switch (field) {
      case SUCCESS:
        return isSetSuccess();
      }
      throw new IllegalStateException();
    }

    @Override
    public boolean equals(Object that) {
      if (that == null)
        return false;
      if (that instanceof send_result)
        return this.equals((send_result)that);
      return false;
    }

    public boolean equals(send_result that) {
      if (that == null)
        return false;

      boolean this_present_success = true && this.isSetSuccess();
      boolean that_present_success = true && that.isSetSuccess();
      if (this_present_success || that_present_success) {
        if (!(this_present_success && that_present_success))
          return false;
        if (!this.success.equals(that.success))
          return false;
      }

      return true;
    }

    @Override
    public int hashCode() {
      return 0;
    }

    public int compareTo(send_result other) {
      if (!getClass().equals(other.getClass())) {
        return getClass().getName().compareTo(other.getClass().getName());
      }

      int lastComparison = 0;
      send_result typedOther = (send_result)other;

      lastComparison = Boolean.valueOf(isSetSuccess()).compareTo(typedOther.isSetSuccess());
      if (lastComparison != 0) {
        return lastComparison;
      }
      if (isSetSuccess()) {
        lastComparison = org.apache.thrift.TBaseHelper.compareTo(this.success, typedOther.success);
        if (lastComparison != 0) {
          return lastComparison;
        }
      }
      return 0;
    }

    public _Fields fieldForId(int fieldId) {
      return _Fields.findByThriftId(fieldId);
    }

    public void read(org.apache.thrift.protocol.TProtocol iprot) throws org.apache.thrift.TException {
      schemes.get(iprot.getScheme()).getScheme().read(iprot, this);
    }

    public void write(org.apache.thrift.protocol.TProtocol oprot) throws org.apache.thrift.TException {
      schemes.get(oprot.getScheme()).getScheme().write(oprot, this);
      }

    @Override
    public String toString() {
      StringBuilder sb = new StringBuilder("send_result(");
      boolean first = true;

      sb.append("success:");
      if (this.success == null) {
        sb.append("null");
      } else {
        sb.append(this.success);
      }
      first = false;
      sb.append(")");
      return sb.toString();
    }

    public void validate() throws org.apache.thrift.TException {
      // check for required fields
      // check for sub-struct validity
    }

    private void writeObject(java.io.ObjectOutputStream out) throws java.io.IOException {
      try {
        write(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(out)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private void readObject(java.io.ObjectInputStream in) throws java.io.IOException, ClassNotFoundException {
      try {
        read(new org.apache.thrift.protocol.TCompactProtocol(new org.apache.thrift.transport.TIOStreamTransport(in)));
      } catch (org.apache.thrift.TException te) {
        throw new java.io.IOException(te);
      }
    }

    private static class send_resultStandardSchemeFactory implements SchemeFactory {
      public send_resultStandardScheme getScheme() {
        return new send_resultStandardScheme();
      }
    }

    private static class send_resultStandardScheme extends StandardScheme<send_result> {

      public void read(org.apache.thrift.protocol.TProtocol iprot, send_result struct) throws org.apache.thrift.TException {
        org.apache.thrift.protocol.TField schemeField;
        iprot.readStructBegin();
        while (true)
        {
          schemeField = iprot.readFieldBegin();
          if (schemeField.type == org.apache.thrift.protocol.TType.STOP) { 
            break;
          }
          switch (schemeField.id) {
            case 0: // SUCCESS
              if (schemeField.type == org.apache.thrift.protocol.TType.I32) {
                struct.success = ResultCode.findByValue(iprot.readI32());
                struct.setSuccessIsSet(true);
              } else { 
                org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
              }
              break;
            default:
              org.apache.thrift.protocol.TProtocolUtil.skip(iprot, schemeField.type);
          }
          iprot.readFieldEnd();
        }
        iprot.readStructEnd();

        // check for required fields of primitive type, which can't be checked in the validate method
        struct.validate();
      }

      public void write(org.apache.thrift.protocol.TProtocol oprot, send_result struct) throws org.apache.thrift.TException {
        struct.validate();

        oprot.writeStructBegin(STRUCT_DESC);
        if (struct.success != null) {
          oprot.writeFieldBegin(SUCCESS_FIELD_DESC);
          oprot.writeI32(struct.success.getValue());
          oprot.writeFieldEnd();
        }
        oprot.writeFieldStop();
        oprot.writeStructEnd();
      }

    }

    private static class send_resultTupleSchemeFactory implements SchemeFactory {
      public send_resultTupleScheme getScheme() {
        return new send_resultTupleScheme();
      }
    }

    private static class send_resultTupleScheme extends TupleScheme<send_result> {

      @Override
      public void write(org.apache.thrift.protocol.TProtocol prot, send_result struct) throws org.apache.thrift.TException {
        TTupleProtocol oprot = (TTupleProtocol) prot;
        BitSet optionals = new BitSet();
        if (struct.isSetSuccess()) {
          optionals.set(0);
        }
        oprot.writeBitSet(optionals, 1);
        if (struct.isSetSuccess()) {
          oprot.writeI32(struct.success.getValue());
        }
      }

      @Override
      public void read(org.apache.thrift.protocol.TProtocol prot, send_result struct) throws org.apache.thrift.TException {
        TTupleProtocol iprot = (TTupleProtocol) prot;
        BitSet incoming = iprot.readBitSet(1);
        if (incoming.get(0)) {
          struct.success = ResultCode.findByValue(iprot.readI32());
          struct.setSuccessIsSet(true);
        }
      }
    }

  }

}
