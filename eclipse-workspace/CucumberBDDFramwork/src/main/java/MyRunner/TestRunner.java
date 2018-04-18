package MyRunner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "C:\\Users\\Dolon\\eclipse-workspace\\CucumberBDDFramwork\\src\\main\\java\\Features\\contacts.feature",
		glue= {"StepDefinitions"},  //path of the step definition file 
		format= {"pretty", "html:test-outout", "json:jeson_outout/cucumber.json", "junit:junit_xml/cucum.xml"}, 
		monochrome=true,  // readable console 
		strict=true,
		dryRun=false
		
		
		)
public class TestRunner {

}
