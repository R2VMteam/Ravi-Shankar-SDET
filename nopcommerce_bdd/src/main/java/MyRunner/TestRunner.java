package MyRunner;


import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "C:\\Users\\SUNITA\\Desktop\\ICT Testing\\Ravi-Shankar-SDET\\nopcommerce_bdd\\src\\main\\java\\Features",
        glue = {"stepDefinitions"},
        plugin = {
                "pretty",
                "html:target/cucumber-reports/cucumber-pretty",
                "json:target/cucumber-reports/CucumberTestReport.json",
                "rerun:target/cucumber-reports/rerun.txt",
                "json:target/cucumber-reports/CucumberTestReport.json"},
        monochrome = true,
        strict = true,
        dryRun = false)

public class TestRunner {

}