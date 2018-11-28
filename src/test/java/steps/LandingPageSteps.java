package steps;

import cucumber.api.java.en.When;
import models.UserDetails;
import util.DriverFactory;
import pages.LandingPage;

import java.util.List;

public class LandingPageSteps extends DriverFactory {
    @When("^he click on register$")
    public void he_chooses_to_register() throws Throwable {
        new LandingPage(driver).he_chooses_to_register();
    }

    @When("he enters his username ([^\\\"]*)$")
    public void he_enters_his_username(String username) throws Throwable {
        new LandingPage(driver).he_enters_his_username(username);
    }

    @When("^he enters his password ([^\\\"]*)$")
    public void he_enters_his_password_mercury(String password) throws Throwable {
        new LandingPage(driver).he_enters_his_password(password);
    }

    @When("^he clicks on log in$")
    public void he_clicks_on_log_in() throws Throwable {
        new LandingPage(driver).he_clicks_on_log_in();
    }
}