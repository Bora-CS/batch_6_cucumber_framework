package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features",
glue = "stepDefinitions", monochrome = true,
<<<<<<< HEAD
plugin = {"pretty", "html:reports/cucumber-report.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
=======
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
>>>>>>> 7547a6307ecb6474c8d64e9d2e2cd4830e806474
)
public class TestRunner {

}
