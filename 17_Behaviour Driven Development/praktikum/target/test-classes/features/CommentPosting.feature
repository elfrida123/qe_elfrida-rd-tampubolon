Feature: Comment
  As a user
  I want to comment posting of someone

  Scenario: As a user I have be able to comment posting of someone
    Given I am on the home page
    Then I search the posting that I want to comment
    Then I click comment menu
    When I write text on comment posting
    And I click Add button
    Then my comment have been sent