package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login\\Login.feature"},
glue={"stepdefinition"},
monochrome=false,
dryRun=true,
strict=true
//plugin={"html:testoutput/testoutput.html","junit:testoutput/cucumber.xml","json:testoutput/cucumber.json"}
)

public class testrunner {

}
