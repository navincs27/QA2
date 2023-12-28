Feature: Room Selection and Display

  Scenario: Select and Display Room at Low Price
    Given the user is on the "View Plan Details and Policies" page
    When the user selects a room with the lowest price
    And the user captures the plan details and policies
    And the user takes a screenshot
    Then the selected room details should be displayed at  low price