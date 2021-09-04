package inClass.Framework.task;


import org.junit.Test;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;

import com.bora.helpers.ConfigReader;

import io.cucumber.java.After;
import io.cucumber.java.Before;

import Cucumber.TestContext;

public class TestCase1 {

	TestContext testContext;
	private WebDriver driver;

	public TestCase1(TestContext passedContext) {
		testContext = passedContext;
		driver = testContext.getDriverManager().getDriver();
	}

	@Before
	public void setupTest() {
		
		driver.get(ConfigReader.getInstance().getUrl());
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		@Test
		
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
	
	@After
	public void endTest() {
		driver.close();
		driver.quit();
	}

}

