Feature: Create account functionality

  Scenario Outline: Happy Path
    Given user is on the main page of Luma user clicks on create account button
    When user is on create account page user enters name as '<firstName>' and lastname as '<lastName>'
    Then user enters email as '<email>' and password as '<password>' and confirms password as '<confirmPassword>'
    And user clicks on create account button and validates success message as '<successMessage>'

    Examples: testData
      | firstName | lastName | email          | password   | confirmPassword | successMessage                                     |
      | Caleb     | Butz     | butz@gmail.com | OOOooo111@ | OOOooo111@      | Thank you for registering with Main Website Store. |

