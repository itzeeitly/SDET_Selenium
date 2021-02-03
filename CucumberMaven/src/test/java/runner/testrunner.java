package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features={"Login\\Login.feature","Login\\Mainpage.feature"},glue="stepdefinition")

public class testrunner {

}
