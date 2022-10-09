Feature: This feature would be creating a calculator for Add and Subtract

@regression
  Scenario: To Add two numbers
    Given I have a calculator
    When I add 4 and 5
    Then I should get the result as 9
    
    
    @multipleinputs
  Scenario Outline: To Add two numbers
    Given I have a calculator
    When I add <num1> and <num2>
    Then I should get the result as <result>
    
    Examples:
    |num1|num2|result|
    |2   |2   |4     |
    |5   |4   |9     |
    |11  |12  |23    |

    
    @addition
  Scenario: To Add two numbers
    Given I have a calculator
    When I add below numbers
    |1|
    |2|
    |3|
    
    Then I should get the result as 6