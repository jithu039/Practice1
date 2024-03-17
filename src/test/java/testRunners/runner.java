package testRunners;

import org.junit.runner.RunWith;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = {"feature/flipkart1.feature"},
glue= {"stepDefinitions"}, 
plugin= {"pretty", "html: target/CucumberReports/CucumberReport1","json:target/JSONReports/report.json", "junit: target/junit_xml/cucumber.xml"},
stepNotifications= true,
monochrome = false,
dryRun = false
)

public class runner {
	

}
