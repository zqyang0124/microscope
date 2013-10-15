package com.vipshop.microscope.common.cfg;

import java.util.Properties;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;


/**
 * Read values from properties by keys.
 * 
 * The default properties file is 'nosql-lock.properties', 
 * for now we put all out configurable values in it.
 * 
 * @author Xu Fei
 * @version 1.0
 */
public final class Configuration {
	
	private static final Logger logger = LoggerFactory.getLogger(Configuration.class);
	private static final Properties properties = new Properties();
	
	public static Configuration getConfiguration(String file){
		return new Configuration(file);
	}
	
	/**
	 * Construct Configuration with the given property file.
	 * 
	 * @param propertiesFile the property file in classpath.
	 * @throws LoadPropertyFileException if any exception happens in load properties file
	 */
	public Configuration(String propertiesFile){
		try {
			properties.load(Configuration.class.getClassLoader().getResourceAsStream(propertiesFile));
		} catch (Exception e) {
			throw new RuntimeException("can not load the properties file:" + propertiesFile, e);
		}
		
		logger.info("load properties file " + propertiesFile);
	}
	
	/**
	 * Get String value by key
	 * 
	 * @param key enum key
	 * @return String value
	 */
	public String getString(Enum<?> key) {
		return getString(key.toString());
	}
	
	/**
	 * Get int value by key
	 * 
	 * @param key enum key
	 * @return int value
	 */
	public int getInt(Enum<?> key) {
		return Integer.valueOf(getString(key.toString())).intValue();
	}
	
	public int getInt(String key) {
		return Integer.valueOf(getString(key)).intValue();
	}
	
	/**
	 * Get boolean value by key
	 * 
	 * @param key enum key
	 * @return boolean value
	 */
	public boolean getBoolean(Enum<?> key) {
		return Boolean.valueOf(getString(key.toString())).booleanValue();
	}
	
	/**
	 * Get value by key
	 * 
	 * @param key key
	 * @throws PropertyKeyNotExistException if key no exist in properties
	 * 
	 * @return value in string format
	 */
	public String getString(String key) {
		if (!properties.containsKey(key)) {
			logger.warn("No such property [" + key + " ] " + "in " + properties.getClass());
			throw new RuntimeException("There is no [key] named by: " + key);
		}
		return properties.getProperty(key);
	}
	
}
