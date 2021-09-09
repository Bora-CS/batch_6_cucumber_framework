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
	
>>>>>>> 044697413696be3234aa3d59e684b678cd422823

	@When("User accept the alert")
	public void user_accept_the_alert() throws Exception {
		SeleniumHelper.acceptAlert(driverManager.getDriver());
	}

}
