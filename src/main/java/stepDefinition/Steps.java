package stepDefinition;

import java.util.List;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;
import com.bora.managers.PageObjectManager;

import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
     TestContext testContext;
     WebDriverManager driverManager;
     PageObjectManager pages;
     
     public Steps(TestContext passedContext) {
    	 testContext = passedContext;
    	 driverManager = testContext.getDriverManager();
    	 pages = testContext.getPages();
     }
    
     
     
	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		driverManager.getDriver().get(ConfigReader.getInstance().getUrl());
		pages.getHomePage().isAtHomePage();

	}
	

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		pages.getHomePage().clickLoginLink();
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		pages.getLoginPage().isAtLoginPage();
	}

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName, String password) {
		pages.getLoginPage().login(userName, password);
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(DataTable table) {
		List<List<String>> datas = table.asLists();

		List<String> firstRow = datas.get(0);
		String email = firstRow.get(0);
		String password = firstRow.get(1);

		pages.getLoginPage().login(email, password);
	}

	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {

		pages.getDashBoardPage().isAtDashBoardPage();
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		pages.getHomePage().logout();
	}

	@Then("Browser is Quited")
	public void browser_is_quited() {
		driverManager.closeDriver();

	}

	@When("User click on Register Link")
	public void user_click_on_register_link() {
		pages.getHomePage().clickRegisterLink();
	}

	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {

		pages.getRegisterPage().isAtRegisterPage();
	}

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		pages.getRegisterPage().registerUser(name, email, password);
	}

	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
		pages.getDashBoardPage().clickCreateProfileButton();
	}

	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
		pages.getCreateProfilePage().isAtCreateProfilePage();
	}

	@When("User Enters {string} {string} {string} {string} {string} {string} and Click Submit")
	public void user_enters_profile_infor_and_click_submit(String status, String company, String website,
			String location, String skills, String github) {
		pages.getCreateProfilePage().createProfile(status, company, website, location, skills, github);
	}

	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
		pages.getDashBoardPage().waitForProfileCreatedMessage();
	}

	@When("User Click Delete Account")
	public void user_click_delete_account() {
		pages.getDashBoardPage().deleteMyAccount();
	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
		pages.getDashBoardPage().waitForAccountDeletedMessage();
	}

	@When("User accept the alert")
	public void user_accept_the_alert() {
		SeleniumHelper.acceptAlert(driverManager);
	}

}
