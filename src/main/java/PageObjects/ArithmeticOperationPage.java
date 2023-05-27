package PageObjects;

import Utilities.WinCommands;

public class ArithmeticOperationPage extends WinCommands {
    CalculatorPage calculator=new CalculatorPage();
    public void operators(String operation) {
        String functions=operation;
        switch(functions) {
            case "Addition":
                driver.findElementByName("Plus").click();
                break;
            case "Subtraction":
                driver.findElementByName("Minus").click();
                break;
            case "Multiplication":
                driver.findElementByName("Multiply by").click();
                break;
            case "Division":
                driver.findElementByName("Divide by").click();
                break;
            default:System.out.println("Inavalid operations");
        }
    }
    public void arthematicOperation(String number1, String number2, String operation){
        calculator.Digit1(number1);
        this.operators(operation);
        calculator.Digit1(number2);
        calculator.equals();
    }
    public void decimalNumbers(String decimal)
    {
//        System.out.println(decimal);
        String[] a = decimal.split("[.]", 0);
//        System.out.println(a.length);
        String beforedot = a[0];
//        System.out.println(beforedot);
        calculator.Digit1(beforedot);
        String seperator = "Decimal separator";
        this.clickName(seperator);
        String afterdot = a[1];
//        System.out.println(afterdot);
        calculator.Digit1(afterdot);
    }
    public void DecimalArithmeticOperation(String number1, String number2, String operation) {
        this.decimalNumbers(number1);
        this.operators(operation);
        this.decimalNumbers(number2);
        calculator.equals();
    }
}
