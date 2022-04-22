Feature: User As an admin I want to see list of user So that I can create new user
  Scenario: GET - As admin I have be able to get detail single user
    Given I set GET api endpoints for single user
    When I send GET HTTP Request single user
    Then I receive valid HTTP response code 200 single user
    And I receive valid data for detail single user