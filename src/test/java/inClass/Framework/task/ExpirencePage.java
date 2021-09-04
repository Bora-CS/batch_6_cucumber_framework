package inClass.Framework.task;

import org.openqa.selenium.By;

import inClass.Framework.resource.ExpirencePage_Locators;
import io.cucumber.java.en.Then;

public class ExpirencePage extends SetUpPage{
	
	private Webdriver driver;
	
	public ExpirencePage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By jobTtile = By.xpath("//input");
	private By company = By.xpath("(//input)[2]");
	private By location = By.xpath("(//input)[3]");
	private By fromDate = By.name("from");
	private By toDate = By.name("to");
	private By jobDescription = By.xpath("//textarea");
	private By submitButton = By.cssSelector(".btn.btn-primary.my-1");
	
	
	@Then("User Adds {string}{string}{string}{string}{string} and {string} to Experience")
	public void addExpirence(By locator, String jobTitle, String company, String location, String fromDate, String toDate, String jobDescription) {
		lib.fillTextBox(jobTitle, jobTitle);

		lib.fillTextBox(company, company);

		lib.fillTextBox(location, location);

		lib.fillTextBox(fromDate, fromDate);

		lib.fillTextBox(toDate, toDate);

		lib.fillTextBox(jobDescription, jobDescription);

		lib.clickElement(submitButton);
	}

}
