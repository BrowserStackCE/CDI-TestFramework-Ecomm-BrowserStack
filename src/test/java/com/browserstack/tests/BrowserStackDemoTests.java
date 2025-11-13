package com.browserstack.tests;
import com.browserstack.base.BaseTest;
import com.browserstack.v2.utils.BrowserStack;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;
import org.openqa.selenium.JavascriptExecutor;

import java.time.Duration;


public class BrowserStackDemoTests extends BaseTest {

    @Test(groups = {"E2E"})
    public void E2E_test() {
            System.out.println("Opening the website");
            driver.get("https://ecommercebs.vercel.app/");

            //Mapping the Test case ID
            BrowserStack.setCustomTag("ID", "TC-1420530");
            System.out.println("Mapping the Test case ID");

            //Clicking on the User icon
            driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
            System.out.println("Clicking on the User icon");

            //Entering Valid email
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
            System.out.println("Entering Valid email");

            //Entering Valid password
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
            System.out.println("Entering Valid password");

            //Clicking on Submit
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            System.out.println("Clicking on Submit");

            //Going back from user deatils
            String backButtonCss = "button:has(svg.lucide-arrow-left)";
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
            backButton.click();
            System.out.println("Going back from user deatils page");

            //Clicking on the Men category
            driver.findElement(By.xpath("//button[normalize-space()='Men']")).click();
            System.out.println("Clicking on the Men's category");

            //Clicking on the poloshirt
            String poloShirtSelector = "img[alt='Polo Shirt']";
            WebElement poloShirtImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(poloShirtSelector)));
            poloShirtImage.click();
            System.out.println("Clicking on the poloshirt");

            //Selecting XL size
            String xlButtonXPath = "//button[text()='XL']";
            WebElement xlSizeButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xlButtonXPath)));
            xlSizeButton.click();
            System.out.println("Selecting XL size");

            //Add to cart
            String addToCartXPath = "//button[contains(text(), 'Add to Cart')]";
            WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToCartXPath)));
            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("arguments[0].click();", addToCartButton);
            System.out.println("Add to cart");

            //Going to Cart
            String cartButtonCss = "button:has(svg.lucide-shopping-bag)";
            WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cartButtonCss)));
            cartButton.click();
            System.out.println("Going to Cart");

            //Proceed to Checkout
            String checkoutXPath = "//button[text()='Proceed to Checkout']";
            WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutXPath)));
            checkoutButton.click();
            System.out.println("Proceed to Checkout");

            //Entering Email for shipping
            String userEmail = "perm_11dca1e7_001@bstackinbox.com";
            WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
            emailInput.sendKeys(userEmail);
            System.out.println("Entering Email for shipping");

            //Shipping Address
            String firstName = "John";
            String lastName = "Doe";
            String address = "123 Main St";
            String apartment = "Apt 4B";
            String city = "Anytown";
            String state = "California"; // This must match the text of the option you want
            String zipCode = "12345";
            String phone = "555-123-4567";

            // First name
            WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
            firstNameInput.sendKeys(firstName);
            System.out.println("Entering First name");

            // Last name
            WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
            lastNameInput.sendKeys(lastName);
            System.out.println("Entering Last name");

            // Address
            WebElement addressInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
            addressInput.sendKeys(address);
            System.out.println("Entering Address");

            // Apartment (Optional)
            WebElement apartmentInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("apartment")));
            apartmentInput.sendKeys(apartment);
            System.out.println("Entering Apartment");

            // City
            WebElement cityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
            cityInput.sendKeys(city);
            System.out.println("Entering City");

            // ZIP code
            WebElement zipCodeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zipCode")));
            zipCodeInput.sendKeys(zipCode);
            System.out.println("Entering ZIP code");

            // Phone
            WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
            phoneInput.sendKeys(phone);
            System.out.println("Entering Phone");

            //State Dropdown
            String stateTriggerXPath = "//label[text()='State']/following-sibling::button";
            WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stateTriggerXPath)));
            stateDropdown.click();
            String stateOptionXPath = String.format("//div[@role='option'][span[normalize-space()='%s']]", state);
            WebElement stateOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stateOptionXPath)));
            stateOption.click();
            System.out.println("Entering State");

            //Payment Details
            String cardNumber = "4242424242424242";
            String nameOnCard = "Jane Doe";
            String expiryDate = "12/28";
            String cvv = "123";

            // Card Number
            WebElement cardNumberInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cardNumber")));
            cardNumberInput.sendKeys(cardNumber);
            System.out.println("Entering Card Number");

            // Name on Card
            WebElement nameOnCardInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("nameOnCard")));
            nameOnCardInput.sendKeys(nameOnCard);
            System.out.println("Entering Name on Card");

            // Expiry Date
            WebElement expiryDateInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("expiryDate")));
            expiryDateInput.sendKeys(expiryDate);
            System.out.println("Entering Expiry Date");

            // CVV
            WebElement cvvInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("cvv")));
            cvvInput.sendKeys(cvv);
            System.out.println("Entering CVV");

            // "Save this information" checkbox
            WebElement saveInfoCheckbox = wait.until(ExpectedConditions.presenceOfElementLocated(By.id("saveInfo")));
            js.executeScript("arguments[0].scrollIntoView({block: 'center'});", saveInfoCheckbox);
            js.executeScript("arguments[0].click();", saveInfoCheckbox);
            System.out.println("Saving card info");

            //Complete Order
            String completeOrderXPath = "//button[@type='submit']";
            WebElement completeOrderButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(completeOrderXPath)));
            completeOrderButton.click();
            System.out.println("Click command sent.");

            //Download Receipt
            String downloadButtonXPath = "//button[normalize-space()='Download Receipt']";
            WebElement downloadButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(downloadButtonXPath)));
            downloadButton.click();
            System.out.println("Clicking Download Receipt");

            //Home Page
            String homepageLogoCss = "button:has(img[alt='FashionStack Logo'])";
            WebElement homepageLogo = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(homepageLogoCss)));
            homepageLogo.click();
            System.out.println("Clicking Home Page");
            System.out.println("Test Case completed");




    }

    @Test(groups = {"Camera Injection"})
    public void camera_injection(){
            System.out.println("Opening the website");
            driver.get("https://ecommercebs.vercel.app/");

            //Mapping the Test case ID
            BrowserStack.setCustomTag("ID", "TC-282");
            System.out.println("Mapping the Test case ID");

            //Clicking on the User icon
            driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
            System.out.println("Clicking on the User icon");

            //Entering Valid email
            driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
            System.out.println("Entering Valid email");

            //Entering Valid password
            driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
            System.out.println("Entering Valid password");

            //Clicking on Submit
            driver.findElement(By.xpath("//button[@type='submit']")).click();
            System.out.println("Clicking on Submit");

            //Going back from user deatils
            String backButtonCss = "button:has(svg.lucide-arrow-left)";
            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
            WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
            backButton.click();
            System.out.println("Going back from user deatils page");




    }
    @Test(groups = {"Smoke"})
    public void Login_test() {
                System.out.println("Opening the website");
                driver.get("https://ecommercebs.vercel.app/");

                //Mapping the Test case ID
                BrowserStack.setCustomTag("ID", "TC-1420531");
                System.out.println("Mapping the Test case ID");

                //Clicking on the User icon
                driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
                System.out.println("Clicking on the User icon");

                //Entering Valid email
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
                System.out.println("Entering Valid email");

                //Entering Valid password
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
                System.out.println("Entering Valid password");

                //Clicking on Submit
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                System.out.println("Clicking on Submit");

                //Going back from user deatils
                String backButtonCss = "button:has(svg.lucide-arrow-left)";
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
                backButton.click();
                System.out.println("Going back from user deatils page");

        }


        @Test(groups = {"Smoke"})
        public void AddToCart_test() {
                System.out.println("Opening the website");
                driver.get("https://ecommercebs.vercel.app/");

                //Mapping the Test case ID
                BrowserStack.setCustomTag("ID", "TC-1420532");
                System.out.println("Mapping the Test case ID");

                //Clicking on the User icon
                driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
                System.out.println("Clicking on the User icon");

                //Entering Valid email
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
                System.out.println("Entering Valid email");

                //Entering Valid password
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
                System.out.println("Entering Valid password");

                //Clicking on Submit
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                System.out.println("Clicking on Submit");

                //Going back from user deatils
                String backButtonCss = "button:has(svg.lucide-arrow-left)";
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
                backButton.click();
                System.out.println("Going back from user deatils page");

                //Clicking on the Men category
                driver.findElement(By.xpath("//button[normalize-space()='Men']")).click();
                System.out.println("Clicking on the Men's category");

                //Clicking on the poloshirt
                String poloShirtSelector = "img[alt='Polo Shirt']";
                WebElement poloShirtImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(poloShirtSelector)));
                poloShirtImage.click();
                System.out.println("Clicking on the poloshirt");

                //Add to cart
                String addToCartXPath = "//button[contains(text(), 'Add to Cart')]";
                WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToCartXPath)));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", addToCartButton);
                System.out.println("Add to cart");

        }

        @Test(groups = {"Smoke"})
        public void GoToCart_test() {
                System.out.println("Opening the website");
                driver.get("https://ecommercebs.vercel.app/");

                //Mapping the Test case ID
                BrowserStack.setCustomTag("ID", "TC-1420533");
                System.out.println("Mapping the Test case ID");

                //Clicking on the User icon
                driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
                System.out.println("Clicking on the User icon");

                //Entering Valid email
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
                System.out.println("Entering Valid email");

                //Entering Valid password
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
                System.out.println("Entering Valid password");

                //Clicking on Submit
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                System.out.println("Clicking on Submit");

                //Going back from user deatils
                String backButtonCss = "button:has(svg.lucide-arrow-left)";
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
                backButton.click();
                System.out.println("Going back from user deatils page");

                //Clicking on the Men category
                driver.findElement(By.xpath("//button[normalize-space()='Men']")).click();
                System.out.println("Clicking on the Men's category");

                //Clicking on the poloshirt
                String poloShirtSelector = "img[alt='Polo Shirt']";
                WebElement poloShirtImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(poloShirtSelector)));
                poloShirtImage.click();
                System.out.println("Clicking on the poloshirt");

                //Add to cart
                String addToCartXPath = "//button[contains(text(), 'Add to Cart')]";
                WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToCartXPath)));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", addToCartButton);
                System.out.println("Add to cart");
                //Going to Cart
                String cartButtonCss = "button:has(svg.lucide-shopping-bag)";
                WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cartButtonCss)));
                cartButton.click();
                System.out.println("Going to Cart");

        }

        @Test(groups = {"Smoke"})
        public void CheckOut_test() {
                System.out.println("Opening the website");
                driver.get("https://ecommercebs.vercel.app/");

                //Mapping the Test case ID
                BrowserStack.setCustomTag("ID", "TC-1420533");
                System.out.println("Mapping the Test case ID");

                //Clicking on the User icon
                driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
                System.out.println("Clicking on the User icon");

                //Entering Valid email
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
                System.out.println("Entering Valid email");

                //Entering Valid password
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
                System.out.println("Entering Valid password");

                //Clicking on Submit
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                System.out.println("Clicking on Submit");

                //Going back from user deatils
                String backButtonCss = "button:has(svg.lucide-arrow-left)";
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
                backButton.click();
                System.out.println("Going back from user deatils page");

                //Clicking on the Men category
                driver.findElement(By.xpath("//button[normalize-space()='Men']")).click();
                System.out.println("Clicking on the Men's category");

                //Clicking on the poloshirt
                String poloShirtSelector = "img[alt='Polo Shirt']";
                WebElement poloShirtImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(poloShirtSelector)));
                poloShirtImage.click();
                System.out.println("Clicking on the poloshirt");

                //Add to cart
                String addToCartXPath = "//button[contains(text(), 'Add to Cart')]";
                WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToCartXPath)));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", addToCartButton);
                System.out.println("Add to cart");
                //Going to Cart
                String cartButtonCss = "button:has(svg.lucide-shopping-bag)";
                WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cartButtonCss)));
                cartButton.click();
                System.out.println("Going to Cart");
                //Proceed to Checkout
                String checkoutXPath = "//button[text()='Proceed to Checkout']";
                WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutXPath)));
                checkoutButton.click();
                System.out.println("Proceed to Checkout");

        }

        @Test(groups = {"Smoke"})
        public void ShippingAddress_test() {
                System.out.println("Opening the website");
                driver.get("https://ecommercebs.vercel.app/");

                //Mapping the Test case ID
                BrowserStack.setCustomTag("ID", "TC-1420534");
                System.out.println("Mapping the Test case ID");

                //Clicking on the User icon
                driver.findElement(By.cssSelector("button:has(svg.lucide-user)")).click();
                System.out.println("Clicking on the User icon");

                //Entering Valid email
                driver.findElement(By.xpath("//input[@type='email']")).sendKeys("perm_11dca1e7_001@bstackinbox.com");
                System.out.println("Entering Valid email");

                //Entering Valid password
                driver.findElement(By.xpath("//input[@type='password']")).sendKeys("Thisispassword@1807");
                System.out.println("Entering Valid password");

                //Clicking on Submit
                driver.findElement(By.xpath("//button[@type='submit']")).click();
                System.out.println("Clicking on Submit");

                //Going back from user deatils
                String backButtonCss = "button:has(svg.lucide-arrow-left)";
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement backButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(backButtonCss)));
                backButton.click();
                System.out.println("Going back from user deatils page");

                //Clicking on the Men category
                driver.findElement(By.xpath("//button[normalize-space()='Men']")).click();
                System.out.println("Clicking on the Men's category");

                //Clicking on the poloshirt
                String poloShirtSelector = "img[alt='Polo Shirt']";
                WebElement poloShirtImage = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(poloShirtSelector)));
                poloShirtImage.click();
                System.out.println("Clicking on the poloshirt");

                //Add to cart
                String addToCartXPath = "//button[contains(text(), 'Add to Cart')]";
                WebElement addToCartButton = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(addToCartXPath)));
                JavascriptExecutor js = (JavascriptExecutor) driver;
                js.executeScript("arguments[0].click();", addToCartButton);
                System.out.println("Add to cart");
                //Going to Cart
                String cartButtonCss = "button:has(svg.lucide-shopping-bag)";
                WebElement cartButton = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector(cartButtonCss)));
                cartButton.click();
                System.out.println("Going to Cart");
                //Proceed to Checkout
                String checkoutXPath = "//button[text()='Proceed to Checkout']";
                WebElement checkoutButton = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(checkoutXPath)));
                checkoutButton.click();
                System.out.println("Proceed to Checkout");
                //Entering Email for shipping
                String userEmail = "perm_11dca1e7_001@bstackinbox.com";
                WebElement emailInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("email")));
                emailInput.sendKeys(userEmail);
                System.out.println("Entering Email for shipping");

                //Shipping Address
                String firstName = "John";
                String lastName = "Doe";
                String address = "123 Main St";
                String apartment = "Apt 4B";
                String city = "Anytown";
                String state = "California"; // This must match the text of the option you want
                String zipCode = "12345";
                String phone = "555-123-4567";

                // First name
                WebElement firstNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("firstName")));
                firstNameInput.sendKeys(firstName);
                System.out.println("Entering First name");

                // Last name
                WebElement lastNameInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("lastName")));
                lastNameInput.sendKeys(lastName);
                System.out.println("Entering Last name");

                // Address
                WebElement addressInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("address")));
                addressInput.sendKeys(address);
                System.out.println("Entering Address");

                // Apartment (Optional)
                WebElement apartmentInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("apartment")));
                apartmentInput.sendKeys(apartment);
                System.out.println("Entering Apartment");

                // City
                WebElement cityInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("city")));
                cityInput.sendKeys(city);
                System.out.println("Entering City");

                // ZIP code
                WebElement zipCodeInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("zipCode")));
                zipCodeInput.sendKeys(zipCode);
                System.out.println("Entering ZIP code");

                // Phone
                WebElement phoneInput = wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("phone")));
                phoneInput.sendKeys(phone);
                System.out.println("Entering Phone");

                //State Dropdown
                String stateTriggerXPath = "//label[text()='State']/following-sibling::button";
                WebElement stateDropdown = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(stateTriggerXPath)));
                stateDropdown.click();
                String stateOptionXPath = String.format("//div[@role='option'][span[normalize-space()='%s']]", state);
                WebElement stateOption = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(stateOptionXPath)));
                stateOption.click();
                System.out.println("Entering State");

        }

}