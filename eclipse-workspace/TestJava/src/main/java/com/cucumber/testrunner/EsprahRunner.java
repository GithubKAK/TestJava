package com.cucumber.testrunner;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(plugin="pretty",features="src/test/resources/",
glue="com.esprah.stepdefs",dryRun=true,tags= {"@PizzaFunc"})
public class EsprahRunner {

}
