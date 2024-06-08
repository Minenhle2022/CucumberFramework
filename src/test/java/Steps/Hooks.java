package Steps;


import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;
import utils.CommonMethods;

import java.io.IOException;

public class Hooks extends CommonMethods {
    // pre condition
    @Before
    public void start() throws IOException {
        openBrowserAndLaunchApplication();
    }
    //post condition
    @After
    public void end(Scenario scenario) {
        byte[] pic = new byte[0];

        //getName is the
        if (scenario.isFailed()) {
            takeScreenshot("failed/" + scenario.getName());
        } else {
            takeScreenshot("passed/" + scenario.getName());
    }

        //this will attach my screenshotto my report
        scenario.attach(pic,"image/png", scenario.getName());
        closeBrowser();
    }

}
