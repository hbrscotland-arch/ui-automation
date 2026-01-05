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
    When user selects dropdown from "Name (A to Z)"
    Then user click on Add to cart button for "Sauce Labs Backpack"

    Examples:
      | Username      | Password     |
      | standard_user | secret_sauce |

