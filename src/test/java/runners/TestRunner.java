package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/LoginTest.feature",
glue = "stepDefinitions", monochrome = true,
<<<<<<< HEAD
plugin = {"pretty", "html:reports/cucumber-report.html", 
		"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
=======
plugin = {"pretty", "com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:" }
>>>>>>> 044697413696be3234aa3d59e684b678cd422823
)
public class TestRunner {

}
