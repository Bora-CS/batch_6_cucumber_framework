package inClass.Framework.task;

import inClass.Framework.resource.LoginPage_Locators;

public class LoginPage extends SetUpPage{
	
	
	public void login(String userName, String password) {
		lib.fillTextBox(LoginPage_Locators.userName, userName);
		lib.fillTextBox(LoginPage_Locators.password, password);

		lib.clickElement(LoginPage_Locators.loginButton);
	}

}
