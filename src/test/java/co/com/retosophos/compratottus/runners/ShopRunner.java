package co.com.retosophos.compratottus.runners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/feature/shop.feature",
        glue = "co.com.retosophos.compratottus.stepdefinitions",
        snippets = SnippetType.CAMELCASE
)
public class ShopRunner {
}
