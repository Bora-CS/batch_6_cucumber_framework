package inClass.Framework.task;

import java.util.concurrent.TimeUnit;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bora.helpers.ConfigReader;
import com.bora.managers.PageObjectManager;

import Cucumber.TestContext;
import inClass.Framework.resource.SeleniumFunctionalMethod;
import io.cucumber.java.en.Given;
import stepDefinition.WebDriverManager;

public class SetUpPage {

	static WebDriver driver;

	public static SeleniumFunctionalMethod lib;
	
	TestContext testContext;
	WebDriverManager driverManager;
	PageObjectManager pages;
	
	public SetUpPage(TestContext passedContext) {
		testContext = passedContext;
		driverManager = testContext.getDriverManager();
		pages = testContext.getPages();
	}
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driverManager.getDriver().get(ConfigReader.getInstance().getUrl());	 
		pages.getHomePage().isAtHomePage();
		}
	
	@When("User clicks on Login Button")
	public void user_clicks_login_btn() {
	pages.getLoginPage().clickOnLoginButton();
	}
	
	@Then("User Enter {string} and {string}")
	public void user_enters_userName_and_password() {
	pages.getLoginPage().login(email, password);
	}
	
	@When("User clicks Add Experience Button")
	public void user_clicks_addExperience_btn() {
	pages.getDashBoardPage().clickAddExpirenceButton();
	}
	
	@Then("User Adds {string}{string}{string}{string}{string} and {string} to Experience")
	public void user_addsExperience() {
	pages.getExpirencePage().addExpirence();
	}
	
	@When("User clicks Add Education Button")
	public void user_clicks_addEducation_btn() {
	pages.getDashBoardPage().clickAddEducation();
	}
	
	@Then("User Adds {string}{string}{string}{string}{string} and {string} to Education")
	public void user_addsEducation() {
	pages.getEducationPage().addEducation();
	}
	
}

