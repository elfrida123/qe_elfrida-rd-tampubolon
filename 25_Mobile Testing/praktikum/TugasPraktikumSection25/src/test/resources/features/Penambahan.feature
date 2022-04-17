Feature: As a user, I want to use the calculator application for adding

  @add
  Scenario: As a User, I have be able to add whole numbers
    Given user on calculator page
    When user click the first number
    And user click the add operation
    And user click the second number
    And user click equal to operation
    Then user get the result