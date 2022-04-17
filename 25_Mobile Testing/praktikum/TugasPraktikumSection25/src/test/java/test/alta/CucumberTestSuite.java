package test.alta;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features",
        stepNotifications = true,
        plugin = "pretty",
        dryRun = false,
        glue = {"test.alta"})
public class CucumberTestSuite {
}
