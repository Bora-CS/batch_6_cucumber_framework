package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "Feature/LoginTest.feature",
glue = "stepDefinitions", monochrome = true,
plugin = {"pretty", "html:reports/cucumber-report.html" }
)
public class TestRunner {

}
