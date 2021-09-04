package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;
import com.bora.pages.BasePage;

<<<<<<< HEAD
import Cucumber.TestContext;
=======
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

<<<<<<< HEAD
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

	PageObjectManager pageObjectManager;

	@Given("User is on Home Page")
	public void user_is_on_home_page() throws Exception {

		WebDriverManager driverManager = new WebDriverManager();
		driver = driverManager.getDriver();

		pageObjectManager = new PageObjectManager(driver);

		driver.get(ConfigReader.getInstance().getUrl());
		pageObjectManager.getHomePage().isAtHomePage();
=======
public class Steps{

>>>>>>> 32eb2652764829c7985a77970c25584b10284375

	
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;
	
	public Steps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}
	
	
	












}
