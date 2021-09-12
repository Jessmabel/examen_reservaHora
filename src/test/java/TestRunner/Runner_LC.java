package TestRunner;

//import org.junit.runner.RunWith;
import io.cucumber.testng.CucumberOptions;
import io.cucumber.testng.AbstractTestNGCucumberTests;

//@RunWith(Cucumber.class)
@CucumberOptions(
plugin = {"pretty",
		"html:target/cucumber-reports/cucumber.html",
		"json:target/cucumber-reports/cucumber.json"		
		},
features= {"src/test/java/Features/LC.feature"},
glue= {"StepDefinition.caso1"})

public class Runner_LC extends AbstractTestNGCucumberTests{

}
