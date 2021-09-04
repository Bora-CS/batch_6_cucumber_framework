package stepDefinition;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.bora.helpers.ConfigReader;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.cucumber.messages.internal.com.google.protobuf.compiler.PluginProtos.CodeGeneratorResponse.File;

public class CucumberBackgroundSteps {
	
	@Given("this is common step one")
	public void this_is_common_step_one() {
	    System.out.println("------------ Common Step One -------------");
	}

	@When("this is common step two")
	public void this_is_common_step_two() {
	    System.out.println("------------Common Step Two ----------------");
	}

	@Then("this is common step three")
	public void this_is_common_step_three() {
	    System.out.println("------------Common Step Three --------------");
	}

	@When("step one")
	public void step_one() {
	    System.out.println("This is step one");
	}

	@Then("step two")
	public void step_two() {
	  System.out.println("This is step two");
	}
	
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver", ConfigReader.getInstance().getDriverPath());
//		WebDriver driver = new ChromeDriver();
//		TakesScreenshot takeScreenshot = (TakesScreenshot)driver;
//		File srcFile =  takeScreenshot.getScreenshotAs(OutputType.FILE);
	}

}
