Feature: As a user, I want to use the calculator application for dividing

  @divide
  Scenario: As a User, I have be able to divide whole numbers
    Given user on calculator page for divide
    When user click the first number for divide
    And user click the divide operation
    And user click the second number for divide
    And user click equal to operation for divide
    Then user get the result for divide
