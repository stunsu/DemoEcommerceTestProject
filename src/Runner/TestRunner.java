package Runner;


import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin={"pretty", "html:test-output", "junit:junit_xml/cucumber.xml"},
        features= "/Users/tunsusorin/IdeaProjects/DemoEcommerceTestProject/src/Feature/GuestCheckout/GuestCheckout.feature",
        glue={"StepDefinitions"},
        monochrome = true
//                tags={"@SmokeTest"}
)
public class TestRunner {

}
