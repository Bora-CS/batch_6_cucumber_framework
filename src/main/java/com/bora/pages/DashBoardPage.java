package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;

public class DashBoardPage extends BasePage {
	
	private WebDriver driver;
	
	
	public DashBoardPage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}
	
	private By header_ProfilePage = By.xpath("//h1[text()='Dashboard']");
	private By btn_CreateProfile = By.xpath("//a[text()='Create Profile']");
	private By msg_ProfileCreated = By.xpath("//*[text()='Profile Created']");
	private By btn_DeleteMyAccount = By.xpath("//*[normalize-space(text())='Delete My Account']");
	private By msg_AccountDeleted = By.xpath("//*[text()='Your account has been permanantly deleted']");
	
	public void clickCreateProfileButton() {
		driver.findElement(btn_CreateProfile).click();
	}
	
	public void isAtPage() {
		SeleniumHelper.waitForElementPresent(driver, ConfigReader.getInstance().getsmallWait(), header_ProfilePage);
	}
	
	public void waitForProfileCreatedMessage() {
		 SeleniumHelper.waitForElementPresent(driver, ConfigReader.getInstance().getsmallWait(), msg_ProfileCreated);
	}
	
	public void deleteMyAccount() {
		driver.findElement(btn_DeleteMyAccount).click();
		
	}
	
	public void waitForAccountDeletedMessage() {
		
	    SeleniumHelper.waitForElementPresent(driver, 5, msg_AccountDeleted);
	}

}
