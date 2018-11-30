package pages;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;
import util.ScreenShot;

import java.io.IOException;
import java.util.List;
import java.util.Random;

public class FlightFinderPage {
    private WebDriver driver;
    @FindBy(xpath = "//img[@src='/images/masts/mast_flightfinder.gif']")
    private WebElement flightFinder;
    @FindBy(xpath = "//select[@name='passCount']")
    private WebElement selectorPassengers;
    @FindBy(xpath = "//select[@name='fromPort']")
    private WebElement selectorFromPort;
    @FindBy(xpath = "//select[@name='fromMonth']")
    private WebElement selectorFromMonth;
    @FindBy(xpath = "//select[@name='fromDay']")
    private WebElement selectorFromDay;
    @FindBy(xpath = "//select[@name='toPort']")
    private WebElement selectorToPort;
    @FindBy(xpath = "//select[@name='toMonth']")
    private WebElement selectorToMonth;
    @FindBy(xpath = "//select[@name='toDay']")
    private WebElement selectorToDay;
    @FindBy(xpath = "//select[@name='airline']")
    private WebElement selectorAirline;
    @FindBy(xpath = "//input[@name='findFlights']")
    private WebElement continueButton;
    @FindBy(xpath = "//input[@name='servClass']")
    private List<WebElement> serviceClassOptions;
    public static int noPassengers;

    public FlightFinderPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public boolean he_shold_be_in_flightfinder_page() {
        return flightFinder.isDisplayed();
    }

    public void he_selects_all_the_flightdetails() throws Throwable {
        Select dropPassengers = new Select(selectorPassengers);
        Select dropFromPort = new Select(selectorFromPort);
        Select dropFromMonth = new Select(selectorFromMonth);
        Select dropFromDay = new Select(selectorFromDay);
        Select dropToPort = new Select(selectorToPort);
        Select dropToMonth = new Select(selectorToMonth);
        Select dropToDay = new Select(selectorToDay);
        Random r = new Random();
        noPassengers = r.nextInt(dropPassengers.getOptions().size());
        dropPassengers.selectByIndex(noPassengers);
        dropFromPort.selectByIndex(r.nextInt(dropFromPort.getOptions().size()));
        dropFromMonth.selectByIndex(r.nextInt(dropFromMonth.getOptions().size()));
        dropFromDay.selectByIndex(r.nextInt(dropFromDay.getOptions().size()));
        dropToPort.selectByIndex(r.nextInt(dropToPort.getOptions().size()));
        dropToMonth.selectByIndex(r.nextInt(dropToMonth.getOptions().size()));
        dropToDay.selectByIndex(r.nextInt(dropToDay.getOptions().size()));
    }

    public void he_selects_all_the_preferences() throws Throwable {
        Random r = new Random();
        int serviceOption = r.nextInt(serviceClassOptions.size());
        serviceClassOptions.get(serviceOption).click();
        Select dropAirline = new Select(selectorAirline);
        dropAirline.selectByIndex(r.nextInt(4));
    }

    public void he_clicks_on_continue() throws Throwable {
        continueButton.click();
    }
}