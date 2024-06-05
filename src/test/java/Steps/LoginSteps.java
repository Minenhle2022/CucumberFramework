package Steps;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import utils.CommonMethods;
import utils.ConfigReader;

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
        loginPage.loginButton.click();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

    }
    @Then("user is successfully logged in")
    public void user_is_successfully_logged_in() {
        System.out.println("Test passed");

    }
}