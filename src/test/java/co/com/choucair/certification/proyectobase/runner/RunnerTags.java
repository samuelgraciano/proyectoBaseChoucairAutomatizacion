package co.com.choucair.certification.proyectobase.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/academyChoucair.feature",
        glue = {"co.com.choucair.certification.proyectobase.stepdefinitions"},
        snippets = SnippetType.CAMELCASE
)
public class RunnerTags {
}
