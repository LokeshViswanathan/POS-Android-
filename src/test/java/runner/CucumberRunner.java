package runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features/sale.feature",
        glue = "stepspack"
     // plugin ={"io.qameta.allure.cucumber5jvm.AllureCucumber5Jvm"}
      //  plugin = {"json:target/cucumber-report.json", "html:target/cucumber-report"}
)
public class CucumberRunner {
    // This class doesn't need any code inside
    // It just serves as the entry point for executing Cucumber tests
}
