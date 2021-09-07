package stepDefinitions;


import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import com.bora.managers.WebDriverManager;

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
	public void setupTest() throws IOException  {
		//go to fb website 
		WebDriverManager driverManager = testContext.getDriverManager();
		WebDriver driver = driverManager.getDriver();
		driver.get("https://www.facebook.com");
		
		//testContext.getDriverManager().getDriver().get("https://www.facebook.com");
        //take screnshot 
	TakesScreenshot takeScreenShot =	(TakesScreenshot)driver;
	File screenShotFile = takeScreenShot.getScreenshotAs(OutputType.FILE);
	//save the screenshot 
	File destinationFile = new File("reports/scrrenshots/facebookhome.jpg");
	FileUtils.copyFile(screenShotFile,destinationFile );
	System.out.println();
	
	
	}

	
	@After
	
	public void endTest() {

		testContext.getDriverManager().closeDriver();
	}

}
