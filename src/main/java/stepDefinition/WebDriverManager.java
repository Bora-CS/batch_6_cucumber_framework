package stepDefinition;

import java.util.concurrent.TimeUnit;

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

		browserType = ConfigReader.getInstance().getBrowserName();
		environmentType = ConfigReader.getInstance().getEnvironmentType();

	}

	public WebDriver getDriver() throws Exception {
		if (driver == null)
			driver = createDriver();

		return driver;
	}

	private WebDriver createDriver() throws Exception {
		switch (environmentType) {
		case LOCAL:
			driver = createLocalDriver();

			break;
		case REMOTE:
			driver = createRemotDriver();

			break;
		}

		return driver;

	}

	private WebDriver createLocalDriver() throws Exception {
		switch (browserType) {
		case CHROME:
			System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath()+"chromedriver");
			driver = new ChromeDriver();
			break;
		case FIREFOX:
			System.setProperty("webdriver.gecko.driver", ConfigReader.getInstance().getDriverPath()+"gechodriver");
			driver = new FirefoxDriver();
			break;
		case IE:
			throw new Exception("IE brower is not supported or no long used.");
		default:
			throw new Exception("Brower type is not supoorted, please check the configreader property.");
		}
		if(ConfigReader.getInstance().getBrowserMaximize()) {
			driver.manage().window().maximize();
		}
		if(ConfigReader.getInstance().getImplicityWaitTime()) {
			driver.manage().timeouts().implicitlyWait(ConfigReader.getInstance().getImplicityWaitTime(), TimeUnit.SECONDS)
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
