Feature: As a user, I want to use the calculator application for multiplication

  @multiplication
  Scenario: As a User, I have be able to multiplication whole numbers
    Given user on calculator page for multiplication
    When user click the first number for multiplication
    And user click the multiplication operator
    And user click the second number for multiplication
    Then user click equal to operation for multiplication