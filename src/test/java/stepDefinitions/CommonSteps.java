package stepDefinitions;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

import cucumber.TestContext;
import io.cucumber.java.en.When;

public class CommonSteps {

	
	WebDriverManager driverManager;
	PageObjectManager pages;

	public CommonSteps(TestContext testContext) {
			driverManager = testContext.getDriverManager();
			pages = testContext.getPages();
	}
<<<<<<< HEAD
=======
	
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474

	@When("User accept the alert")
	public void user_accept_the_alert() throws Exception {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

}
