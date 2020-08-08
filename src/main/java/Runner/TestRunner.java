package Runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		
		features = "C:/Users/user/Desktop/Training/OutlookAutomationTesting/src/main/java/Features", 
		glue={"stepDefinition"}, 
		dryRun = true, 
		monochrome = true ,
		strict = true,
		plugin = {"pretty" ,"html:test_output/cucumber-html-report", "json:target/cucumber-json-report.json" }
		)
					
public class TestRunner {

}
