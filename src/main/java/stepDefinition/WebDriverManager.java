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
		if(driver == null) driver = createDriver();

		return driver;
	}
	
	public WebDriver createDriver() {
		if(environmentType == EnvironmentType.LOCAL) {
			driver = createLocalDriver();
		}else if(environmentType == EnvironmentType.REMOTE) {
			driver =  createRemoteDriver();
		} else { 
			throw new RuntimeException("environment type is not corrct.");
		}
		return driver;
	}
	
	public WebDriver createLocalDriver() {
		if(browserType == BrowserType.CHROME) {
			System.setProperty("webdriver.chrome.driver",ConfigReader.getInstance().getDriverPath());
			driver = new ChromeDriver();
			
		}else if (browserType == BrowserType.FIREFOX) {
			driver = new FirefoxDriver();
			
		} else {
			System.out.println("The browser type:" + "browserType" + "type does not suppoort!");
		}
		return driver;
	}
	
	private WebDriver createRemoteDriver() {
		throw new RuntimeException("Do not run remotely!");
	}
	
	
	public void closeBrowser() {
		driver.close();
		driver.quit();
	}
}
