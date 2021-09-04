package com.bora.steps;

import java.sql.DriverManager;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import Cucumber.TestContext;

public class Hooks {
	
		
		private WebDriver driver;
		
	
		@Before
		public void setupTest() {
			WebDriverManager webDriverManager = new WebDriverManager();
			driver = webDriverManager.getDriver();
			
			pages = new PageObjectManager(DriverManager.getDriver());
			
			driver.get(ConfigReader.getInstance().getUrl());
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
			
			// setup a DB connection - JDBC
			// setup a log - Log4J
			// setup cookie
	}
		
		@After
		public void endTest() {
			driver.close();
			driver.quit();
		}
	
}
