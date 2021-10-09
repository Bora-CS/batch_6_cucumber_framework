package TestNG_Tests;

import org.testng.annotations.Test;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class TestNGTest {
	
	
	@BeforeMethod
	public void beforeMethod() {
		System.out.println("Before Test");
	}
	
	@Test
	@Parameters({})
	public void test1(String Parameters, int parameter) {
		System.out.println("TestNG Test");
	}
	
	@AfterMethod
	public void afterMethod() {
		System.out.println("After Test");
	}

	// hierarchy goes @BeforeSuite, @BeforeTest, @BeforeClass, @BeforeMethod
	// if parameters provided, must run test through .xml 
}
