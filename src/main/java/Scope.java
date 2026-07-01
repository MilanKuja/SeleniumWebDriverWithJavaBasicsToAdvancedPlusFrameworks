import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scope {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");



        System.out.println(driver.findElements(By.xpath("//a")).size());

        WebElement footerdriver = driver.findElement(By.xpath("//div[@id='gf-BIG']"));

        System.out.println(footerdriver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).size());

        for (int i = 1; i <= driver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).size(); i++) {
            driver.findElements(By.xpath("//a[text()='Discount Coupons']/ancestor::td/ul//a")).get(i).click();
            driver.close();
            i++;
        }
    }
}
