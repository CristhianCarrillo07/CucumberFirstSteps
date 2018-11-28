package steps;

import cucumber.api.java.en.Then;
import org.junit.Assert;
import pages.SuccesfulBookingFlightPage;
import util.DriverFactory;

public class SuccessfulBookingFlightPageSteps extends DriverFactory {

    @Then("^he should have already booked a flight$")
    public void he_should_have_already_booked_a_flight() throws Throwable {
        Assert.assertTrue(new SuccesfulBookingFlightPage(driver).he_should_have_already_booked_a_flight());
    }
}