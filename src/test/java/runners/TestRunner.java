package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)

@CucumberOptions(features = "Features/LoginTest.feature",

glue = "stepDefinitions", monochrome = true, plugin = { "pretty", "html:reports/cucumber-report.html" })
public class TestRunner {

}
