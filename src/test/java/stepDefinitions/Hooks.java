package stepDefinitions;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks {

	TestContext testContext;

	public Hooks(TestContext testContext) {
		this.testContext = testContext;
	}

	@Before
	public void setupTest() {

	}

	@After
	public void endTest() {
		testContext.getDriverManager().closeDriver();

	}

	@AfterStep
	public void afterStep(Scenario scenario) throws Exception {
		System.out.println(scenario.getName());
		if (scenario.isFailed()) {
			byte[] bytes = SeleniumHelper.takeScreenshot(testContext.getDriverManager().getDriver());
			scenario.attach(bytes, "image/png", "image");

		}

	}
}