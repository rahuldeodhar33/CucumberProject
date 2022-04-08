Feature: Create a calculator for add and substract
  Given Open Calculator

  Scenario: To Add
    When Enter two numbers to add 40 and 60
    Then I should get result as 100

  Scenario Outline: For Addition
    When Enter two numbers <num1> and <num2>
    Then I should get result <result>

    Examples: 
      | num1 | num2 | result |
      |   20 |   10 |     30 |
      |   40 |   20 |     60 |

  Scenario: add multiple numbers using cucumber
    When I add numbers
      | 10 |
      | 20 |
      | 30 |
      | 50 |
    Then I should get result as 110

  Scenario: add multiple numbers using cucumber
    When I add numbers using List
      | 10 |
      | 20 |
      | 30 |
      | 50 |
      | 40 |
    Then I should get result as 150

  Scenario: Calculate the food bill
    When I add menu
      | Coffee  |  30 |
      | Tea     |  15 |
      | VadaPav |  15 |
      | Pizza   | 100 |
    Then I should get result as 160

  Scenario: Calculate the food bill with qty
    When I add menu with qty
      | Coffee  | 2 |  30 |
      | Tea     | 2 |  15 |
      | VadaPav | 2 |  15 |
      | Pizza   | 1 | 100 |
    Then I should get result as 220
