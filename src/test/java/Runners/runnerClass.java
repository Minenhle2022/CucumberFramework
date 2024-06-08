package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this will specify the path of features directory
        features = "src/test/resources/features/",
        //here in glue,
        glue = "Steps",
        dryRun = false,
        tags = "@featurefile",
        //pretty keywords prints all steps in console which we execute
        //to generate the report, I need to mention type of the report and location
        plugin = {"pretty", "html:target/cucumber.html","rerun:target/failed.txt","json:target/cucumber.json"}
)
public class runnerClass {


}
