package com.bora.steps;

<<<<<<< HEAD

=======
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
import com.bora.pages.RegisterPage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

<<<<<<< HEAD

public class RegisterPageSteps {
	TestContext testContext;
	RegisterPage register;

	public RegisterPageSteps(TestContext passedContext) {
		testContext = passedContext;
		register = testContext.getPages().getRegisterPage();

	}

	@When("User click on Register Link")
	public void user_click_on_register_link() {
		register.clickRegisterLink();
	}
=======
public class RegisterPageSteps {

	
	
	TestContext testContext;
	RegisterPage register;
	
	public RegisterPageSteps(TestContext passedContext) {
		testContext = passedContext;
		register = testContext.getPages().getRegisterPage();
	}
	
	
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {

		register.isAtRegisterPage();
	}
<<<<<<< HEAD
=======

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		register.registerUser(name, email, password);
	}
	
	
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
}
