package com.bora.steps;



import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DashBoardPageSteps {
	TestContext testContext;
	com.bora.pages.DashBoardPage dashBoard;
	
	public DashBoardPageSteps(TestContext passedContext) {
		 testContext =passedContext;
		 dashBoard = testContext.getPages().getDashBoardPage();
		
	}	
	@Then("User Navigate to DashBoard Page")
	public void user_navigate_to_register_page() {
		
		dashBoard.isAtDashBoardPage();
	}


	@Then("User Navigate to Profile Page")
	public void user_navigate_to_profile_page() {

		pages.getDashBoardPage().isAtDashBoardPage();
	}
}
