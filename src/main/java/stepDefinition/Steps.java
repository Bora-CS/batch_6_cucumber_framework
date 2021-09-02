package stepDefinition;

import org.openqa.selenium.WebDriver;

import com.bora.managers.PageObjectManager;

import cucumber.TestContext;

public class Steps {

	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;

	public Steps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}

	static WebDriver driver;

}
