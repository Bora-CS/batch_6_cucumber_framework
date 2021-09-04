package inClass.Framework.task;

import org.openqa.selenium.By;

import inClass.Framework.resource.EducationPage_Locators;
import io.cucumber.java.en.Then;

public class EducationPage extends SetUpPage {
	
	private WebDriver driver;
	
	public EducationPage(WebDriver driver) {
		this.driver = driver;
	}
	
	private By schoolName= By.xpath("//input");
	private By degree= By.xpath("(//input)[2]");
	private By fieldOfStudy= By.xpath("(//input)[3]");
	private By fromDate= By.name("from");
	private By toDate= By.name("to");
	private By description= By.xpath("//textarea");
	private By submitButton= By.cssSelector(".btn.btn-primary.my-1");

	@Then("User Adds {string}{string}{string}{string}{string} and {string} to Education")
	public void addEducation(By locator, String school, String degreeCertificate, String fieldOfStudy, String fromDate, String toDate, String programDescription) {
		lib.fillTextBox(schoolName, school);

		lib.fillTextBox(degree, degreeCertificate);

		lib.fillTextBox(fieldOfStudy, fieldOfStudy);

		lib.fillTextBox(fromDate, fromDate);

		lib.fillTextBox(toDate, toDate);

		lib.fillTextBox(description, programDescription);

		lib.clickElement(submitButton);
	}

}
