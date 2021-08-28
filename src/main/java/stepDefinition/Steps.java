package stepDefinition;

import java.util.HashSet;
import java.util.List;
import java.util.Random;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.pages.HomePage;
import com.bora.pages.LoginPage;
import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;
import com.bora.pages.CreateProfilePage;
import com.bora.pages.DashBoardPage;
import com.bora.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	static WebDriver driver;
	
	PageObjectManager pageObjectManager;
	
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
	

		System.out.println("****before driver class");
		WebDriverManager driverManager = new WebDriverManager();
		System.out.println("****before create driver");
		driver = driverManager.getDriver();
		System.out.println("****after create driver");
		System.out.println("*******driver value: "+driver.toString());
		
//		 pageObjectManager = new PageObjectManager(driver);
//		 
//		//driver.get(configReader.getUrl());
//		pageObjectManager.getHomePage().isAtHomePage();
		
	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		pageObjectManager.getHomePage().clickLoginLink();
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		pageObjectManager.getLoginPage().isAtLoginPage();
	}

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName,String password ) {
		pageObjectManager.getLoginPage().login(userName, password);
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(DataTable table) {
		List<List<String>> datas = table.asLists();
		
		List<String> firstRow = datas.get(0);
		String email = firstRow.get(0);
		String password = firstRow.get(1);
		
		
		pageObjectManager.getLoginPage().login(email, password);
	}
	
	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		
		pageObjectManager.getDashBoardPage().isAtDashBoardPage();
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		pageObjectManager.getHomePage().logout();
	} 
	
	@Then("Browser is Quited")
	public void browser_is_quited() {
		driver.quit();

	}
	
	@When("User click on Register Link")
	public void user_click_on_register_link() {
		pageObjectManager.getHomePage().clickRegisterLink();
	}
	
	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {
		
		pageObjectManager.getRegisterPage().isAtRegisterPage();
	}
	
	

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		pageObjectManager.getRegisterPage().registerUser(name, email, password);
	}
	
	
	
	
	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
		pageObjectManager.getDashBoardPage().clickCreateProfileButton();
	}

	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
	  pageObjectManager.getCreateProfilePage().isAtCreateProfilePage();
	}

	@When("User Enters {string} {string} {string} {string} {string} {string} and Click Submit")
	public void user_enters_profile_infor_and_click_submit(String status, String company, String website, String location, String skills, String github) {
		pageObjectManager.getCreateProfilePage().createProfile(status, company, website, location, skills, github);
	}

	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
	   pageObjectManager.getDashBoardPage().waitForProfileCreatedMessage();
	}
	
	@When("User Click Delete Account")
	public void user_click_delete_account() {
	    pageObjectManager.getDashBoardPage().deleteMyAccount();
	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
		pageObjectManager.getDashBoardPage().waitForAccountDeletedMessage();
	}
	
	@When("User accept the alert")
	public void user_accept_the_alert() {
		SeleniumHelper.acceptAlert(driver);
	}
	
	
	
	
	
}
