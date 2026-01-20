package com.e2eTest.automation.utils;

import java.io.IOException;
import java.io.InputStream;
import java.util.Objects;
import java.util.Properties;

/**
 * Utility class responsible for reading configuration properties from the
 * env-config.properties file.
 */
public class ConfigFileReader {

	private static final String PROPERTY_FILE_PATH = "/configs/env-config.properties";
	private final Properties properties = new Properties();

	/**
	 * Initializes the ConfigFileReader and loads the configuration file.
	 * 
	 * @throws RuntimeException if the configuration file is not found or cannot be
	 *                          loaded
	 */
	public ConfigFileReader() {
		loadProperties();
	}

	/**
	 * Loads properties from the configuration file.
	 */
	private void loadProperties() {
		try (InputStream inputStream = getClass().getResourceAsStream(PROPERTY_FILE_PATH)) {

			if (inputStream == null) {
				throw new RuntimeException("Configuration file not found at path: " + PROPERTY_FILE_PATH);
			}

			properties.load(inputStream);

		} catch (IOException e) {
			throw new RuntimeException("Failed to load configuration file: " + PROPERTY_FILE_PATH, e);
		}
	}

	/**
	 * Returns the value of a property based on the provided key.
	 *
	 * @param key the name of the property
	 * @return the property value
	 * @throws RuntimeException if the property is not found
	 */
	public String getProperty(String key) {
		String value = properties.getProperty(key);

		if (Objects.isNull(value)) {
			throw new RuntimeException("Property '" + key + "' is not specified in the configuration file.");
		}

		return value;
	}
}
