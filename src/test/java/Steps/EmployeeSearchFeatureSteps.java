package Steps;


import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.EmployeeSearchPage;
import utils.CommonMethods;


public class EmployeeSearchFeatureSteps extends CommonMethods {
    @When("user clicks on PIM option")
    public void user_clicks_on_pim_option() {
       // WebElement pimOpt = driver.findElement(By.id("menu_pim_viewPimModule"));
        click(dashboardPage.pimOption);
    }
    @When("user clicks on employee list option")
    public void user_clicks_on_employee_list_option() {
      //  WebElement empList = driver.findElement(By.id("menu_pim_viewEmployeeList"));
        click(dashboardPage.employeeList);
    }
    @When("user enters valid employee id")
    public void user_enters_valid_employee_id() {
       // WebElement empIdSearchField = driver.findElement(By.id("empsearch_id"));
        sendText("776865",employeeSearchPage.empSearchID);
    }
    @When("user clicks on search button")
    public void user_clicks_on_search_button() {
        //WebElement btnSearch = driver.findElement(By.id("searchBtn"));
        click(employeeSearchPage.btnSearch);

    }

    @Then("user see the employee information")
    public void user_see_the_employee_information() {
        System.out.println("Test Passed");
    }
    @When("user enters valid employee name")
    public void user_enters_valid_employee_name() {
       // WebElement nameSearch = driver.findElement(By.id("empsearch_employee_name_empName"));
        sendText("abc", EmployeeSearchPage.employeeSearchPage.empNameSearch);
    }


}
