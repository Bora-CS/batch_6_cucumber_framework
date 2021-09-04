package inClass.Framework.task;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPage extends SetUpPage{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By email = By.name("email");
	private By password = By.name("password");
	private By loginButton = By.xpath("//*[@value='Login']");
	
	@When("User Enter {string} and {string}")
	public void login(String email, String password) {
		lib.fillTextBox(email, email);
		lib.fillTextBox(password, password);
		lib.clickElement(loginButton);	
	}
	
	@Then("User clicks on Login Button")
	public void clickOnLoginButton(By locator) {
		driver.findElement(loginButton).click();
	}
	
}
