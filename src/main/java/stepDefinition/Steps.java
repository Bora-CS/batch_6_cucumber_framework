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
import com.bora.pages.CreateProfilePage;
import com.bora.pages.DashBoardPage;
import com.bora.pages.DeleteAccount;
import com.bora.pages.RegisterPage;

import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	static WebDriver driver;
	public static String url = "https://boratech.herokuapp.com/";

	HomePage homePage;
	LoginPage loginPage;
	DashBoardPage dashBoardPage;
	RegisterPage registerPage;
	CreateProfilePage createProfilePage;
	DeleteAccount deleteAccount;

	@Given("User is on Home Page")
	public void user_is_on_home_page() {
		System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver");
		driver = new ChromeDriver();
		driver.get(url);

		homePage = new HomePage(driver);
		homePage.isAtHomePage();

	}

	@Given("User click on Login button")
	public void user_click_on_login_button() {
		homePage.clickLoginLink();
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {
		loginPage = new LoginPage(driver);
		loginPage.isAtLoginPage();
	}

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName, String password) {
		loginPage.login(userName, password);
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(DataTable table) {
		List<List<String>> datas = table.asLists();

		List<String> firstRow = datas.get(0);
		String email = firstRow.get(0);
		String password = firstRow.get(1);

		loginPage.login(email, password);
	}

	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.isAtProfilePage();
	}

	@When("User Click on Logout button")
	public void user_click_on_logout_button() {
		homePage.logout();
	}

	@Then("Browser is Quited")
	public void browser_is_quited() {
		driver.quit();

	}

	@When("User click on Register Link")
	public void user_click_on_register_link() {
		homePage.clickRegisterLink();
	}

	@Then("User Navigate to Register Page")
	public void user_navigate_to_register_page() {

		registerPage = new RegisterPage(driver);
		registerPage.isAtRegisterPage();
	}

	@When("User enter {string} {string} {string} and click Register button")
	public void user_enter_and(String name, String email, String password) {
		registerPage.registerUser(name, email, password);
	}

	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
		dashBoardPage = new DashBoardPage(driver);
		dashBoardPage.clickCreateProfileButton();
	}

	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
		createProfilePage = new CreateProfilePage(driver);
		createProfilePage.isAtCreateProfilePage();
	}

	@When("User Enters {string} {string} {string} {string} {string} {string} and Click Submit")
	public void user_enters_profile_infor_and_click_submit(String status, String company, String website,
			String location, String skills, String github) {
		createProfilePage.createProfile(status, company, website, location, skills, github);
	}

	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
		createProfilePage.Verifydisplay();
	}

	@When("User Click Delete Account")
	public void user_click_delete_account() {
		deleteAccount = new DeleteAccount(driver);
		deleteAccount.ClickDeleteAccount();

	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
		deleteAccount.AccountIsDeleted();

	}

	@When("User accept the alert")
	public void user_accept_the_alert() {
		deleteAccount.AcceptTheAlert();
	}

}
