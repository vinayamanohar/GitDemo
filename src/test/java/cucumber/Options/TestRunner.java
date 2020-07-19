package cucumber.Options;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.testng.AbstractTestNGCucumberTests;

//this is where feature file is present. to be more specific "src/test/java/features/login.feature"
//here we give the pkg name where all the step definitions are present

//@RunWith(Cucumber.class)
@CucumberOptions(
	features="src/test/java/features", glue="stepdefinition") 

public class TestRunner extends AbstractTestNGCucumberTests  {
	
	

}
