package com.zerobank.runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;
//import cucumber.api.CucumberOptions
@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/cucumber.json",
                "html:target/default-html-reports",
                "rerun:target/rerun/rerun.text"
                },
        features = "src/test/resources/features",
        glue = "com/zerobank/step_definitions",
        dryRun =false,
       tags =  "@payBills"


)
public class CukesRunner {

}
