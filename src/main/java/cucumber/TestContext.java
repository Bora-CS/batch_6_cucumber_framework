package cucumber;

import com.bora.managers.PageObjectManager;
import com.bora.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager driverManager;
	private PageObjectManager pages;
	public TestContext() throws Exception {
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
