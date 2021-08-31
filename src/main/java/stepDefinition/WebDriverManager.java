package stepDefinition;

import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.bora.enums.BrowserType;
import com.bora.enums.EnvironmentType;
import com.bora.helpers.ConfigReader;


public class WebDriverManager {

	private WebDriver driver;

	private BrowserType browserType;
	private EnvironmentType environmentType;

	public WebDriverManager() {

		browserType = BrowserType.CHROME;
		environmentType = EnvironmentType.LOCAL;

	}

	public WebDriver getDriver() {
		if (driver == null)
			driver = createdriver();

		return driver;
	}

	private WebDriver createdriver() {

		if (environmentType == EnvironmentType.LOCAL) {
			driver = createLocalDriver();
		} else if (environmentType == EnvironmentType.REMOTE) {
			driver = createRemotDriver();
		} else {
			throw new RuntimeException("environment type is not correct!");
		}
		return driver;

	}

	private WebDriver createLocalDriver() {
		if (browserType == BrowserType.CHROME) {
			System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath());
			driver = new ChromeDriver();
		} else if (browserType == BrowserType.FIREFOX) {
			System.setProperty("webdriver.gecko.driver", ConfigReader.getInstance().getDriverPath());
			driver = new FirefoxDriver();
		} else {
			System.out.println("The browser type: " + browserType + " does not support!");
		}
		return driver;
	}

	private WebDriver createRemotDriver() {
		throw new RuntimeException("Do not run remotely!!");
	}
	
	public void closeDriver() {
		driver.close();
		driver.quit();
	}
	
}
