Feature: Booking search
  Scenario: Rating and hotel name should be correct
    Given user is on the search page
    When user is searching for hotel "Absolute Sagrada Familia"
    Then "Absolute Sagrada Familia" exists on the result page
    And hotel's rating is "9,3"