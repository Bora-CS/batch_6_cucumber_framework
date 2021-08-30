package inClass.Framework.resource;

import org.openqa.selenium.By;

public class ExpirencePage_Locators {

	public static final By jobTtile = By.xpath("//input");
	public static final By company = By.xpath("(//input)[2]");
	public static final By location = By.xpath("(//input)[3]");
	public static final By fromDate = By.name("from");
	public static final By toDate = By.name("to");
	public static final By jobDescription = By.xpath("//textarea");
	public static final By submitButton = By.cssSelector(".btn.btn-primary.my-1");
	
	
}
