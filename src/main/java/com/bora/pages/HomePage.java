package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;

public class HomePage extends BasePage{
	
	private WebDriver driver;
	
	public HomePage(WebDriver driver, ConfigReader configReader) {
		super(driver,configReader);
		this.driver = driver;
	}
	


	private By header_HomePage = By.xpath("//h1[text()='BoraTech']");
	private By lnk_Login = By.xpath("//section[@class='landing']//a[text()='Login']");
	
	public void isAtHomePage() {
		SeleniumHelper.waitForElementPresent(driver, 5, header_HomePage);
	}
	
	public void clickLoginLink() {
		driver.findElement(lnk_Login).click();
	}
	

}
