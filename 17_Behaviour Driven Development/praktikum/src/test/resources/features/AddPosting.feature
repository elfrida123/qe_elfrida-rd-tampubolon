Feature: Posting
  As a user
  I want to create a post

  Scenario: As a user I have be able to create a post
    Given I am on the posting page
    When I write a post
    And I click Post button
    Then my post have been created