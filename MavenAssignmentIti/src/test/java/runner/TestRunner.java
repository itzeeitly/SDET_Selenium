package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login//login.feature"},
glue={"stepdefinition"},
monochrome=true,
dryRun=false,
strict=true,
plugin = {"html:testoutput/Htmlreport.html","junit:testoutput/Xmlreport.xml","json:testoutput/Jsonreport.json"} )

public class TestRunner {

}
