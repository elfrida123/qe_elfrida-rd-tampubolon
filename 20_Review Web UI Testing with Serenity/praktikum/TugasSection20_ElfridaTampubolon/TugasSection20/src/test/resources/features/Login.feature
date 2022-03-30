Feature: Login
  As a user
  I want to login
  So that I can access my homepage

  Scenario: As a user I have to be able to login in ToolsQa
    Given I am on the login page
    When I input valid username
    And I input valid password
    And click login button
    Then I go to profil page

  Scenario: Failed login with invalid username
    Given I am on the login page
    When I input invalid username
    And I input valid password
    And click login button
    Then I'm still on the login page

  Scenario: Failed login with invalid password
    Given I am on the login page
    When I input valid username
    And I input invalid password
    And click login button
    Then I'm still on the login page

  Scenario: Failed login with invalid username and password
    Given I am on the login page
    When I input invalid username
    And I input invalid password
    And click login button
    Then I'm still on the login page

  Scenario: Failed login with empty username and password
    Given I am on the login page
    When I input empty username
    And I input empty password
    And click login button
    Then I'm still on the login page
