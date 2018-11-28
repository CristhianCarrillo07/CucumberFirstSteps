package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookFlightPage {
    private WebDriver driver;
    @FindBy(xpath = "//img[@src='/images/masts/mast_book.gif']")
    private WebElement bookFlight;
    @FindBy(xpath = "//input[@name='passFirst0']")
    private WebElement userNameTextBox;
    @FindBy(xpath = "//input[@name='passLast0']")
    private WebElement lastNameTextBox;
    @FindBy(xpath = "//input[@name='creditnumber']")
    private WebElement creditCardTextBox;
    @FindBy(xpath ="//input[@name='buyFlights']")
    private WebElement buttonPurchase;

    public BookFlightPage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }

    public boolean shold_be_in_bookflight_page() throws Throwable {
        return bookFlight.isDisplayed();
    }

    public void he_enters_his_firstname(String firstName) throws Throwable {
        userNameTextBox.sendKeys(firstName);
    }

    public void he_enters_his_lastname(String lastName) throws Throwable {
        lastNameTextBox.sendKeys(lastName);
    }

    public void he_enters_his_number_credit_card_number(int creditCardNumber) throws Throwable {
        creditCardTextBox.sendKeys(String.valueOf(creditCardNumber));
    }

    public void he_click_on_purchase() throws Throwable {
        buttonPurchase.click();
    }
}