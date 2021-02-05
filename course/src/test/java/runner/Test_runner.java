package runner;

import org.junit.runner.RunWith;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/resources/Login/Login.feature"},
glue= {"stepDefiniation"},
monochrome=true, //to make the console output in format
//tags="@Validcase",
dryRun=false, //to check all the methods implemented properly
strict=true,
plugin = {"html:testoutput/myReport.html","junit:testoutput/myReport_junit.xml","json:testoutput/myReport_json.json"})
public class Test_runner {

}
