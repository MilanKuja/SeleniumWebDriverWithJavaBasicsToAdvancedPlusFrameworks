import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        // //a[@value= 'MMA'] - Chennai

        // //a[@value = 'BLR']
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click(); //dropdown from
        driver.findElement(By.xpath("//div[contains(@id, 'glsctl00_mainContent')]//a[@value = 'BLR']")).click();
        Thread.sleep(2000);

        driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_destinationStation1_CTXT']")); //dropdown to
        driver.findElement(By.xpath("//div[contains(@id, 'glsctl00_mainContent_ddl_destinationStation1')]//a[@value = 'MAA']")).click();

        // driver.quit();

        //Finished 57 lecture, moving on to 58 Parent-Child relationship locator to identify th object Uniquely
    }
}
