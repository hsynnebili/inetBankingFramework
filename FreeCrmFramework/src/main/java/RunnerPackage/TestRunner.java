package RunnerPackage;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/husey/eclipse-workspace/FreeCrmFramework/src/main/java/Features/login.feature"
, glue = { "stepDefinitions" })

public class TestRunner {

}
