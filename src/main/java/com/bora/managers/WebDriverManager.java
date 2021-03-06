package com.bora.managers;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bora.enums.BrowserType;
import com.bora.enums.EnvironmentType;
import com.bora.helpers.ConfigReader;


public class WebDriverManager {

	public static void main(String[] args) {
       String osName = System.getProperty("os.name");
       System.out.println(osName);
	}
	
	private WebDriver driver;

	private BrowserType browserType;
	private EnvironmentType environmentType;

	public WebDriverManager() {

		browserType = ConfigReader.getInstance().getBrowserName();
		environmentType = ConfigReader.getInstance().getEnvironmentType();

	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createDriver();

		return driver;
	}

	private WebDriver createDriver()  {
		
		try {
		switch (environmentType) {
		case LOCAL: driver = createLocalDriver();
			break;
		case REMOTE: driver = createRemotDriver();
			break;

		}
		}catch(Exception e) {
			e.printStackTrace();
		}
		return driver;

	}

	private WebDriver createLocalDriver() throws Exception {
		
		String driverExtension = "";
		 String osName = System.getProperty("os.name");
		if(osName.contains("Windows")) {
			driverExtension = ".exe";
		}
		
		switch(browserType) {
		case CHROME: 
			
			System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath() + "chromedriver" + driverExtension);
			driver = new ChromeDriver();
		    break;
		
		case FIREFOX: 
			System.setProperty("webdriver.gecko.driver", ConfigReader.getInstance().getDriverPath() + "geckodriver" + driverExtension);
			driver = new FirefoxDriver();
			break;
		
		case IE: 
			throw new Exception("IE browser is not supported or no long used.");
			
		default: 
			throw new Exception("Browser type is not supported, please check the config.properties");
		}
		
		if(ConfigReader.getInstance().getBrowserMaximize()) {
			driver.manage().window().maximize();
		}
		driver.manage().timeouts().implicitlyWait(ConfigReader.getInstance().getImplicityWaitTime(), TimeUnit.SECONDS);
		
		
		return driver;
		
	}

	private WebDriver createRemotDriver() {
		throw new RuntimeException("Do not run remotely!!");
	}
	
	public void closeDriver() {
		driver.quit();
	}
	
}
