package com.bora.helpers;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	
	
	public static void acceptAlert(WebDriver webDriver) {
		webDriver.switchTo().alert().accept();
	}
	
	public static void dismissAlert(WebDriver driver) {
		driver.switchTo().alert().dismiss();
	}
	
	public static void sendKeyAndAcceptAlert(WebDriver driver, String txt) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(txt);
		alert.accept();
	}
	
	public static void waitForElementPresent(WebDriver driver, long timeout, By locator) {
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
	}

	
	
	
	
}
