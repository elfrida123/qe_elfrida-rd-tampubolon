Feature: Message
  As a user, I want to message someone

  Scenario: As a user I have be able to message someone
    Given I am on the message page
    Then I search name of people that I want to message in search box
    Then I click the name of people
    When I write text
    And I click Send button
    Then my message have been sent