package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.SeleniumHelper;

public class DashBoardPage extends BasePage {
	
	private WebDriver driver;
	
	
	public DashBoardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By header_ProfilePage = By.xpath("//h1[text()='Dashboard']");
	private By btn_CreateProfile = By.xpath("//a[text()='Create Profile']");
	
	public void clickCreateProfileButton() {
		driver.findElement(btn_CreateProfile).click();
	}
	
	public void isAtProfilePage() {
		SeleniumHelper.waitForElementPresent(driver, 5, header_ProfilePage);
		
	}
	
	public void deltetMyAccount() {
		driver.findElement(btn)
		
	}
	public void 
	

}