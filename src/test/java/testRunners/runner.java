package testRunners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature/opengoogle.feature"},
glue= {"stepDefinitions"}, 
plugin= {"pretty", "json:target/JSONReports/report.json", "junit: target/junit_xml/cucumber.xml"},
monochrome = false,
dryRun = true
)

public class runner {
	

}
