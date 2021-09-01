package com.bora.steps;

import java.util.List;

import com.bora.pages.LoginPage;

import cucumber.TestContext;
import io.cucumber.datatable.DataTable;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageSteps {

	TestContext testContext;
	LoginPage login;

	public LoginPageSteps(TestContext passedContext) {
		testContext = passedContext;
		login = testContext.getPages().getLoginPage();
	}

	@Then("User Navigate to Login Page")
	public void user_navigate_to_login_page() {

		login.isAtLoginPage();
	}

	@When("User Enter {string} and {string}")
	public void user_enter_user_name_and_password(String userName, String password) {
		login.login(userName, password);
	}

	@When("User Enter Username and Password")
	public void user_enter_username_and_password(DataTable table) {
		List<List<String>> datas = table.asLists();

		List<String> firstRow = datas.get(0);
		String email = firstRow.get(0);
		String password = firstRow.get(1);

		login.login(email, password);
	}

}
