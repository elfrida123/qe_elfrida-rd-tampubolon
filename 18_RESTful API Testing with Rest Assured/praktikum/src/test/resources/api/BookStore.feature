Feature: User
  As an admin
  I want to see list of store book
  So that I can create new store book

  Scenario: GET - As admin I have be able to get detail store book
    Given I set GET api endpoints
    When I send GET HTTP request
    Then I receive valid HTTP response code 200

