package com.bora.steps;

import com.bora.pages.DashBoardPage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardPageSteps {

	
	
	TestContext testContext;
	DashBoardPage dashBoard;
	
	public DashBoardPageSteps(TestContext passedContext) {
		testContext = passedContext;
		dashBoard = testContext.getPages().getDashBoardPage();
	}
	
	

	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {

		dashBoard.isAtDashBoardPage();
	}
	
	@When("User Click on Create Profile Link")
	public void user_click_on_create_profile_link() {
		dashBoard.clickCreateProfileButton();
	}

	
	@Then("Verify Profile Created Message displayed")
	public void verify_profile_created_message_displayed() {
		dashBoard.waitForProfileCreatedMessage();
	}

	@When("User Click Delete Account")
	public void user_click_delete_account() {
		dashBoard.deleteMyAccount();
	}

	@Then("Account is Deleted")
	public void account_is_deleted() {
		dashBoard.waitForAccountDeletedMessage();
	}
	
	
	
	
	
}
