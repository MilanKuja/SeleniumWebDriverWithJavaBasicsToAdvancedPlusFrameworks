package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class slackWeightStationDriverName {
    public static void main(String[] args) throws InterruptedException {


        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.speedgauge.net/login?redirect_to=https%3A%2F%2Fwww.speedgauge.net%2Fares%2Fcustomers");
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Actions actions = new Actions(driver);

        //LogIn Info
        String email = "speedgauge@routemate.us";
        String password = "VfgxbrSJ";

        //Element Xpaths
        String userNameInput = "//input[@id='login-username']";
        String passwordInput = "//input[@id='login-password']";
        String submitSignIn = "//input[@id='login-submit']";
        String addButton = "//button[normalize-space()='Add']";
        String nameInput = "//input[@name='customerName']";
        String aliasInput = "//input[@name='alias']";
        String countrySelect = "//div[@class='field-select--multi__indicator field-select--multi__dropdown-indicator css-1xc3v61-indicatorContainer']";
        String countrySelectDropDown = ".field-select--multi__control";
        String platformDropDown = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(2) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(8) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2)";
        String buttonClose = "//button[normalize-space()='Close']";
        String tierDropDown = "body > div:nth-child(2) > div:nth-child(1) > div:nth-child(2) > main:nth-child(1) > div:nth-child(3) > form:nth-child(1) > div:nth-child(3) > div:nth-child(1) > fieldset:nth-child(1) > div:nth-child(4) > div:nth-child(2) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2)";
        String submitCompanyButton = "//button[@type='submit']";
        String customerList = "//span[@class='_nav-link__label_1ukyo_15']";
        String disableActiveTrue = "div[class='_search__option_1geg3_450'] svg";
        String searchCompany = "//div[@class='_field__input_1geg3_37 _field__input--search_1geg3_76']/input";
        String companyBox = "//div[@class='_box__header_16uwh_8']/div/h1";

        //Company Info
        String companyName = "TRUPKO BROTHERS TRANS INC";
        String alias = "jp3twgx8";


        //LogIn Page
        driver.findElement(By.xpath(userNameInput)).sendKeys(email);
        driver.findElement(By.xpath(passwordInput)).sendKeys(password);
        driver.findElement(By.xpath(submitSignIn)).click();

        //Add button
        driver.findElement(By.xpath(addButton)).click();

        //Add company
        driver.findElement(By.xpath(nameInput)).sendKeys(companyName);
        driver.findElement(By.xpath(aliasInput)).sendKeys(alias);
        driver.findElement(By.xpath(countrySelect)).click();
        actions.sendKeys(driver.findElement(By.cssSelector(countrySelectDropDown)), "United St").build().perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.sendKeys(driver.findElement(By.cssSelector(platformDropDown)), "Route").perform();
        actions.sendKeys(Keys.ENTER).perform();
        driver.findElement(By.xpath(buttonClose)).click();
        actions.sendKeys(driver.findElement(By.cssSelector(tierDropDown)), "Class").perform();
        actions.sendKeys(Keys.ENTER).perform();
        actions.scrollToElement(driver.findElement(By.xpath(submitCompanyButton))).perform();
        Thread.sleep(3000);
        driver.findElement(By.xpath(submitCompanyButton)).click();
        Thread.sleep(5000);
//        actions.scrollToElement(driver.findElement(By.xpath(customerList))).build().perform();
//        driver.findElement(By.xpath(customerList)).click();
//        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(searchCompany)));
//        driver.findElement(By.cssSelector(disableActiveTrue)).click();
//        Thread.sleep(2000);
//        driver.findElement(By.xpath(searchCompany)).click();
//        driver.findElement(By.xpath(searchCompany)).sendKeys("Rjtechtrmsport");
//        Thread.sleep(2000);
//       actions.sendKeys(driver.findElement(By.xpath(searchCompany)), companyName).build().perform();
//        actions.sendKeys(Keys.ENTER).perform();
//        if (driver.findElement(By.xpath(companyBox)).getText().contains(companyName)) {
//            System.out.println("Company Added");
//            Assert.assertTrue(true);
//        } else {
//            Assert.assertTrue(false);
//        }


        driver.quit();










    }
}
