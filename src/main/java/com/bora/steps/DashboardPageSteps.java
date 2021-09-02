package com.bora.steps;

import com.bora.pages.DashBoardPage;

import Cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashboardPageSteps {
	
	TestContext testContext;
	
	DashBoardPage dashboard; 
	
	public DashboardPageSteps(TestContext passedContext) {
		testContext = passedContext;
		
		dashboard = testContext.getPages().getDashBoardPage();

	}
	
	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {
		
		dashboard.isAtDashBoardPage();
	}
	
	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
		dashboard.clickCreateProfileButton();
	}
	
	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
	   dashboard.waitForProfileCreatedMessage();
	}
	
	@When("User Click Delete Account")
	public void user_click_delete_account() {
	    dashboard.deleteMyAccount();
	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
		dashboard.waitForAccountDeletedMessage();
	}
	
}

