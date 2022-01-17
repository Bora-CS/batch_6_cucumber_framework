package stepDefinitions;

import com.bora.pages.RegisterPage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RegisterPageSteps {

	
	
	TestContext testContext;
	RegisterPage register;
	
	public RegisterPageSteps(TestContext passedContext) {
		testContext = passedContext;
		register = testContext.getPages().getRegisterPage();
	}
	
	

	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {

		register.isAtPage();
	}

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		register.registerUser(name, email, password);
	}
	
	
}
