import org.junit.jupiter.api.Assertions;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

public class base {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");


        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Apple", "Cauliflower"};
        addItems(driver, itemsNeeded);
        driver.findElement(By.cssSelector("img[alt='Cart']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")));
        driver.findElement(By.xpath("//button[normalize-space()='PROCEED TO CHECKOUT']")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@class = 'promoWrapper']/input")));
        driver.findElement(By.xpath("//div[@class = 'promoWrapper']/input")).sendKeys("rahulshettyacademy");
        driver.findElement(By.cssSelector(".promoBtn")).click();

        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".promoInfo")));
        if (driver.findElement(By.cssSelector(".promoInfo")).isDisplayed()) {
            System.out.println("Code is displayed");
            Assertions.assertTrue(true);
        } else {
            Assertions.assertTrue(false);
            System.out.println("Code did not display");


        }
    }

    public static void addItems(WebDriver driver, String[] itemsNeeded) {
        int j = 0;
        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i < products.size(); i++) {
            String[] nameOfProduct = products.get(i).getText().split("-");
            String formatedNameOfProduct = nameOfProduct[0].trim();
            // format it to get actual vegetable
            // check whether name you extracted is present in arrayList or not.
            // convert array into list for easy search

            List itemsNeededList = Arrays.asList(itemsNeeded);

            if (itemsNeededList.contains(formatedNameOfProduct)) {
                j++;
                driver.findElements(By.xpath("//div[@class = 'product-action']/button")).get(i).click();
                if (j == itemsNeededList.size()) {
                    break;
                }

            }
        }
    }

}