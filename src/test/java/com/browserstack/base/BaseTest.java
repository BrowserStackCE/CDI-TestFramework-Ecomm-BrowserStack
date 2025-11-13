package com.browserstack.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import java.time.Duration;

/**
 * The base class for all tests, handling driver initialization and cleanup.
 */
public class BaseTest {

    protected WebDriver driver;

    /**
     * This method runs before each test. It initializes the ChromeDriver,
     * maximizes the window, and sets an implicit wait.
     */
    @BeforeMethod
    public void setUp() {
        // Selenium Manager automatically handles the driver setup.
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
    }

    /**
     * This method runs after each test. It quits the driver
     * to close the browser and end the session.
     */
    @AfterMethod
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}