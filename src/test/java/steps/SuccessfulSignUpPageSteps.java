package steps;

import cucumber.api.java.en.Then;
import util.DriverFactory;
import org.junit.Assert;
import util.ScreenShot;

public class SuccessfulSignUpPageSteps extends DriverFactory {
    @Then("^he should be register into the application$")
    public void he_should_be_register_into_the_application() throws Throwable {
        String receivedURL = driver.getCurrentUrl();
        String expectedURL = "http://newtours.demoaut.com/create_account_success.php";
        Assert.assertTrue(expectedURL.equals(receivedURL));
        ScreenShot.takeScreenShot(driver);
    }
}