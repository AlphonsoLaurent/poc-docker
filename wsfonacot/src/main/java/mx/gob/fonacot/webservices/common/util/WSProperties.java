package mx.gob.fonacot.webservices.common.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class WSProperties {
	private static WSProperties instance = null;
	Properties properties;

	protected WSProperties() {
		properties = new Properties();
		InputStream resourceStream = this.getClass().getResourceAsStream(
				"/webservice.properties");
		try {
			properties.load(resourceStream);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static WSProperties getInstance() {
		if (instance == null) {
			instance = new WSProperties();
		}
		return instance;
	}

	public String getProperty(String propertyName) {
		return properties.getProperty(propertyName);
	}
}
