Feature: Search Job
  As a user, I want to search job

  Scenario: As a user I have be able to search job
    Given I am on the job page
    When I search the jobs in the search box
    And I click the result of the job
    Then I see the job that I want to see
    Then I click Apply now button