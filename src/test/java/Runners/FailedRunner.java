package Runners;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        //this will specify the path of features directory
        features = "@features/failed.txt",
        //here in glue,
        glue = "Steps",
        dryRun = false,
        tags = "@failed",
        //pretty keywords prints all steps in console which we execute
        //to generate the report, I need to mention type of the report and location
        plugin = {"pretty"}

)


public class FailedRunner {

}
