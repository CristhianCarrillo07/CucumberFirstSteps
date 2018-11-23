package steps;

import cucumber.api.java.en.When;
import util.DriverFactory;
import pages.LandingPage;

public class LandingPageSteps extends DriverFactory {
    @When("^he click on register$")
    public void he_chooses_to_register() throws Throwable {
        new LandingPage(driver).he_chooses_to_register();
    }
}
