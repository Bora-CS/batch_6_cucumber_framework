package com.bora.steps;

import com.bora.managers.PageObjectManager;
import com.bora.pages.HomePage;

import cucumber.TestContext;
import stepDefinition.WebDriverManager;

public class HomePageSteps {
	
	TestContext testContext;
	
	WebDriverManager driverManager;
	PageObjectManager pages;
	
	HomePage home;
	
	public HomePageSteps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
		home =testContext.getPages().getHomePage();
	}

	

}
