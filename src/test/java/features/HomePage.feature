@tag
Feature: Swag Labs

@tag1
  Scenario Outline: Home page Validations
    Given I want to launch Url of the application
    Then the page title should be "Swag Labs"
    When User enters "<Username>" in username textbox field
    Then User enters "<Password>" in password textbox field
    And user clicks on Sign in Button
    Then User should able to view Menu links:
      | All Items       |
      | About           |
      | Logout          |
      | Reset App State |
    When user selects dropdown from "Price (high to low)"
    Then User click on Add to cart button for "Sauce Labs Backpack"
    Then User click on cart link icon
    Then User clicks on Checkout button
    When User enters "<Firstname>" in firstname textbox field
    When User enters "<Lastname>" in lastname textbox field
    When User enters "<Postcode>" in postcode textbox field
    And User clicks on continue button
    And User clicks on finish button
    Then User verify success message

    Examples:
      | Username      | Password     | Firstname | Lastname | Postcode |
      | standard_user | secret_sauce | first     | last     | 12345    |

