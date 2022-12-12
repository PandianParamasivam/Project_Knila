package com.helper;

import java.io.IOException;

public class FileReaderManager {
	
	public ConfigurationReader getInstanceCr() throws IOException {
		ConfigurationReader cr = new ConfigurationReader();
		return cr;

	}

	public static FileReaderManager getInstance() {
		FileReaderManager frm = new FileReaderManager();
		return frm;

	}

}
