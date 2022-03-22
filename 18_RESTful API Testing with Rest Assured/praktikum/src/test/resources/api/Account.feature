Feature: Account
  As an admin
  I want to see list of account
  So that I can create new account

  Scenario: GET - As admin I have be able to get detail account
    Given I set GET api endpoints for account
    When I send GET HTTP request for account
    Then I receive valid HTTP response code 200 for account