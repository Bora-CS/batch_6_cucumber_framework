package stepDefinitions;


import org.openqa.selenium.WebDriver;
import com.bora.managers.PageObjectManager;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;


//import cucumber.TestContext;

public class Hooks {

	TestContext testContext ;
	
	public Hooks(TestContext testContext){
		this.testContext = testContext;
	}

	@Before
	public void setupTest()  {

	}

	@After
	public void endTest() {

		testContext.getDriverManager().closeDriver();
	}

}
