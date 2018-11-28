package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pages.BookFlightPage;
import util.DriverFactory;

public class BookFlightPageSteps extends DriverFactory {

    @Then("^shold be in bookflight page$")
    public void shold_be_in_bookflight_page() throws Throwable {
        new BookFlightPage(driver).shold_be_in_bookflight_page();
    }

    @When("^he enters his firstname ([^\\\"]*)$")
    public void he_enters_his_firstname(String firstName) throws Throwable {
        new BookFlightPage(driver).he_enters_his_firstname(firstName);
    }

    @And("^he enters his lastname ([^\\\"]*)$")
    public void he_enters_his_lastname(String lastName) throws Throwable {
        new BookFlightPage(driver).he_enters_his_lastname(lastName);
    }

    @And("^he enters his number credit card number (\\d+)$")
    public void he_enters_his_number_credit_card_number(int creditCardNumber) throws Throwable {
        new BookFlightPage(driver).he_enters_his_number_credit_card_number(creditCardNumber);
    }

    @And("^he click on purchase$")
    public void he_click_on_purchase() throws Throwable {
        new BookFlightPage(driver).he_click_on_purchase();
    }
}