package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.bora.helpers.ConfigReader;

public abstract class BasePage {
	

	private WebDriver driver;
	
	public BasePage(WebDriver driver) {
		this.driver = driver;
	}
	WebElement elem= driver.findElement(By.xpath(""));
	public By lnk_logout = By.xpath("//*[text()='Logout']/parent::a");
	public By lnk_register = By.xpath("//nav//a[text()='Register']");
	
	abstract void isAtPage();
	
	public void logout() {
		
		driver.findElement(lnk_logout).click();
	}
	
	public void clickRegisterLink() {
		driver.findElement(lnk_register).click();
		Select s= new Select(elem);
		s.selectByVisibleText("tect");
	}
	
	J
	
	}