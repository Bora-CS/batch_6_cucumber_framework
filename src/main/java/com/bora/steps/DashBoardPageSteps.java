package com.bora.steps;

import com.bora.pages.DashBoardPage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardPageSteps {
	public class CreateProfilePage {
		TestContext testContext;
		DashBoardPage dashBoard;

		public CreateProfilePage(TestContext passedContext) {
			testContext = passedContext;
			dashBoard = testContext.getPages().getDashBoardPage();

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
}
