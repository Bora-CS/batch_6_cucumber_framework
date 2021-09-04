package stepDefinitions;


import org.openqa.selenium.WebDriver;

import com.bora.managers.PageObjectManager;
import io.cucumber.java.After;
import io.cucumber.java.Before;

//import cucumber.TestContext;

public class Hooks {

	private WebDriver driver;
	public PageObjectManager pageObjectManager;
	
	

	@Before
	public void setupTest() {
	}
 
	@After
	public void endTest() {
		
		driver.quit();
	}

}
