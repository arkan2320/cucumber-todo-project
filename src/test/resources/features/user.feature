Feature: Login
  Scenario: user should be able to login with valid cewdentials
    Given user is on login page
    When  user enter valid user and pass
    Then Welcome message should be displayed