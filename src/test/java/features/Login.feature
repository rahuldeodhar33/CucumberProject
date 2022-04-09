Feature: This feature would be used to desine the Login page of the application

  Background: Open the application
    Given I have opened the application in browser

  @Sanity
  Scenario: Validate the successful login
    #Given I have opened the application in browser
    When I click on the Login link
    And I enter username
    And I enter password
    And I click on the login button
    Then I should be Landed on the home page

  Scenario: Validate the successful login using test data
    #Given I have opened the application in browser
    When I click on the Login link
    And I enter username "abc@gmail.com"
    And I enter password "Abcd@1234"
    And I click on the login button
    Then I should be Landed on the home page

  @Sanity
  Scenario Outline: Validate the successful login using multiple test data
    #Given I have opened the application in browser
    When I click on the Login link
    And I enter username "<Username>"
    And I enter password "<Password>"
    And I click on the login button
    Then I should be Landed on the home page

    Examples: 
      | Username      | Password  |
      | pqr@gmail.com | Pqrs@0987 |
      | grd@gmail.com | Grdw@4059 |

  @Sanity
  Scenario: Validate the error message
    #Given I have opened the application in browser
    When I click on the Login link
    And I enter username "ttt@gmail.com"
    And I enter password "Tcvg@1234"
    And I click on the login button
    Then I should get the error message as "The email or password you have entered is invalid."
