package inClass.Framework.task;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import inClass.Framework.resource.SeleniumFunctionalMethod;

public class SetUpPage {

	static WebDriver driver;
	private String url = "https://boratech.herokuapp.com/";

	public static SeleniumFunctionalMethod lib;

	public static HomePage home = new HomePage();
	public static LoginPage login = new LoginPage();
	public static Dashboard dashboard = new Dashboard();
	public static ExpirencePage expirence = new ExpirencePage();
	public static EducationPage edu = new EducationPage();

	@Before
	public void startTest() {
		setUpDriver();

		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		lib.openUrl(url);
	}

	@After
	public void endTest() {
		driver.close();
		driver.quit();
	}


	private void setUpDriver() {
		String os = System.getProperty("os.name");
		String driverPath = "";
		if (os.toLowerCase().startsWith("mac")) {
			driverPath = "src/test/resources/drivers/chromedriver";
		} else if (os.toLowerCase().startsWith("windows")) {
			driverPath = "src/test/resources/drivers/chromedriver.exe";
		}

		driver = new ChromeDriver();
	}
}
