package steps;

import cucumber.api.java.en.And;
import cucumber.api.java.en.When;
import util.DriverFactory;
import models.UserDetails;
import pages.SignUpPage;

import java.util.List;

public class SignUpPageSteps extends DriverFactory {
    @And("^he provides the first name as ([^\\\"]*)$")
    public void he_provides_the_first_name_as(String firstName) throws Throwable {
        new SignUpPage(driver).he_provides_the_first_name_as(firstName);
    }

    @And("^he provides the last name as ([^\\\"]*)$")
    public void he_provides_the_last_name_as(String lastName) throws Throwable {
        new SignUpPage(driver).he_provides_the_last_name_as(lastName);
    }

    @And("^he provides the phone as ([^\\\"]*)$")
    public void he_provides_the_phone_as(String phone) throws Throwable {
        new SignUpPage(driver).he_provides_the_phone_as(phone);
    }

    @And("^he provides the email as ([^\\\"]*)$")
    public void he_provides_the_email_as(String email) throws Throwable {
        new SignUpPage(driver).he_provides_the_email_as(email);
    }

    @And("^he provides the address as ([^\\\"]*)$")
    public void he_provides_the_address_as(String street) throws Throwable {
        new SignUpPage(driver).he_provides_the_address_as(street);
    }

    @And("^he provides the city as ([^\\\"]*)$")
    public void he_provides_the_city_as(String city) throws Throwable {
        new SignUpPage(driver).he_provides_the_city_as(city);
    }

    @And("^he provides the state as ([^\\\"]*)$")
    public void he_provides_the_state_as(String state) throws Throwable {
        new SignUpPage(driver).he_provides_the_state_as(state);
    }

    @And("^he provides the postal code as ([^\\\"]*)$")
    public void he_provides_the_postal_code_as(String postalCode) throws Throwable {
        new SignUpPage(driver).he_provides_the_postal_code_as(postalCode);
    }

    @When("^he selects the country$")
    public void he_selects_the_country() throws Throwable {
        new SignUpPage(driver).he_selects_the_country();
    }

    @And("^he provides the username as ([^\\\"]*)$")
    public void he_provides_the_username_as(String userName) throws Throwable {
        new SignUpPage(driver).he_provides_the_username_as(userName);
    }

    @And("^he provides the password as ([^\\\"]*)$")
    public void he_provides_the_password_as(String password) throws Throwable {
        new SignUpPage(driver).he_provides_the_password_as(password);
    }

    @And("^he provides the confirm password as ([^\\\"]*)$")
    public void he_provides_the_confirm_password_as(String confirmPassword) throws Throwable {
        new SignUpPage(driver).he_provides_the_confirm_password_as(confirmPassword);
    }

    @When("^he provides his details as follows:$")
    public void he_provides_his_details_as_follows(List<UserDetails> userDetails) throws Throwable {
        UserDetails userToBeSignedUp = userDetails.get(0);
        new SignUpPage(driver).he_provides_the_first_name_as(userToBeSignedUp.getFirstName());
        new SignUpPage(driver).he_provides_the_last_name_as(userToBeSignedUp.getLastName());
        new SignUpPage(driver).he_provides_the_phone_as(userToBeSignedUp.getPhone());
        new SignUpPage(driver).he_provides_the_email_as(userToBeSignedUp.getEmail());
        new SignUpPage(driver).he_provides_the_address_as(userToBeSignedUp.getAddress());
        new SignUpPage(driver).he_provides_the_city_as(userToBeSignedUp.getCity());
        new SignUpPage(driver).he_provides_the_state_as(userToBeSignedUp.getState());
        new SignUpPage(driver).he_provides_the_postal_code_as(userToBeSignedUp.getPostalCode());
        new SignUpPage(driver).he_selects_the_country();
        new SignUpPage(driver).he_provides_the_username_as(userToBeSignedUp.getUserName());
        new SignUpPage(driver).he_provides_the_password_as(userToBeSignedUp.getPassword());
        new SignUpPage(driver).he_provides_the_confirm_password_as(userToBeSignedUp.getConfirmPassword());
    }

    @When("^he click on submit$")
    public void he_click_on_submit() throws Throwable {
        new SignUpPage(driver).he_click_on_submit();
    }
}