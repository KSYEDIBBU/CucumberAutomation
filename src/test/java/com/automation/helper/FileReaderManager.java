package com.automation.helper;

import java.io.IOException;

public class FileReaderManager {

	private FileReaderManager() {

	}

	public static FileReaderManager getInstance() {
		FileReaderManager fr = new FileReaderManager();
		return fr;
	}

	public ConfigurationReader getcrInstance() throws IOException {

		ConfigurationReader cr = new ConfigurationReader();
		return cr;
	}
}