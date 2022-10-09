Feature: Login Feature Scenario

  Background: 
    Given I have launched the application
    And I click on Login link


  Scenario: This scenario is to define the login happy path
    When I enter the correct username and passowrd
    And I click on Login button
    Then I should land on the home page

@sanity
  Scenario: This sceanrio is to define the failure path
    When I enter the incorrect username and passowrd
    And I click on Login button
    Then I should get the error message "Please enter a valid email address"
    
    
@regression
  Scenario: This sceanrio is to define the failure path
    When I enter the username as "abcd" and password as "jkuhkjhkjh"
    And I click on Login button
    Then I should get the error message "Please enter a valid email address"
    
    

  Scenario Outline: This sceanrio is to define the failure path
    When I enter the username as "<Username>" and password as "<Password>"
    And I click on Login button
    Then I should get the error message "Please enter a valid email address"

    Examples: 
      | Username       | Password |
      | abcd@gmail.com | sfygfjgs |
      | efgh@gmail.com | oiuiouoi |
