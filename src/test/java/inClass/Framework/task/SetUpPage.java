package inClass.Framework.task;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bora.managers.PageObjectManager;

import inClass.Framework.resource.SeleniumFunctionalMethod;
import io.cucumber.java.en.Given;
import stepDefinition.WebDriverManager;

public class SetUpPage {

	static WebDriver driver;

	public static SeleniumFunctionalMethod lib;
	
	PageObjectManager pageObjectManager;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	
	//	System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath());
	//	driver = new ChromeDriver();
		WebDriverManager driverManager = new WebDriverManager();
		driver = driverManager.getDriver();
		 pageObjectManager = new PageObjectManager(driver);
		 
		//driver.get(configReader.getUrl());
		pageObjectManager.getHomePage().isAtHomePage();
	}

	@Before
	public void startTest() {
		setUpDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		lib.openUrl(url);
	}

	@After
	public void endTest() {
		driver.close();
		driver.quit();
	}


	private void setUpDriver() {
		String os = System.getProperty("os.name");
		String driverPath = "";
		if (os.toLowerCase().startsWith("mac")) {
			driverPath = "src/test/resources/drivers/chromedriver";
		} else if (os.toLowerCase().startsWith("windows")) {
			driverPath = "src/test/resources/drivers/chromedriver.exe";
		}

		driver = new ChromeDriver();
	}
}
