package com.browserstack.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

/**
 * Page Object for the Google Home Page.
 */
public class HomePage {

    protected WebDriver driver;

    // 1. Element Locators
    private final By searchInput = By.name("q");
    // Using a more specific CSS selector for the search button for better reliability
    private final By searchButton = By.cssSelector("input[name='btnK']");

    // 2. Constructor
    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    // 3. Page Actions/Methods
    /**
     * Navigates to the Google homepage.
     */
    public void navigateTo() {
        driver.get("https://www.google.com/");
    }

    /**
     * Enters the search query into the search input field.
     * @param query The text to search for.
     */
    public void enterSearchQuery(String query) {
        WebElement searchField = driver.findElement(searchInput);
        searchField.sendKeys(query);
    }

    /**
     * Gets the title of the current page.
     * @return The page title as a String.
     */
    public String getPageTitle() {
        return driver.getTitle();
    }
}