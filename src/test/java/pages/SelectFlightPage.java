package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;
import java.util.Random;

public class SelectFlightPage {

    private WebDriver driver;
    @FindBy(xpath = "//img[@src='/images/masts/mast_selectflight.gif']")
    private WebElement selectFlight;
    @FindBy(xpath = "//input[@type='radio' and @name='outFlight']")
    private List<WebElement> departOptions;
    @FindBy(xpath = "//input[@type='radio' and @name='inFlight']")
    private List<WebElement> returnOptions;
    @FindBy(xpath = "//input[@name='reserveFlights']")
    private WebElement continueButton;

    public SelectFlightPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean he_should_be_in_select_flight_page() throws Throwable {
        return selectFlight.isDisplayed();
    }

    public void he_selects_the_depart_flight() throws Throwable {
        Random r = new Random();
        int departOption = r.nextInt(departOptions.size());
        departOptions.get(departOption).click();

    }

    public void he_selects_the_return_flight() throws Throwable {
        Random r = new Random();
        int returnOption = r.nextInt(returnOptions.size());
        returnOptions.get(returnOption).click();
    }

    public void he_click_on_continue() throws Throwable {
        continueButton.click();
    }
}