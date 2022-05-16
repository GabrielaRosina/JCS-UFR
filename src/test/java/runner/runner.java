package runner;
import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.runner.RunWith;
import pages.BasePage;


@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/features",
        glue = "steps",
        plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:", "json:target/cucumber-reports.json"},
        //plugin = { "pretty", "html:target/cucumber-reports"},
        monochrome = true,
        tags = "@Amazon"
)


public class runner {
    @AfterClass
    public static void CleanBrowser(){
        BasePage.closeBrowser();
}


}
