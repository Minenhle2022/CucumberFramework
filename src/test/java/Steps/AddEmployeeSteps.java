package Steps;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import pages.AddEmployeePage;
import utils.CommonMethods;

import java.util.List;
import java.util.Map;

public class AddEmployeeSteps extends CommonMethods {
    @When("user clicks on Add Employee option")
    public void user_clicks_on_add_employee_option() {
       // WebElement addEmp = driver.findElement(By.id("menu_pim_addEmployee"));
        click(dashboardPage.employeeAdd);

    }
    @When("user enters firstname and middlename and lastname")
    public void user_enters_firstname_and_middlename_and_lastname() {
       // WebElement firstName = driver.findElement(By.id("firstName"));
      //  AddEmployeePage addEmployeePage =new AddEmployeePage();
        sendText("Minenhle ",addEmployeePage.firstNameLoc);
      //  WebElement middleName = driver.findElement(By.id("middleName"));
        sendText("Mini",addEmployeePage.middleNameLoc);
     //   WebElement lastName = driver.findElement(By.id("lastName"));
        sendText("Sikhy",addEmployeePage.lastNameLoc);

    }
    @When("user clicks on save button")
    public void user_clicks_on_save_button() {
        // Write code here that turns the phrase above into concrete actions
       // AddEmployeePage addEmployeePage = new AddEmployeePage();
       // WebElement buttonSave = driver.findElement(By.id("btnSave"));
        click(addEmployeePage.buttonSave);
    }
    @Then("employee added successfully")
    public void employee_added_successfully() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Employee Added");

    }

    @When("user enters {string}, {string} and {string}")
    public void user_enters_and(String firstname, String middlename, String lastname) {
       // AddEmployeePage addEmployeePage = new AddEmployeePage();
       // WebElement firstNameLoc = driver.findElement(By.id("firstName"));
      //  WebElement middleNameLoc = driver.findElement(By.id("middleName"));
     //   WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        sendText(firstname,addEmployeePage.lastNameLoc);
        sendText(middlename,addEmployeePage.middleNameLoc);
        sendText(lastname, addEmployeePage.lastNameLoc);
    }

    @When("user enters {string} and {string} and {string}.")
    public void user_enters_and_and(String fn, String mn, String ls) {
        AddEmployeePage addEmployeePage = new AddEmployeePage();
        // Write code here that turns the phrase above into concrete actions
       // WebElement firstNameLoc = driver.findElement(By.id("firstName"));
       // WebElement middleNameLoc = driver.findElement(By.id("middleName"));
      //  WebElement lastNameLoc = driver.findElement(By.id("lastName"));
        sendText(fn,addEmployeePage.lastNameLoc) ;
        sendText(mn,addEmployeePage.middleNameLoc);
        sendText(ls,addEmployeePage.lastNameLoc);

    }

    @When("user enters firstname and middlename and lastname from data table and verify")
    public void user_enters_firstname_and_middlename_and_lastname_from_data_table_and_verify
            (io.cucumber.datatable.DataTable dataTable) throws InterruptedException {
        List<Map<String, String>> newEmployees = dataTable.asMaps();
        //to get one map at one time from multiple maps

        for (Map<String,String> employee:
                newEmployees
        ){
            //it will return my value from key
            String firstNameValue = employee.get("firstname");
            String middleNameValue = employee.get("middlename");
            String LastNameValue = employee.get("lastname");

            sendText(firstNameValue,addEmployeePage.firstNameLoc) ;
            sendText(middleNameValue,addEmployeePage.middleNameLoc);
            sendText(LastNameValue,addEmployeePage.lastNameLoc);
            click(addEmployeePage.buttonSave);
            Thread.sleep(2000);

            //to add multiple employees, I have to click on add employee
            click(dashboardPage.employeeAdd);
            Thread.sleep(2000);
        }
    }


}
