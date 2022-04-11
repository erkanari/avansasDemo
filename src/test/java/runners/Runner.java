package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin={"html:target\\cucumber-raporlar.html"},
        features="src/test/resources/features",
        glue="stepDefinitions",
        tags="@avansas",
        dryRun=false
)
public class Runner {
}
