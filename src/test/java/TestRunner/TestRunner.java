package TestRunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;


@RunWith(Cucumber.class)
	
	@CucumberOptions(features="src/test/java/com/Feature/com",
	
	monochrome= true,
	tags="@Regression",
	plugin= {"pretty", 
			"html: target/cucumber-reports",
			"json:target/cucumber-report/cucumber.json",
			"junit: target/cucumber-reports/Cucumber.xml"},
	glue="src/test/java/com/StepDefination/com")

public class TestRunner {
		

}