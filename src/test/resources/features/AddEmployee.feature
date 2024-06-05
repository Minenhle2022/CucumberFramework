Feature: Adding employee using different techniques

  Background:
    When user enters valid username and password
    And user clicks on login button
    Then user is successfully logged in
    When user clicks on PIM option
    And user clicks on Add Employee option

  @addemployee
  Scenario: Adding an employee in HRMS system

    When user enters firstname and middlename and lastname
    And user clicks on save button
    Then employee added successfully

    @cucumber
    Scenario: Adding employee from feature file
      When user enters "Samkelisiwe", "Sam" and "Gambushe"
      And user clicks on save button
      Then employee added successfully
    @ddt
    Scenario Outline:: Adding employee using data driven testing
      When user enters "<firstname>" and "<middlename>" and "<lastname>".
      And user clicks on save button
      Then employee added successfully
      Examples:
        | firstname | middlename | lastname |
        |Nqobile    |MN          |Ndlovu    |
        |Tumelo     |TS          |Sikhakhne |
        |Azania     | AS         | Sthole   |
      @datatable
    Scenario: Adding multiple  employees using data table
      When user enters firstname and middlename and lastname from data table and verify
        | firstname | middlename | lastname |
        | Nonny     | Dwayne     | Cartey   |
        | Nickey    | NS         | Minky    |
        | Cole      | Sphe       | Gambs    |

      @excel
    Scenario: Adding employees from excel file
      When user adds multiple employees from excel and validate them