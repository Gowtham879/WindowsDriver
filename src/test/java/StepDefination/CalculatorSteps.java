package StepDefination;

import PageObjects.ArithmeticOperationPage;
import PageObjects.CalculatorPage;
import PageObjects.ExpectedResultPage;
import Utilities.BaseClass;
import Utilities.WinCommands;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Scenario;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.qameta.allure.Allure;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import java.io.ByteArrayInputStream;
import java.io.IOException;

public class CalculatorSteps extends WinCommands {
    BaseClass baseClass=new BaseClass();
    WinCommands commands=new WinCommands();
    CalculatorPage calculator=new CalculatorPage();
    ExpectedResultPage expectresult=new ExpectedResultPage();
    ArithmeticOperationPage arithmeticOperation=new ArithmeticOperationPage();
    @Given("User is able to Open the  Windows Calculator")
    public void user_is_able_to_Open_the_Windows_Calculator() throws IOException {
     baseClass.OpenApplication();
    }
//----------------------------------------Arithmetic_Operation----------------------------------------------
    @When("User is able Select the two Number {string} and {string} perform the {string}")
    public void user_is_able_Select_the_two_Number_and_perform_the(String Digits1, String Digits2, String operation) {
        calculator.navigation();
        calculator.standard( );
        arithmeticOperation.arthematicOperation(Digits1,Digits2, operation);
    }
    @When("get the operation results of {string} and {string} {string}")
    public void get_the_operation_results_of_and(String Digits1, String Digits2, String operation) {
        expectresult.verification(Digits1,Digits2,operation);
    }
// --------------------------------------Decimal_Arithmetic_Operation---------------------------------------
    @When("User is able Select the two decimalNumber {string} and {string} perform the {string}")
    public void user_is_able_Select_the_two_decimalNumber_and_perform_the(String Digits1, String Digits2, String operation) {
     arithmeticOperation.DecimalArithmeticOperation(Digits1,Digits2,operation);
    }

    @When("get the operation results of decimalNumbers {string} and {string} {string}")
    public void get_the_operation_results_of_decimalNumbers_and(String Digits1, String Digits2, String operation) {
    expectresult.verifyingDecimalArithmeticOperations(Digits1,Digits2,operation);
    }
//----------------------------------------Currency---------------------------------------------------------
    @When("Enter the Input currency unit {string}")
    public void enter_the_Input_currency_unit(String Countrycurrency) {
        calculator.currency(Countrycurrency);
    }

    @When("Enter the currency values {string}")
    public void enter_the_currency_values(String Value) {
        calculator.Digit1(Value);
    }

    @When("Enter the Output currency unit {string}")
    public void enter_the_Output_currency_unit(String Countrycurrency) {
    calculator.outputunit();
    calculator.OutputCurrency(Countrycurrency);
    }

    @Then("Validate the output currency value of {string} {string} {string}")
    public void validate_the_output_currency_value_of(String input, String Value, String Output) throws IOException {
       expectresult.VerifyingCurrency(input,Value,Output);
       baseClass.CloseApplication();
    }
    @Then("Verify the Results")
    public void verify_the_Results() throws IOException {
     baseClass.CloseApplication();
    }
    //---------------------------------Defect ScreenShot----------------------------------------------------//

    @AfterStep
    public void takeScreenshot(Scenario scenario) throws IOException
    {
        if (scenario.isFailed())
        {
            byte[] scrennshot = ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
            Allure.addAttachment("ScreenShot", new ByteArrayInputStream(scrennshot));
        }
    }
}


