package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login//login.feature"},glue={"stepdefinition"},
monochrome=true,dryRun=false,strict=true)
public class TestRunner {

}
