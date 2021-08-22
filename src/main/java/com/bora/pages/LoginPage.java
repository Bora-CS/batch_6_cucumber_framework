package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage{
	
	private WebDriver driver;
	
	public LoginPage(WebDriver driver) {
		super(driver);
		this.driver = driver; 
	}
	
	private By header_LoginPage = By.xpath("//h1[text()='Sign In']");
	private By input_Email = By.name("email");
	private By input_Password = By.name("password");
	private By btn_Login = By.xpath("//input[@type='submit' and @value='Login']");
	private By deletedAccountMessage = By.xpath("//*[text()='Your account has been permanantly deleted']");
	
	public void isAtLoginPage() {
		WebDriverWait wait = new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.presenceOfElementLocated(header_LoginPage));
		
	}
	
	public void login(String userName, String password) {
		driver.findElement(input_Email).sendKeys(userName);
		driver.findElement(input_Password).sendKeys(password);
		driver.findElement(btn_Login).click();
		
	}
	
	public void verifyDeletedAccountMessage() {
		WebDriverWait wait  = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(deletedAccountMessage));
	}
}
