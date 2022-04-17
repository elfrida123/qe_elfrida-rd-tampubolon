Feature: As a user, I want to use the calculator application for minus

  @minus
  Scenario: As a User, I have be able to minus whole numbers
    Given user on calculator page for minus
    When user click the first number for minus
    And user click the minus operation
    And user click the second number for minus
    And user click equal to operation for minus
    Then user get the result for minus