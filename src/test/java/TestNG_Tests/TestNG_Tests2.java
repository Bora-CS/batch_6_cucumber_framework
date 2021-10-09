package TestNG_Tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class TestNG_Tests2 extends TestNGTest{
	
	@BeforeSuite
	public void beforeSuite() {
		System.out.println("I run before it all");
	}

	@AfterSuite
	public void afterSuite() {
		System.out.println("I run after it all");
	}
	
}
