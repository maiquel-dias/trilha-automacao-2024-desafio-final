package desafio_final;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/java/resources/features",
        glue = "desafio_final.steps",
        tags = "@Feature",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        //dryRun = false,
        plugin = {
                "pretty",
                "html:reports/cucumber.html",
                "json:reports/cucumver.json",
                "junit:reports/cucumber.xml",
        }
)

public class Runner {
}
