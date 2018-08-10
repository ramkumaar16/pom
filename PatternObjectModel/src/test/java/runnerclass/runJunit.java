package runnerclass;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features= {"src/test/java/features"}, glue= {"pages","runnerclass"},
strict=true,tags= {"@smoke or @sanity"},plugin= {"html:target/reports"},monochrome=true)
public class runJunit {

}
