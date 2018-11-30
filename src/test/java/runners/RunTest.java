package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "classpath:BookRoundFlightTrip.feature",
        glue = "classpath:steps",
        tags = "@Booking",
        format = {"pretty", "html:target/cucumber", "json:target/cucumber-report.json"})
public class RunTest {

}