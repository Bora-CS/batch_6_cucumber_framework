package stepDefinitions;


import java.io.File;
import java.io.IOException;
import java.sql.Driver;
import java.sql.Timestamp;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bora.helpers.SeleniumHelper;
//import com.bora.managers.PageObjectManager;
//import com.bora.managers.WebDriverManager;
//import com.bora.pages.BasePage;
//
//import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;


//import cucumber.TestContext;

public class Hooks extends A{

	public static void main(String[] args) {
		 A a  =  new Hooks();
		 System.out.println(a.getText());
		 a.hello();
	}
//	TestContext testContext ;
	
//	public Hooks(TestContext testContext){
//		this.testContext = testContext;
//	}

	@Override
	void hello() {
		System.out.println("Hello from hooks");
		
	}

//	@Before
//	public void setupTest() throws IOException  {
//
//		//Go to face book website
//		WebDriverManager driverManager = testContext.getDriverManager();
//		WebDriver driver = driverManager.getDriver();
//		driver.get("https://www.facebook.com");
//		SeleniumHelper.takeScreenshot(driver, "facebookhome");
//		System.out.println();
//	}
//
//	@After
//	public void endTest() {
//
//		testContext.getDriverManager().closeDriver();
//	}
//	
//	@AfterStep
//	public void afterStep(Scenario scenario) {
//		
//		if(scenario.isFailed()) {
//			byte[] bytes = SeleniumHelper.takeScreenshot(testContext.getDriverManager().getDriver());
//			scenario.attach(bytes, "image/png", "image");
//		}
//		
//	
//	}
//	

	
	
	
}

abstract class A {
	abstract void hello();
	
	public String getText() {
		return "Hello World";
	}
}


