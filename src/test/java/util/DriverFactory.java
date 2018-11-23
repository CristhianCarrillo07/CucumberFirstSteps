package util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DriverFactory {
    protected static WebDriver driver;

    public DriverFactory() {
        initialize();
    }

    private void initialize() {
        if (driver == null) {
            createNewDriverIntance();
        }
    }

    private void createNewDriverIntance() {
        System.setProperty("webdriver.chrome.driver", "C:\\Selenium drivers\\chromedriver.exe");
        driver = new ChromeDriver();
    }

    public WebDriver getDriver() {
        return driver;
    }

    public void destroyDriver() {
        driver.quit();
        driver = null;
    }
}
