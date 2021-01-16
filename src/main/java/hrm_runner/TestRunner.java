package hrm_runner;

import org.junit.runner.RunWith;

//import Cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import cucumber.api.CucumberOptions;
 
@RunWith(Cucumber.class)
//@RunWith(Cucumber.class)
@CucumberOptions(
	
features = "src/main/java/hrm_features/hrm.feature",
glue = "stepDefinations",tags = {"@smoke_test"}
		
)
public class TestRunner {

	
	
}
