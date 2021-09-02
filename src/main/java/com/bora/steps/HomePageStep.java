package com.bora.steps;

import com.bora.helpers.ConfigReader;
import com.bora.managers.PageObjectManager;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import stepDefinition.WebDriverManager;

public class HomePageStep {
	
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;

	public HomePageStep(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driverManager.getDriver().get(ConfigReader.getInstance().getUrl());
		pages.getHomePage().isAtHomePage();

	}
	
	@Given("User click on Login button")
	public void user_click_on_login_button() {
		pages.getHomePage().clickLoginLink();
	}
	
	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		pages.getLoginPage().isAtLoginPage();
	}
	
	

}
