package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class DeleteAccount extends BasePage {
	private WebDriver driver;

	public DeleteAccount(WebDriver driver) {
		super(driver);
		this.driver = driver;

	}

	private By deleteAccount = By.xpath("//*[normalize-space(text())='Delete My Account']");
	private By AccountDeleted = By.xpath("//*[text()='Your account has been permanantly deleted']");

	public void ClickDeleteAccount() {
		driver.findElement(deleteAccount).click();
	}

	public void AccountIsDeleted() {
		WebDriverWait wait = new WebDriverWait(driver, 5);
		wait.until(ExpectedConditions.presenceOfElementLocated(AccountDeleted));
	}

	public void AcceptTheAlert() {
		driver.switchTo().alert().accept();
	}
}