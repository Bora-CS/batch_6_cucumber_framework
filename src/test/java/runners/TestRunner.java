package runners;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.bora.helpers.ConfigReader;
import com.bora.helpers.SeleniumHelper;

import io.cucumber.java.AfterStep;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginTest.feature",
glue = "stepDefinitions", monochrome = true,
plugin ={"pretty","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class TestRunner {

	

	
}
