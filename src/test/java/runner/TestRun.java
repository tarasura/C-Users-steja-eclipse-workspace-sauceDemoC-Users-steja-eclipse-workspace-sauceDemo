package runner;


import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(tags= "@dataDriven" ,
		features= {".//Features/LoginSauce.feature"},
		glue= {"stepDefinition"} ,
				
		plugin= {"pretty" , "html:test-report"}
)

public class TestRun extends AbstractTestNGCucumberTests {

}
