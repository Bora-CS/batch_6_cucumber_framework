package inClass.Framework.resource;

import org.openqa.selenium.By;

public class EducationPage_Locators {

	public static final By schoolName= By.xpath("//input");
	public static final By degree= By.xpath("(//input)[2]");
	public static final By fieldOfStudy= By.xpath("(//input)[3]");
	public static final By fromDate= By.name("from");
	public static final By toDate= By.name("to");
	public static final By description= By.xpath("//textarea");
	public static final By submitButton= By.cssSelector(".btn.btn-primary.my-1");
	
	
}
