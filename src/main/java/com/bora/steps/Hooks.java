package com.bora.steps;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
<<<<<<< HEAD

import cucumber.TestContext;

public class Hooks {
	
	TestContext testContext;
	private WebDriver driver;
	
	public Hooks(TestContext passedContext) {
		testContext =passedContext;
		driver = testContext.getDriverManager().getDriver();
		
	}
	@Before
	public void setupTest() {
		driver.get(ConfigReader.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		//setup DB connection - JDBC
		//setup log -log4J
		//setup cookie
		
	}
=======
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

>>>>>>> 32eb2652764829c7985a77970c25584b10284375
	@After
	public void endTest() {
		driver.close();
		driver.quit();
<<<<<<< HEAD
		
=======
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
	}

}
