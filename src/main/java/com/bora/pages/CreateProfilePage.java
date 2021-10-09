package com.bora.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;

public class CreateProfilePage extends BasePage {

	private WebDriver driver;

	public CreateProfilePage(WebDriver driver) {
		super(driver);
		this.driver = driver;
	}

	private By header_ProfilePageHeader = By.xpath("//h1[text()='Create Your Profile']");
	private By select_status = By.name("status");
	private By input_company = By.name("company");
	private By input_website = By.name("website");
	private By input_location = By.name("location");
	private By input_skills = By.name("skills");
	private By input_github = By.name("githubusername");
	private By btn_submit = By.xpath("//input[@type='submit']");
	
	public void createProfile(String status, String company, String website, String location, String skills,
			String github) {
		Select select = new Select(driver.findElement(select_status));
		select.selectByVisibleText(status);
		driver.findElement(input_company).sendKeys(company);
		driver.findElement(input_website).sendKeys(website);
		driver.findElement(input_location).sendKeys(location);
		driver.findElement(input_skills).sendKeys(skills);
		driver.findElement(input_github).sendKeys(github);
		driver.findElement(btn_submit).click();
	}

	public void isAtPage() {
		SeleniumHelper.waitForElementPresent(driver, ConfigReader.getInstance().getsmallWait(), header_ProfilePageHeader);
	}

}
