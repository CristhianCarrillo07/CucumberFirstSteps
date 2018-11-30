package steps;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import pages.LandingPage;
import util.DriverFactory;
import org.openqa.selenium.WebDriver;

public class StartingSteps extends DriverFactory {
    private WebDriver driver;

    @Before
    public void beforeScenario(){
        driver =  new DriverFactory().getDriver();
    }

    @Given("^the user is on landing page$")
    public void the_user_is_on_landing_page() throws Throwable {
        //new LandingPage(driver).get();
        driver.get("http://newtours.demoaut.com/");
        driver.manage().window().maximize();
    }

    @After
    public void afterScenario(){
        new DriverFactory().destroyDriver();
    }
}