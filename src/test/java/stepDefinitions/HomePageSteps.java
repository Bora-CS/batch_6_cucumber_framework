package stepDefinitions;

import com.bora.helpers.ConfigReader;
<<<<<<< HEAD
import com.bora.managers.PageObjectManager;
=======
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
import com.bora.pages.HomePage;

import cucumber.TestContext;
import io.cucumber.java.en.Given;
<<<<<<< HEAD
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import stepDefinition.WebDriverManager;
=======
import io.cucumber.java.en.When;
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

public class HomePageSteps {

	TestContext testContext;
<<<<<<< HEAD

=======
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
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
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

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
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
