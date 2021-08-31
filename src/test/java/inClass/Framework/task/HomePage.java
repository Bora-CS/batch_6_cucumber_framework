package inClass.Framework.task;

import org.openqa.selenium.WebDriver;

import inClass.Framework.resource.HomePage_Locators;

public class HomePage extends SetUpPage {

	public void clickOnLoginButton(WebDriver driver) {
		lib.clickElement(HomePage_Locators.loginButton);
	}

}
