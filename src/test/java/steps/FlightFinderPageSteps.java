package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.FlightFinderPage;
import util.DriverFactory;

public class FlightFinderPageSteps extends DriverFactory {

    @Then("^he shold be in flightfinder page$")
    public void he_shold_be_in_flightfinder_page() throws Throwable {
        Assert.assertTrue(new FlightFinderPage(driver).he_shold_be_in_flightfinder_page());
    }

    @When("^he selects all the flightdetails$")
    public void he_selects_all_the_flightdetails() throws Throwable {
        new FlightFinderPage(driver).he_selects_all_the_flightdetails();
    }

    @When("^he selects all the preferences$")
    public void he_selects_all_the_preferences() throws Throwable {
        new FlightFinderPage(driver).he_selects_all_the_preferences();
    }

    @When("^he clicks on continue$")
    public void he_clicks_on_continue() throws Throwable {
        new FlightFinderPage(driver).he_clicks_on_continue();
    }
}
