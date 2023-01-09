package com.demoqa.runners;


import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(
        glue = "com.demoqa.stepdefinitions",
        features = "src/test/resources/Features/tablas_web.feature",
        snippets = SnippetType.CAMELCASE,
        monochrome = true,
        dryRun = false )

public class tablasWeb {
}
