Feature: Operator Cross in Calculator

  @cross
  Scenario: As a User, I have be able delete one number
    Given user on calculator page for cross
    When user click the first number for cross
    And user click the second number for cross
    And user click the cross operation
    Then the number have been delete