package inClass.Framework.task;

import org.openqa.selenium.By;

import io.cucumber.java.en.When;

public class Dashboard extends SetUpPage{
	
	private WebDriver driver;
	
	public Dashboard(WebDriver driver) {
		this.driver = driver;
	}
	
	private By addExperienceButton = By.linkText("Add Experience");
	private By addEducationButton = By.xpath("//a[@href='/add-education']");
	
	@When("User clicks Add Experience Button")
	public void clickAddExpirenceButton() {
		lib.clickElement(addExperienceButton);
	}
	
	@When("User clicks Add Education Button")
	public void clickAddEducation() {
		lib.clickElement(addEducationButton);
	}

}
