import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Arrays;
import java.util.List;

public class CartSotreAutomation {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");

        int j = 0;
        String[] itemsNeeded = {"Cucumber", "Brocolli", "Beetroot", "Apple", "Cauliflower"};

        List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

        for (int i = 0; i<products.size();i++) {
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
