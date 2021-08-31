package inClass.Framework.utilityLibrary;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SeleniumFunctionalMethod {

	WebDriver driver = null;
	final boolean Demo = false;

	public SeleniumFunctionalMethod(WebDriver passedDriver) {
		this.driver = passedDriver;

	}

	public void openUrl(String url) {
		driver.get(url);
	}

	public void clickElement(By locator) {
		driver.findElement(locator).click();
	}

	public void fillTextBox(By locator, String text) {
		driver.findElement(locator).sendKeys(text);
	}

}
