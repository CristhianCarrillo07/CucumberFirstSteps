package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.SelectFlightPage;
import util.DriverFactory;

public class SelectFlighPageSteps extends DriverFactory {

    @Then("^he should be in select flight page$")
    public void he_should_be_in_select_flight_page() throws Throwable {
        Assert.assertTrue(new SelectFlightPage(driver).he_should_be_in_select_flight_page());
    }

    @When("^he selects the depart flight$")
    public void he_selects_the_depart_flight() throws Throwable {
        new SelectFlightPage(driver).he_selects_the_depart_flight();
    }

    @And("^he selects the return flight$")
    public void he_selects_the_return_flight() throws Throwable {
        new SelectFlightPage(driver).he_selects_the_return_flight();
    }

    @And("^he click on continue$")
    public void he_click_on_continue() throws Throwable {
        new SelectFlightPage(driver).he_click_on_continue();
    }
}