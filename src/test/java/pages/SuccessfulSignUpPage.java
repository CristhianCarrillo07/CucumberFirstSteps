package pages;

import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import util.ScreenShot;

public class SuccessfulSignUpPage {
    private WebDriver driver;

    public SuccessfulSignUpPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void he_should_be_register_into_the_application() throws Throwable {
        String receivedURL = driver.getCurrentUrl();
        String expectedURL = "http://newtours.demoaut.com/create_account_success.php";
        Assert.assertTrue(expectedURL.equals(receivedURL));
        ScreenShot.takeScreenShot(driver);
    }
}