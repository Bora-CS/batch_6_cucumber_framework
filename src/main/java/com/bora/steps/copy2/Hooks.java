package com.bora.steps.copy2;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

//import cucumber.TestContext;

public class Hooks {

	private WebDriver driver;
	public PageObjectManager pageObjectManager;
	
	

	@Before
	public void setupTest() throws Exception {
		WebDriverManager webDriverManager = new WebDriverManager();
		driver = webDriverManager.getDriver();
		pageObjectManager = new PageObjectManager(driver);
		driver.get(ConfigReader.getInstance().getUrl());

	}

	@After
	public void endTest() {
		driver.close();
		driver.quit();
	}

}
