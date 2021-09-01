package com.bora.steps;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;

import cucumber.TestContext;
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

	@Then("Browser is Quited")
	public void browser_is_quited() {
		driverManager.closeDriver();

	}

	@When("User accept the alert")
	public void user_accept_the_alert() {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

}
