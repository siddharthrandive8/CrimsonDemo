package Runner; 	

import org.junit.runner.*;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		features = "F:\\siddharth randive\\siddharthrandove\\CrimsonDemo\\src\\main\\java\\Feature\\Trinka.feature"
		,glue = {"StepDef"}
		,plugin = {"pretty","html:target/cucumber"}
		,dryRun = false
		,monochrome = true
		)



public class TestRunner 
{

}
