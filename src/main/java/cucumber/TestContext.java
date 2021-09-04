package cucumber;

import com.bora.managers.PageObjectManager;
<<<<<<< HEAD

import stepDefinition.WebDriverManager;

public class TestContext {
	
	private WebDriverManager driverManager;
	private PageObjectManager pages;

=======
import com.bora.managers.WebDriverManager;

public class TestContext {
	private WebDriverManager driverManager;
	private PageObjectManager pages;
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
	public TestContext() throws Exception {
		driverManager = new WebDriverManager();
		pages = new PageObjectManager(driverManager.getDriver());
	}
<<<<<<< HEAD

	public WebDriverManager getDriverManager() {
		return driverManager;

	}

	public PageObjectManager getPages() {
		return pages;
	}

=======
	public WebDriverManager getDriverManager() {
		return driverManager;
	}
	public PageObjectManager getPages() {
		return pages;
	}
>>>>>>> 32eb2652764829c7985a77970c25584b10284375
}
