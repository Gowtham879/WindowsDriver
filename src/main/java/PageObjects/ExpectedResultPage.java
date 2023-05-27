package PageObjects;

import Utilities.WinCommands;
import org.testng.Assert;

import java.math.RoundingMode;
import java.text.DecimalFormat;

public class ExpectedResultPage extends WinCommands {
    private void addresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1+num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    private    void subtractresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1-num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    public void multiplyresults(String Digits1, String Digits2) {
        int actual;
        String id = "CalculatorResults";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String[] split = txtres.split("is ");
        if(split[1].length()>3)
        {
            String str2 = split[1].replaceAll(",","");
            actual = Integer.valueOf(str2);
        } else {
            actual = Integer.valueOf(split[1]);
            System.out.println("ActualResults "+"is "+actual);
        }
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        int expect = num1*num2;
        System.out.println("ExpectedResults " + "is "+ expect);
        Assert.assertEquals(actual, expect);
    }
    public   void divisionesults(String Digits1, String Digits2) {
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        double d3=Double.parseDouble(split);
//        System.out.println(d3);
//        DecimalFormat decfor = new DecimalFormat("0.0");
        int num1 = Integer.parseInt(Digits1);
        int num2 = Integer.parseInt(Digits2);
        Double d1 = new Double(num1);
        Double d2 = new Double(num2);
        double expect = d1 / d2;
//        decfor.setRoundingMode(RoundingMode.DOWN);
//        String value = decfor.format(expect);
//        System.out.println(expect);
        System.out.println("ExpectedResults " + "is " + expect);
        Assert.assertEquals(d3,expect);
//        Assert.assertTrue(split.contains());
    }
    public   void tempreresults(String Digits1){
        String id="Value2";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        int num1 = Integer.parseInt(Digits1);
        double Fahrenheit =((num1*9)/5)+32;
        double Kelvin = num1 + 273.15;
//        System.out.println(Kelvin);
        System.out.println(Fahrenheit);
        String value=String.valueOf(Kelvin);
//        Assert.assertEquals(split,Kelvin);
        Assert.assertTrue(split.contains(value));
    }
    public   void lengthresults(String Digits1){
        String id="Value2";
        String txtres=this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        DecimalFormat decfor = new DecimalFormat("0.00");
        int num1 = Integer.parseInt(Digits1);
        Double d3=new Double(num1);
        double inches= 0.3937*num1;
        decfor.setRoundingMode(RoundingMode.DOWN);
        String value = decfor.format(inches);
//        System.out.println(value);
        Assert.assertTrue(split.contains(value));
    }
    public void verification(String Digits1,String Digits2,String operations){
        String functions=operations;
        switch(functions) {
            case "Addition":
                this.addresults(Digits1,Digits2);
                break;
            case "Subtraction":
                this.subtractresults(Digits1,Digits2);
                break;
            case "Multiplication":
                this.multiplyresults(Digits1,Digits2);
                break;
            case "Division":
                this.divisionesults(Digits1,Digits2);
                break;
            default:System.out.println("Inavalid operations");
        }
    }
    public void decimalSum(String Digits1,String Digits2)
    {
        double n1 = Double.parseDouble(Digits1);
        double n2 = Double.parseDouble(Digits2);
        double expected = n1 + n2 ;
//        System.out.println(expected);
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        double actual=Double.parseDouble(split);
//        System.out.println(actual);
        Assert.assertEquals(actual, expected);

    }
    public void decimalDifference(String Digits1,String Digits2,String operator)
    {
        double n1 = Double.parseDouble(Digits1);
        double n2 = Double.parseDouble(Digits2);
        double expected = n1 - n2 ;
//        System.out.println(expected);
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        double actual=Double.parseDouble(split);
//        System.out.println(actual);
        Assert.assertEquals(actual, expected);
    }
    public void decimalProduct(String Digits1,String Digits2,String operator)
    {
        double n1 = Double.parseDouble(Digits1);
        double n2 = Double.parseDouble(Digits2);
        double expected = n1 * n2 ;
//        System.out.println(expected);
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        double actual=Double.parseDouble(split);
//        System.out.println(actual);
        Assert.assertEquals(actual, expected);

    }
    public void decimalQuotient(String Digits1,String Digits2,String operator)
    {
        double n1 = Double.parseDouble(Digits1);
        double n2 = Double.parseDouble(Digits2);
        double expected = n1 / n2 ;
//        System.out.println(expected);
        String id = "CalculatorResults";
        String txtres = this.gettext(id);
        System.out.println(txtres);
        String split = txtres.split(" ")[2].trim();
//        System.out.println(split);
        double actual=Double.parseDouble(split);
//        System.out.println(actual);
        Assert.assertEquals(actual, expected);

    }
    public void verifyingDecimalArithmeticOperations(String Digits1,String Digits2,String operator)
    {
        switch(operator)
        {
            case "Addition":
                this.decimalSum(Digits1, Digits2);
                break;
            case "Subtraction":
                this.decimalDifference(Digits1, Digits2, operator);
                break;
            case "Multiplication":
                this.decimalProduct(Digits1, Digits2, operator);
                break;
            case "Division":
                this.decimalQuotient(Digits1, Digits2, operator);
                break;
        }
    }
    private void IndianRupeetoUKpounds(String input,String Value,String Output)
    {
        int a = Integer.parseInt(Value);
        double b = a * 0.00978 ;
        String exp = Double.toString(b);
//        System.out.println(b);
        DecimalFormat decfor = new DecimalFormat("0.0");
        decfor.setRoundingMode(RoundingMode.DOWN);
        String dotsinglevalue = decfor.format(b);
//        System.out.println(exp);
        String id = "Value2";
        String displayed = this.gettext(id);
        System.out.println(displayed);
        String[] s = displayed.split("to ");
        String[] x = s[1].split(" U");
        String actual = x[0];
        //double c = Double.parseDouble(actual);
//        System.out.println(actual);
        Assert.assertTrue(actual.contains(dotsinglevalue));
    }
    private void IndianRupeetoUSDollars(String input,String Value,String Output)
    {
        int a = Integer.parseInt(Value);
        double b = a * 0.01221 ;
        String exp = Double.toString(b);
//        System.out.println(b);
//        System.out.println(exp);
        DecimalFormat decfor = new DecimalFormat("0.0");
        decfor.setRoundingMode(RoundingMode.DOWN);
        String dotsinglevalue = decfor.format(b);
        String id = "Value2";
        String displayed = this.gettext(id);
        System.out.println(displayed);
        String[] s = displayed.split("to ");
        String[] x = s[1].split(" U");
        String actual = x[0];
        double c = Double.parseDouble(actual);
//        System.out.println(actual);
        Assert.assertTrue(actual.contains(dotsinglevalue));

    }
    private void IndianRupeetoUArab(String input,String Value,String Output)
    {
        int a = Integer.parseInt(Value);
        double b = a * 0.04485 ;
        String exp = Double.toString(b);
//        System.out.println(b);
//        System.out.println(exp);
        DecimalFormat decfor = new DecimalFormat("0.0");
        decfor.setRoundingMode(RoundingMode.DOWN);
        String dotsinglevalue = decfor.format(b);
        String id = "Value2";
        String displayed = this.gettext(id);
        System.out.println(displayed);
        String[] s = displayed.split("to ");
        String[] x = s[1].split(" U");
        String actual = x[0];
        double c = Double.parseDouble(actual);
//        System.out.println(actual);
        Assert.assertTrue(actual.contains(dotsinglevalue));
    }
    public void VerifyingCurrency(String input,String Value,String Output)
    {
        switch(Output)
        {
            case "United Kingdom Pound" :
                this.IndianRupeetoUKpounds(input, Value, Output);
                break;
            case "United Arab Emirates Dirham" :
                this.IndianRupeetoUArab(input, Value, Output);
                break;
//            case "United States Dollar" :
//                this.IndianRupeetoUSDollars(input, Value, Output);
//                break;
        }
    }
}
