package com.bora.steps;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;

import cucumber.TestContext;

public class Hooks {

	TestContext testContext;
	private WebDriver driver;

	public Hooks(TestContext passedContext) {
		testContext = passedContext;
		driver = testContext.getDriverManager().getDriver();

	}

	@Before
	public void setupTest() {
		driver.get(ConfigReader.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		// setup DB connection - JDBC
		// setup log -log4J
		// setup cookie

	}

	@After
	public void endTest() {
		driver.close();
		driver.quit();

	}

}