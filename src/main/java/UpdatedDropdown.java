import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
        Thread.sleep(1000);
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.xpath("//input[@id = 'btnclosepaxoption']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText(), "5 Adult");
        driver.quit();
    }
}
