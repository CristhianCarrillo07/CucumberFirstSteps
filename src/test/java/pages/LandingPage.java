package pages;

import cucumber.api.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LandingPage {
    private WebDriver driver;
    @FindBy(xpath = "//a[text()='REGISTER']")
    private WebElement registerButton;
    @FindBy(xpath = "//input[@name='userName']")
    private WebElement userNameTextBox;
    @FindBy(xpath = "//input[@name='password']")
    private WebElement passwordTextBox;
    @FindBy(xpath = "//input[@name='login']")
    private WebElement loginButton;

    public LandingPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void he_chooses_to_register() throws Throwable {
        registerButton.click();
    }

    public void he_enters_his_username(String username) throws Throwable {
        userNameTextBox.sendKeys(username);
    }

    public void he_enters_his_password(String password) throws Throwable {
        passwordTextBox.sendKeys(password);
    }

    public void he_clicks_on_log_in() throws Throwable {
        loginButton.click();
    }
}