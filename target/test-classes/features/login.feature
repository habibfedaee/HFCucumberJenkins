Feature: validation of login scenarios

  Background:
    #Given user is navigated tot he HRMS application

    @smoke @regression @sprint22 @adminLogin
      Scenario: admin login
        Given user is navigated tot he HRMS application
        When user enters valid admin credentials
        And user clicks on the login button
        Then admin user is successfully logged in

    @regression @smoke @sprint22 @essLogin
      Scenario: ESS login
        Given user is navigated to the HRMS application
        When user enters valid ess credentials
        And user clicks on the login button
        Then user is successfully logged in


    @regression @smoke
      Scenario: invalid login
        Given user is navigated to the HRMS application
        When user enter invalid login credentials
        And user clicks on the login button
        Then user sees error message ont the login screen
