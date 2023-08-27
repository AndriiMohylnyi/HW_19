Feature: Calculator

  Scenario Outline:  sum of the two numbers
    Given two numbers <a> and <b>
    When try to find sum of two numbers
    Then sum result should be <resultSum>

    Examples:
      | a | b | resultSum |
      | 3 | 2 | 5         |
      | 3 | 3 | 6         |
      | 3 | 4 | 7         |
      | 3 | 5 | 8         |


  Scenario Outline: Multiplication  of the two numbers
    Given two numbers <a> and <b>
    When  try to find mult of two numbers
    Then mult result should be <resultMult>


    Examples:
      | a | b | resultMult |
      | 3 | 2 | 6          |
      | 3 | 3 | 9          |
      | 3 | 4 | 12         |
      | 3 | 5 | 15         |