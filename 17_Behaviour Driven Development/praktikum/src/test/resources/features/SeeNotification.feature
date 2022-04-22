Feature: Notification
  As a user, I want to see notification

  @SeeNotification
  Scenario: As a user I have be able to see notification
    Given I am on the notification page
    And I click notification that I want to see
    Then I see my notification