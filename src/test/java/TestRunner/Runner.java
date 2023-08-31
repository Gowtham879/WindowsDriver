package TestRunner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        features="src/test/java/FeatureFile/Calculator.feature",
        glue="StepDefination",
        tags="@ArithmeticOperation1",
        monochrome=true,
        plugin={"pretty","io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm","json:target/cucumber.json"}
        )
public class Runner extends AbstractTestNGCucumberTests {
}
