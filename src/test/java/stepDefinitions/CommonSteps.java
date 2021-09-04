package stepDefinitions;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
<<<<<<< HEAD
=======
import com.bora.managers.WebDriverManager;
>>>>>>> 32eb2652764829c7985a77970c25584b10284375

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import stepDefinition.WebDriverManager;

public class CommonSteps {
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;

	public CommonSteps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}

	@Then("Browser is Quited")
	public void browser_is_quited() {
		driverManager.closeDriver();
		;


	}

	@When("User accept the alert")

	public void user_accept_the_alert() throws Exception {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

}
