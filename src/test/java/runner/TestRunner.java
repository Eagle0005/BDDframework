package runner;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import utilities.CucumberReportingConfig;

@RunWith(Cucumber.class)
@CucumberOptions(
		// features tells cucumber where all feature files are located
		// glue tells cucumber where all stepDef classes are located
		// tags we will run one scenario, or multiple scenarios, or entire feature
		// dryRun checks if there are any missing steps in StepDefiniton class
		// default value of dry run will be false
		// for each scenario steps in feature file//input[@id='input-cheque']
		// monochrome will make console readable
		// strict will mark scenario failed if there are any pending steps.
		// plugin will be used for generating a readable report
		features = "C:\\Users\\15716\\eclipse-workspace\\com.capstonproject.assignment\\src\\test\\resources\\features",
		glue = "stepDefinitions",
		tags = "@smokeTest", 
		dryRun = false, 
		monochrome = true, 
		strict = true, 
		plugin = {
				"pretty", 
				"html:target/site/cucumber-pretty",
				"json:target/cucumber.json" }, 
		publish = true
)
public class TestRunner {

	/**
	 * This method will invoke the Cucumber reporting once the execution is over.
	 * 
	 * @AfterClass annotation is from Junit and this will run after (AfterHooks)
	 */
	@AfterClass
	public static void generateReport() {
		CucumberReportingConfig.reportConfig();
	}
}
