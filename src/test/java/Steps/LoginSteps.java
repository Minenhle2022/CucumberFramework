package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.apache.log4j.xml.DOMConfigurator;
import org.junit.Assert;
import utils.CommonMethods;
import utils.ConfigReader;
import utils.Log;

import java.io.IOException;
import java.time.Duration;

public class LoginSteps extends CommonMethods {

    @Given("user is navigated to HRMS application")
    public void user_is_navigated_to_hrms_application() throws IOException {
        // Write code here that turns the phrase above into concrete actions
        openBrowserAndLaunchApplication();
    }


    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() throws IOException {

       // WebElement userName = driver.findElement(By.xpath("//input[@name='txtUsername']"));
        //WebElement passwordField = driver.findElement(By.id("//*[@id='txtPassword']"));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
        loginPage.usernameTextField.sendKeys(ConfigReader.read("userName"));
        loginPage.passwordTextField.sendKeys(ConfigReader.read("password"));


    }
    @When("user clicks on login button")
    public void user_clicks_on_login_button()  {
        // Write code here that turns the phrase above into concrete actions
        //WebElement loginButton = driver.findElement(By.cssSelector("input#btnLogin"));
        //loginPage.loginButton.click();
        jsClick(loginPage.loginButton);
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

         //System.out.println(10/0);

    }

    @When("user enters {string} value and {string} value")
    public void userEntersValueAndValue(String username, String password) {
        sendText(username, loginPage.usernameTextField);
        DOMConfigurator.configure("login4j.xml");
        Log.startTestCase("My first test case for login");
        Log.info("Username has been entered");
        sendText(password,loginPage.passwordTextField);
        Log.info("Password has been entered");
        Log.warn("This might not load the page");
        Log.debug("Here I am debugging the code");
    }

    @When("user enters {string} values and {string} values")
    public void userEntersValuesAndValues(String username, String password) {
        sendText(username,loginPage.usernameTextField);
        sendText(password,loginPage.passwordTextField);
    }


    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        //here we are checking if element
        Assert.assertTrue(dashboardPage.welcomeMessage.isDisplayed());
       // System.out.println("Test Passed");
        String expectedUrl ="http://hrm.syntaxtechs.net/humanresources/symfony/web/index.php/dashboard";
        String actualUrl = driver.getCurrentUrl();
        Assert.assertEquals(expectedUrl,actualUrl);


    }



}
