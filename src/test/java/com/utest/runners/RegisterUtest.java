package com.utest.runners;

import io.cucumber.junit.CucumberOptions;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith( CucumberWithSerenity.class)
@CucumberOptions(
        features = "src/test/resources/features/registerUtest.feature",
        glue = "com.utest.stepdefinitions",
        snippets = CucumberOptions.SnippetType.CAMELCASE,
        plugin = {"pretty"}
)
public class RegisterUtest {
}


