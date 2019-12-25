package utils;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;


@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/java/resources",glue = {"stepDefs"}, plugin = "json:target/cucumber.json")


public class RunCuckesTest {

}
