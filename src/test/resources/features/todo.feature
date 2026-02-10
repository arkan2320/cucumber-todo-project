Feature: todo
  Scenario: user should be able to add to do item
    Given user is on todo page
    When user click on plus icon and add new item
    Then new item should be added to the list
