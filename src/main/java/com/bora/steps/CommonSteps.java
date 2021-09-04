package com.bora.steps;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
<<<<<<< HEAD
=======
import com.bora.managers.WebDriverManager;
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
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
		;
=======

public class CommonSteps {

	
	WebDriverManager driverManager;
	PageObjectManager pages;

	public CommonSteps(TestContext context) {
			driverManager = context.getDriverManager();
			pages = context.getPages();
	}
	
	@Then("Browser is Quited")
	public void browser_is_quited() {
		driverManager.closeDriver();
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

	}

	@When("User accept the alert")
<<<<<<< HEAD
	public void user_accept_the_alert() {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}
=======
	public void user_accept_the_alert() throws Exception {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

>>>>>>> 32eb2652764829c7985a77970c25584b10284375
}
