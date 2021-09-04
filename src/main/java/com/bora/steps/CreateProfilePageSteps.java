package com.bora.steps;

<<<<<<< HEAD

=======
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
import com.bora.pages.CreateProfilePage;

import cucumber.TestContext;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
<<<<<<< HEAD
import stepDefinition.WebDriverManager;

public class CreateProfilePageSteps {
	TestContext testContext;

	CreateProfilePage createProfile;

	public CreateProfilePageSteps(TestContext passedContext) {
		testContext = passedContext;
		
		createProfile =testContext.getPages().getCreateProfilePage();

	}
	
	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
		createProfile.isAtCreateProfilePage();
=======

public class CreateProfilePageSteps {

	
	
	TestContext testContext;
	CreateProfilePage profilePage;
	
	public CreateProfilePageSteps(TestContext passedContext) {
		testContext = passedContext;
		profilePage = testContext.getPages().getCreateProfilePage();
	}
	
	

	@Then("User Navigate to Create Your Profile Page")
	public void user_navigate_to_create_your_profile_page() {
		profilePage.isAtCreateProfilePage();
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
	}

	@When("User Enters {string} {string} {string} {string} {string} {string} and Click Submit")
	public void user_enters_profile_infor_and_click_submit(String status, String company, String website,
			String location, String skills, String github) {
<<<<<<< HEAD
		createProfile.createProfile(status, company, website, location, skills, github);
	}

	

=======
		profilePage.createProfile(status, company, website, location, skills, github);
	}
	
	
	
	
	
	
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
}
