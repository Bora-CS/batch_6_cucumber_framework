package com.bora.steps;

import org.openqa.selenium.WebDriver;

import com.bora.managers.PageObjectManager;

import cucumber.TestContext;
import io.cucumber.java.After;
import io.cucumber.java.Before;


	private TestContext testContext;

	public class Hooks(TestContext testContext){
			this.testContext = testContext;
	}

	@Before
	public void setupTest() throws Exception {

	}

	@After
	public void endTest() {
		testContext.getDriverManager().closeDriver();;
	}

}
