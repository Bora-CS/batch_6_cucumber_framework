package stepDefinitions;
<<<<<<< HEAD:src/test/java/stepDefinitions/RegisterPageSteps.java


=======
>>>>>>> 3f98156505509c0ce8ac604741229ed4b9312986:src/main/java/com/bora/steps/RegisterPageSteps.java

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

	@When("User click on Register Link")
	public void user_click_on_register_link() {
		register.clickRegisterLink();

	}

	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {

		register.isAtRegisterPage();
	}


	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		register.registerUser(name, email, password);
	}
	

}
