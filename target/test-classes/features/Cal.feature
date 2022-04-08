Feature: Create a calculator for add and substract

  Scenario: To Add
    Given Open Calculator
    When Enter two numbers 30 and 20 for add
    Then I should get addition as 50

  Scenario: To Substract
    Given Open Calculator
    When Enter two numbers 30 and 20 for substract
    Then I should get substraction as 10
