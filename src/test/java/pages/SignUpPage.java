package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import java.util.Random;

public class SignUpPage {
    private WebDriver driver;
    @FindBy(name = "firstName")
    private WebElement firstNameTextBox;
    @FindBy(name = "lastName")
    private WebElement lastNameTextBox;
    @FindBy(name = "phone")
    private WebElement phoneTextBox;
    @FindBy(name = "userName")
    private WebElement emailTextBox;
    @FindBy(name = "address1")
    private WebElement address1TextBox;
    @FindBy(name = "city")
    private WebElement cityTextBox;
    @FindBy(name = "state")
    private WebElement stateTextBox;
    @FindBy(name = "postalCode")
    private WebElement postalCodeTextBox;
    @FindBy(name = "country")
    private WebElement selectorCountry;
    @FindBy(name = "email")
    private WebElement userNameTextBox;
    @FindBy(name = "password")
    private WebElement passwordTextBox;
    @FindBy(name = "confirmPassword")
    private WebElement confirmPasswordTextBox;
    @FindBy(name = "register")
    private WebElement submitButton;

    public SignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void he_provides_the_first_name_as(String firstName) throws Throwable {
        firstNameTextBox.sendKeys(firstName);
    }

    public void he_provides_the_last_name_as(String lastName) throws Throwable {
        lastNameTextBox.sendKeys(lastName);
    }

    public void he_provides_the_phone_as(String phone) throws Throwable {
        phoneTextBox.sendKeys(phone);
    }

    public void he_provides_the_email_as(String email) throws Throwable {
        emailTextBox.sendKeys(email);
    }

    public void he_provides_the_address_as(String street) throws Throwable {
        address1TextBox.sendKeys(street);
    }

    public void he_provides_the_city_as(String city) throws Throwable {
        cityTextBox.sendKeys(city);
    }

    public void he_provides_the_state_as(String state) throws Throwable {
        stateTextBox.sendKeys(state);
    }

    public void he_provides_the_postal_code_as(String postalCode) throws Throwable {
        postalCodeTextBox.sendKeys(postalCode);
    }

    public void he_selects_the_country() throws Throwable {
        Select dropCountry = new Select(selectorCountry);
        Random r = new Random();
        dropCountry.selectByIndex(r.nextInt(255) + 1);
    }

    public void he_provides_the_username_as(String userName) throws Throwable {
        userNameTextBox.sendKeys(userName);
    }

    public void he_provides_the_password_as(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }

    public void he_provides_the_confirm_password_as(String confirmPassword) throws Throwable {
        confirmPasswordTextBox.sendKeys(confirmPassword);
    }

    public void he_click_on_submit() throws Throwable {
        submitButton.click();
    }
}