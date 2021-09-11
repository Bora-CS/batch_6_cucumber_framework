package com.bora.helpers;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	
	
	public static void acceptAlert(WebDriver driver) {
		driver.switchTo().alert().accept();
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
	
	public static void takeScreenshot(WebDriver driver, String fileName ) throws IOException {
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File screenShotFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		//Save the screenshot
		
		String timeStamp = UtilityLibrary.getTimeStamp();
		
		String screenshotPath = ConfigReader.getInstance().getScreenshotPath() + 
				fileName + "-" +  timeStamp + ".jpg"; 
		File destinationFile = new File(screenshotPath);
		FileUtils.copyFile(screenShotFile,destinationFile);
	}

	public static byte[] takeScreenshot(WebDriver driver) {
		TakesScreenshot takeScreenshot = 
				((TakesScreenshot)driver);
		byte[] bytes = takeScreenshot.getScreenshotAs(OutputType.BYTES);
		return bytes;
	}
	public static void selectDropdown (WebDriver driver , By locator, int index) {
		Select select = new Select( driver.findElement(locator));
		
	}
	public static void selectDropdownByVisibleName (WebDriver driver , By locator, String visiableText) {
		Select select = new Select( driver.findElement(locator));
		select.selectByValue(visiableText);
		
	}
	
	public static void selectDropdownByValue (WebDriver driver , By locator, String value) {
		Select select = new Select( driver.findElement(locator));
		select.selectByValue(value);
		
	}
	public static Set<String> getWindowHandles(WebDriver driver) {
		return driver.getWindowHandles();
	}
	// String mainWindowHandle = ChromeDriver.getWindowHandle();
    // Set<String> allWindowHandles = driver.getWindowHandles();
   //
	public static String getWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}  	
	
	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
	public static void switchToFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	public static void hoverElement(WebDriver driver , By locator) {
		
		getActions(driver).moveToElement(driver.findElement(locator)).build().perform();
	}
	//drag and drop 
	public static void 
	
}
