package com.bora.helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
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

	public static void takeScreenShot(WebDriver driver, String fileName) throws IOException {
		String timeStamp = UtilityLibrary.getTimeStamp();
		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
		File screenshotFile  = takeScreenshot.getScreenshotAs(OutputType.FILE);
		
		String screenshotPath = ConfigReader.getInstance().getScreenshotPath() +
				fileName + "-" + timeStamp + ".jpg";
		File destinationFile = new File(screenshotPath);
		FileUtils.copyFile(screenshotFile, destinationFile);
	}
	
}
