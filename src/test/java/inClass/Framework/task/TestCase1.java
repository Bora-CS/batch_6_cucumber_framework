package inClass.Framework.task;

import org.junit.Test;

public class TestCase1 extends SetUpPage {


	@Test
	public void firstTest() {

		home.clickOnLoginButton();

		// enter userName / Password
		login.login(BoraTech_TestData.userName_testAccount, BoraTech_TestData.password_testAccount);

		// Add Experience
		dashboard.clickAddExpirenceButton();

		// Experience Page
		expirence.addExpirence();

		dashboard.clickAddEducation();

		// add Education Page
		edu.addEducation();

	}

}
