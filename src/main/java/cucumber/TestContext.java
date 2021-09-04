package cucumber;

import com.bora.managers.PageObjectManager;

import stepDefinition.WebDriverManager;

public class TestContext {
	
<<<<<<< HEAD
	private WebDriverManager driverManager;
	private PageObjectManager pages;

=======
	
	private WebDriverManager driverManager;
	private PageObjectManager pages;
	
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
	public TestContext() {
		driverManager = new WebDriverManager();
		pages = new PageObjectManager(driverManager.getDriver());
	}
<<<<<<< HEAD

	public WebDriverManager getDriverManager() {
		return driverManager;

	}

=======
	
	public WebDriverManager getDriverManager() {
		return driverManager;
	}
	
>>>>>>> c1480790efb5191e13413ca179ba351bfa4389ed
	public PageObjectManager getPages() {
		return pages;
	}

}
