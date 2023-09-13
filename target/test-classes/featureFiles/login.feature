Feature: Login
  I want to use this template for my feature file
  

  Background: 
  Given User is on Home Page
    @Login
  Scenario Outline: Successful Login with Valid Credentials
    When User enters "<email>" email
    And User enters "<Password>" Password
    And Clicks Go button
    Then He can visit the practice page
    And A message is displayed
 
   

    Examples: 
      | email        | Password |
      | test@email.com| abcabc  |
      | test@email.com| abcabcd  |