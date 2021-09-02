package Cucumber;

import com.bora.managers.PageObjectManager;

import stepDefinition.WebDriverManager;

public class TestContext {

	private WebDriverManager driverManager;
	private PageObjectManager pages;
	
	public TestContext() {
		driverManager = new WebDriverManager();
		pages = new PageObjectManager(driverManager.getDriver());
	}
	
	public WebDriverManager getDriverManager() {
		return driverManager;
	}
	
	public PageObjectManager getPages() {
		return pages;
	}
}
