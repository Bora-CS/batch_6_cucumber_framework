package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginTest.feature",
glue = "stepDefinitions", monochrome = true,
plugin = {"pretty", "html:reports/cucumber-report.html","com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
)
public class TestRunner {

}
