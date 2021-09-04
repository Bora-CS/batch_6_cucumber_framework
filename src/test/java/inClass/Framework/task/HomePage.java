package inClass.Framework.task;

import org.openqa.selenium.By;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class HomePage extends SetUpPage{

	private WebDriver driver; 
	
	public HomePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By loginButton = By.className("btn-light");
	
	@Given("User is on Home Page")
	public void clickOnLoginButton() {
		lib.clickElement(loginButton);
	}
	
}
