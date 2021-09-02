package com.bora.steps;

import com.bora.pages.RegisterPage;

import Cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {
	
	TestContext testContext;
	
	RegisterPage registerPage;
	
	public RegisterPageSteps(TestContext passedContext){
		testContext = passedContext;
		registerPage = testContext.getPages().getRegisterPage();
	}
	
	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {
		
		registerPage.isAtRegisterPage();
	}
	

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		registerPage.registerUser(name, email, password);
	}
	

}
