package cucumber;

import org.openqa.selenium.WebDriver;

import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

public class TestContext {
	
	private WebDriverManager driverManager;
	private PageObjectManager pages; 
	 
	
	public TestContext() throws Exception {
		driverManager = new WebDriverManager();
		WebDriver driver =  driverManager.getDriver();
		pages = new PageObjectManager(driver);
	}
	
	public WebDriverManager getDriverManager() {
		return driverManager;
	}
	
	public PageObjectManager getPages() {
		return pages;
	}
}
