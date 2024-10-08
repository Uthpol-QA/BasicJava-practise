package com.mylab;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

public class ConfigFileReader {
	private Properties properties;
	private final String propertyFilePath = "configs//Configuration.properties";

	public ConfigFileReader() {
		BufferedReader reader = null;
//?
		try {
			reader = new BufferedReader(new FileReader(propertyFilePath));
			properties = new Properties();
//??
			try {
				properties.load(reader);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			throw new RuntimeException("Properties file not found at path : " + propertyFilePath);
		} finally {
			if (reader != null)
				try {
					reader.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
		}
	}
}
