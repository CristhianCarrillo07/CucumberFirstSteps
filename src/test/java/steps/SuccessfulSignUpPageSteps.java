package steps;

import cucumber.api.java.en.Then;
import pages.SuccessfulSignUpPage;
import util.DriverFactory;
import org.junit.Assert;
import util.ScreenShot;

public class SuccessfulSignUpPageSteps extends DriverFactory {
    @Then("^he should be register into the application$")
    public void he_should_be_register_into_the_application() throws Throwable {
        new SuccessfulSignUpPage(driver).he_should_be_register_into_the_application();
    }
}