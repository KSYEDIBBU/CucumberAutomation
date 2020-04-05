package com.automation.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	public static Properties p;

	public ConfigurationReader() throws IOException {
		File f = new File(
				"C:\\Users\\arun\\eclipse-workspace\\Cucumberpr\\src\\test\\java\\com\\automation\\properties\\Configuration.properties");
		FileInputStream fis = new FileInputStream(f);
		p = new Properties();

		p.load(fis);
	}

	public String getBrowserName() {

		String bName = p.getProperty("broswerexecute");
		return bName;
	}

	public String geturl() {
		String url = p.getProperty("getturl");
		return url;

	}
}
