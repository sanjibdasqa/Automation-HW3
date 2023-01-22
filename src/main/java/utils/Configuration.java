package utils;

import java.io.IOException;
import java.util.Properties;

public class Configuration {

	private Properties properties;

	public String getProperty(String key) {
		return properties.getProperty(key);
	}

	public Configuration() {
		loadProperties();
	}

	public void loadProperties() {
		properties = new Properties();
		try {
			properties.load(getClass().getClassLoader().getResourceAsStream("config.properties"));
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}
