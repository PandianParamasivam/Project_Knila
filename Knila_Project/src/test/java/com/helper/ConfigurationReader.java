package com.helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ConfigurationReader {

	
public static Properties pro;
	
	public ConfigurationReader() throws IOException {
		File f = new File("C:\\Users\\mages\\eclipse-workspace\\Knila_Project\\src\\test\\java\\com\\helper\\knila.property");
	    FileInputStream fis = new FileInputStream(f);
	     pro =new Properties();
	    pro.load(fis);
	}
	public String getBrowser() {
		String browser = pro.getProperty("browser");
		return browser;

	}
	public String geturl() {
		String url = pro.getProperty("url");
		return url;


	}
}
