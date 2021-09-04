package com.bora.steps;

import com.bora.helpers.ConfigReader;
<<<<<<< HEAD
import com.bora.managers.PageObjectManager;
=======
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
import com.bora.pages.HomePage;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
<<<<<<< HEAD
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinition.WebDriverManager;
=======
import io.cucumber.java.en.When;
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed

public class HomePageSteps {

	TestContext testContext;
<<<<<<< HEAD

=======
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
	HomePage home;

	public HomePageSteps(TestContext passedContext) {
		testContext = passedContext;

		home = testContext.getPages().getHomePage();
	}

	@Given("User is on Home Page")
	public void user_is_on_home_page() {

<<<<<<< HEAD
		home.operUrl(ConfigReader.getInstance().getUrl());
=======
		home.openUrl(ConfigReader.getInstance().getUrl());
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed

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

<<<<<<< HEAD

}
=======
	@When("User click on Register Link")
	public void user_click_on_register_link() {
		home.clickRegisterLink();
	}

}
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
