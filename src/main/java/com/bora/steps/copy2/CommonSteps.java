package com.bora.steps.copy2;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

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

	}

	@When("User accept the alert")
	public void user_accept_the_alert() throws Exception {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

}
