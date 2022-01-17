package com.bora.helpers;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import com.bora.enums.BrowserType;
import com.bora.enums.EnvironmentType;

public class ConfigReader {
	
	private final String propertyFilePath = "src/test/resources/config/Config.properties";
	private Properties properties;
	
	private static  ConfigReader configReader = new ConfigReader();
	
	private ConfigReader() {
		try {
			FileInputStream stream = new FileInputStream(propertyFilePath);
			properties = new Properties();
			properties.load(stream);
			stream.close();
		} catch (IOException e) {
			e.printStackTrace();
			throw new RuntimeException("Property file path not found!!");
		}
	}
	
	public static ConfigReader getInstance() {
		return configReader;
	}
	

	
	public String getUrl() {
		String url = properties.getProperty("url");
		if(url!=null) {
			return url;
		}
		else {
			throw new RuntimeException("url is not defined in the config.properties file");
		}
	}
	
	public String getDriverPath() {
		String driverPath = properties.getProperty("driverPath");
		if(driverPath!=null) {
			return driverPath;
		}
		else {
			throw new RuntimeException("driverPath is not defined in the config.properties file.");
		}
	}
	
	public long getImplicityWaitTime() {
		String implicityWaitTime = properties.getProperty("implicityWait");
		if(implicityWaitTime!=null) {
			long time = Long.parseLong(implicityWaitTime);
			return time;
		}
		else {
			throw new RuntimeException("implicityWait is not defind in config.properties file");
		}
	}
	
	public long getsmallWait() {
		String smallWait = properties.getProperty("smallWait");
		if(smallWait!=null) {
			long time = Long.parseLong(smallWait);
			return time;
		}
		else {
			throw new RuntimeException("smallWait is not defind in config.properties file");
		}
	}
	
	public long getMediumWait() {
		String mediumWait = properties.getProperty("mediumWait");
		if(mediumWait!=null) {
			long time = Long.parseLong(mediumWait);
			return time;
		}
		else {
			throw new RuntimeException("mediumWait is not defind in config.properties file");
		}
	}
	
	public long getLargeWait() {
		String largeWait = properties.getProperty("largeWait");
		if(largeWait!=null) {
			long time = Long.parseLong(largeWait);
			return time;
		}
		else {
			throw new RuntimeException("largeWait is not defind in config.properties file");
		}
	}
	
	public BrowserType getBrowserName() {
		String browserName = properties.getProperty("browserName");
		if(browserName!=null && browserName.equalsIgnoreCase("Chrome")) {
			return BrowserType.CHROME;
		}
		else if(browserName!=null && browserName.equalsIgnoreCase("Firefox")){
			return BrowserType.FIREFOX;
		}
		else if(browserName!=null && browserName.equalsIgnoreCase("IE")) {
			return BrowserType.IE;
		}
		else {
			throw new RuntimeException("Browser Name key value in config.properties dose not exist!");
		}
	}
	
	public EnvironmentType getEnvironmentType() {
		String environmentType = properties.getProperty("environment");
		if(environmentType!=null && environmentType.equalsIgnoreCase("Local")) {
			return EnvironmentType.LOCAL;
		}
		else if(environmentType !=null && environmentType.equalsIgnoreCase("Remote")) {
			return EnvironmentType.REMOTE;
		}
		else {
			throw new RuntimeException("Environment Type key value in config.properties dose not exist");
		}
	}
	
	public boolean getBrowserMaximize() {
		String maximize = properties.getProperty("maximizeWindow");
		if(maximize!=null) {
			return Boolean.valueOf(maximize);
		}
		else {
			throw new RuntimeException("WindowMaximize key value in config.properteis dose not exist.");
		}
	}
	
	public String getScreenshotPath() {
		
		String screenShotPath = properties.getProperty("screenshotPath");
		if(screenShotPath!=null) {
			return screenShotPath;
		}
		else {
			throw new RuntimeException("screenShotPath is not defined in the config.properties file");
		}
	}
	
}
