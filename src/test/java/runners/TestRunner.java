package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
<<<<<<< HEAD
@CucumberOptions(features = "Features/LoginTest.feature",
=======
@CucumberOptions(features = "src/test/resources/features/LoginTest.feature",
>>>>>>> 3f98156505509c0ce8ac604741229ed4b9312986
glue = "stepDefinitions", monochrome = true,
plugin = {"pretty", "html:reports/cucumber-report.html" }
)
public class TestRunner {

}
