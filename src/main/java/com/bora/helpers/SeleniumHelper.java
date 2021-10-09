package com.bora.helpers;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Set;
<<<<<<< HEAD
=======
import java.util.concurrent.TimeUnit;
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
<<<<<<< HEAD
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
=======
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SeleniumHelper {
	public static void main(String[] args) {
		String phoneNumber = "571-6495-9702";
		boolean isPhonePattern = phoneNumber.matches("^[0-9]{3}-[0-9]{3}-[0-9]{4}$");
		System.out.println(isPhonePattern);
	}
	
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
		driver.manage().timeouts().implicitlyWait(0	, TimeUnit.SECONDS);
		WebDriverWait wait = new WebDriverWait(driver, timeout);
		wait.until(ExpectedConditions.presenceOfElementLocated(locator));
		driver.manage().timeouts().implicitlyWait(ConfigReader.getInstance().getImplicityWaitTime()	, TimeUnit.SECONDS);
		
	}
	
	public static void takeScreenshot(WebDriver driver, String fileName ) throws IOException {
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File screenShotFile = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		// when using in program, will use Output.byte to be read by JVM
		//Save the screenshot
		
		String timeStamp = UtilityLibrary.getTimeStamp();
		
		String screenshotPath = ConfigReader.getInstance().getScreenshotPath() + 
				fileName + "-" +  timeStamp + ".jpg"; 
		File destinationFile = new File(screenshotPath);
		FileUtils.copyFile(screenShotFile,destinationFile);
	}
<<<<<<< HEAD
	
	public static byte[] takeScreenshot(WebDriver driver) {
		TakesScreenshot takeScreenshot = 
				((TakesScreenshot)driver);
		byte[] bytes = takeScreenshot.getScreenshotAs(OutputType.BYTES);
		return bytes;
	}
	
	//Task1 Create overloading methods to handle Select Dropdown
	// three methods 
	// Select slect dropdown with index
	// Select slect dropdown with value
	// Select slect dropdown with visibleText
=======
	
	public static byte[] takeScreenshot(WebDriver driver) {
		TakesScreenshot takeScreenshot = 
				((TakesScreenshot)driver);
		byte[] bytes = takeScreenshot.getScreenshotAs(OutputType.BYTES);
		return bytes;
	}

	public static void selectDropdownByIndex(WebDriver driver, By locator, int index) {
		Select select = new Select(driver.findElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropdownByVisibleText(WebDriver driver, By locator, String visibleText) {
		Select select = new Select(driver.findElement(locator));
		select.selectByVisibleText(visibleText);
	}
	
	public static void selectDropdownByValue(WebDriver driver, By locator, String value) {
		Select select = new Select(driver.findElement(locator));
		select.selectByValue(value);
	}
	
	public static String getWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}
	
	public static Set<String> getWindowHandles(WebDriver driver){
		return driver.getWindowHandles();
	}
	
	public static void switchToWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
		
	}
	
	public static void switchToFrame(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	
	public static void switchToFrame(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public static void switchToFrame(WebDriver driver, By locator) {
		driver.switchTo().frame(driver.findElement(locator));
	}
	
	public static void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public static void minimizeWindow(WebDriver driver, int width , int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	//hover over 
	public static void hoverElement(WebDriver driver, By locator) {
		getActions(driver).moveToElement(driver.findElement(locator)).build().perform();
	}
	
	//double click
	public static void doubleClickElement(WebDriver driver, By locator) {
		getActions(driver).doubleClick(driver.findElement(locator)).build().perform();
	}
	
	//context click
	public static void contextClickElement(WebDriver driver, By locator) {
		getActions(driver).contextClick(driver.findElement(locator)).build().perform();
	}
	
	
	//drag and drop
	
	public static void dragAndDropElement(WebDriver driver, By drag, By drop) {
		getActions(driver).dragAndDrop(driver.findElement(drag), driver.findElement(drop)).build().perform();
	}
	
	private static Actions getActions(WebDriver driver) {
		return new Actions(driver);
	}
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474
	
	public static void selectDropDownByIndex(WebDriver driver, By locator, int index) {
		Select select = new Select(driver.findElement(locator));
		select.selectByIndex(index);
	}
	
	public static void selectDropDownByValue(WebDriver driver, By locator, String value) {
			Select select = new Select(driver.findElement(locator));
			select.selectByValue(value);
	}
	
	public static void selectDropDownByText(WebDriver driver, By locator, String visibleText) {
				Select select = new Select(driver.findElement(locator));
				select.selectByVisibleText(visibleText);
	}
	
	public static String getWindowHandle(WebDriver driver) {
		return driver.getWindowHandle();
	}
	
	public static Set<String> getWindowHandles(WebDriver driver) {
		return driver.getWindowHandles();
		
	}
	
	public static void switchIntoWindow(WebDriver driver, String windowHandle) {
		driver.switchTo().window(windowHandle);
	}
	
	public static void swithIntoIFrameByName(WebDriver driver, String name) {
		driver.switchTo().frame(name);
	}
	
	public static void swithIntoIFrameByIndex(WebDriver driver, int index) {
		driver.switchTo().frame(index);
	}
	
	public static void swithIntoIFrameByWebElement(WebDriver driver, By locator) {
		driver.switchTo().frame(driver.findElement(locator));
	}
	
	public static void switchToDefaultContent(WebDriver driver) {
		driver.switchTo().defaultContent();
	}
	
	public static void minimizeWindow(WebDriver driver, int width, int height) {
		driver.manage().window().setSize(new Dimension(width, height));
	}
	
	public static void hoverElement(WebDriver driver, By locator) {
		getActions(driver).moveToElement(driver.findElement(locator)).build().perform();;
	}
	
	public static void doubleClick(WebDriver driver, By locator) {
		getActions(driver).doubleClick(driver.findElement(locator)).build().perform();
	}
	
	public static void contextClickElement(WebDriver driver, By locator) {
		getActions(driver).contextClick(driver.findElement(locator)).build().perform();
	}
	
	public static void dragAndDropElement(WebDriver driver, By drag, By drop) {
		getActions(driver).dragAndDrop(driver.findElement(drag), driver.findElement(drop)).build().perform();
	}
	
	private static Actions getActions(WebDriver driver) {
			return new Actions(driver);
	}
}
