import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Iterator;
import java.util.Set;

public class Scope {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");


        System.out.println(driver.findElements(By.xpath("//a")).size());

        WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));

        System.out.println(footerdriver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).size());

        for (int i = 1; i < driver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).size(); i++) {

            String clickOnLinkTab = Keys.chord(Keys.CONTROL, Keys.ENTER);
            driver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).get(i).sendKeys(clickOnLinkTab);
            Thread.sleep(3000);

        }
        String parentWindow = driver.getWindowHandle();
        Set<String> tabs = driver.getWindowHandles();
        Iterator<String> iterator = tabs.iterator();
        while (iterator.hasNext()) {
            driver.switchTo().window(iterator.next());
            System.out.println(driver.getTitle());
        }
        driver.switchTo().window(parentWindow);
        driver.close();
    }


}

