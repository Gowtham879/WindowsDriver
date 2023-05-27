Feature: Automate Calculator Using WinAppDriver
  @ArithmeticOperation1
  Scenario Outline:  calculate the Arithmetic Operations with WholeNumbers
    Given User is able to Open the  Windows Calculator
    When  User is able Select the two Number "<Digits1>" and "<Digits2>" perform the "<operation>"
    When get the operation results of "<Digits1>" and "<Digits2>" "<operation>"
    Then Verify the Results
    Examples:
      | operation      | Digits1 |Digits2 |
      | Addition       | 234     | 126    |
      | Subtraction    | 654     | 345    |
      | Multiplication | 247     | 375    |
      | Division       | 596     | 896    |
  @ArithmeticOperation2
  Scenario Outline:  calculate the Arithmetic Operations with DecimalNumbers
    Given User is able to Open the  Windows Calculator
    When  User is able Select the two decimalNumber "<Digits1>" and "<Digits2>" perform the "<operation>"
    When get the operation results of decimalNumbers "<Digits1>" and "<Digits2>" "<operation>"
    Then Verify the Results
    Examples:
      | operation      | Digits1 |Digits2 |
      | Addition       | 123.1234|212.4321|
      | Subtraction    | 6.54    | 3.45   |
      | Multiplication | 20.766  |30.65453|
      | Division       | 5.96    | 8.96   |
  @Currency
  Scenario Outline: To perform Currnecy calculation using calculator
    Given User is able to Open the  Windows Calculator
    When Enter the Input currency unit "<Input Currency Unit>"
    And Enter the currency values "<Value>"
    And Enter the Output currency unit "<Output Currency Unit>"
    Then Validate the output currency value of "<Input Currency Unit>" "<Value>" "<Output Currency Unit>"

    Examples:
      | Input Currency Unit | Output Currency Unit        | Value |
      | India Rupee         | United Kingdom Pound        | 28272 |
      | India Rupee         | United Arab Emirates Dirham |   435 |
      | India Rupee         | United States Dollar        | 42233 |
