package com.bora.steps;

import java.util.List;

import com.bora.helpers.SeleniumHelper;
import com.bora.pages.LoginPage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {
	TestContext testContext;
	LoginPage login;
	
 public LoginPageSteps(TestContext passedContext) {
	 testContext =passedContext;
	 login = testContext.getPages().getLoginPage();
	
}	
 @Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		login.isAtLoginPage();
	}

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName, String password) {
		login.login(userName, password);
	}

	
	

	
	}

	