package com.bora.steps;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;

import Cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinition.WebDriverManager;

public class CommonSteps {
	
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;
		
	public CommonSteps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}
	
	@When("User accept the alert")
	public void user_accept_the_alert() {
		SeleniumHelper.acceptAlert(testContext.getDriverManager().getDriver());
	}
	
	@Then("Browser is Quited")
	public void browser_is_quited() {
		testContext.getDriverManager().closeBrowser();

	}

}
