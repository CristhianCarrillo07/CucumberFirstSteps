package pages;

import cucumber.api.java.en.Then;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SuccesfulBookingFlightPage {

    private WebDriver driver;
    @FindBy(xpath = "//img[@src='/images/masts/mast_confirmation.gif']")
    private WebElement flightConfirmation;

    public SuccesfulBookingFlightPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean he_should_have_already_booked_a_flight() throws Throwable {
        return flightConfirmation.isDisplayed();
    }
}