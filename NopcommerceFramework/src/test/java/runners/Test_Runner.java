package runners;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "/Users/husey/eclipse-workspace/NopcommerceFramework/Features/Login.feature"
, glue = "com/NopcommerceFramework/stepDefinitions")

public class Test_Runner {

}
