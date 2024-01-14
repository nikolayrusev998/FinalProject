package testRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(strict = true,
        features =  {"src/test/resources/Features/automationpractice.feature"} ,
        glue = {"stepDefinitions"},
        plugin = {"pretty", "html:target/cucumber-reports"}
)
public class RunCucumberTest {
}
