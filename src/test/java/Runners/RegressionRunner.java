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
        tags = "@LoginMe",
        plugin = {"pretty", "html:target/cucumber.html","json:target/cucumber.json"}

)

public class RegressionRunner {


}
