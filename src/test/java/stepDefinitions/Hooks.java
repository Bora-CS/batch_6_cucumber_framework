package stepDefinitions;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.SeleniumHelper;
import com.bora.managers.WebDriverManager;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
<<<<<<< HEAD
=======

>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474



public class Hooks {

	TestContext testContext ;
	
	public Hooks(TestContext testContext){
		this.testContext = testContext;
	}

	
	@Before
	public void setupTest() throws IOException  {

		//Go to face book website
		WebDriverManager driverManager = testContext.getDriverManager();
		WebDriver driver = driverManager.getDriver();
		driver.get("https://www.facebook.com");
		SeleniumHelper.takeScreenshot(driver, "facebookhome");
		System.out.println();
	}

	@After
	public void endTest() {

		testContext.getDriverManager().closeDriver();
	}
	
	@AfterStep
	public void afterStep(Scenario scenario) {
<<<<<<< HEAD
		System.out.println(scenario.getName());
		System.out.println(scenario.getLine());

		if(scenario.isFailed()) {
			byte[] bytes = SeleniumHelper.takeScreenshot(testContext.getDriverManager().getDriver());
			scenario.attach(bytes, "image/png", "image");	
		}

	}
=======
		
		if(scenario.isFailed()) {
			byte[] bytes = SeleniumHelper.takeScreenshot(testContext.getDriverManager().getDriver());
			scenario.attach(bytes, "image/png", "image");
		}
		
	
	}
	
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474

	
	
	
}




