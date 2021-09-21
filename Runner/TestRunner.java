package Runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="C:\\Users\\Sachin\\workspace\\CucumberBasicProject\\src\\FeaturesFile"
		,glue={"StepDefinition"}
		)
public class TestRunner {

}
