package com.bora.steps;

import com.bora.helpers.ConfigReader;
import com.bora.managers.PageObjectManager;
import com.bora.pages.HomePage;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinition.WebDriverManager;

public class HomePageSteps {

	TestContext testContext;

	HomePage home;

	public HomePageSteps(TestContext passedContext) {
		testContext = passedContext;

		home = testContext.getPages().getHomePage();
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {

		home.operUrl(ConfigReader.getInstance().getUrl());

		home.isAtHomePage();

	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		home.clickLoginLink();
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		home.logout();
	}


}