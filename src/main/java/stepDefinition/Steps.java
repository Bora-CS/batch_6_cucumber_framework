package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.pages.BasePage;

<<<<<<< HEAD
import Cucumber.TestContext;
=======
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
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
=======
public class Steps{
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed


	
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;
	
	public Steps(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}
	
	
	












}
