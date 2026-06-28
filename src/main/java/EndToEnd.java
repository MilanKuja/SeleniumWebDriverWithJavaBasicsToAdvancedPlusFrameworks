import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEnd {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
        driver.findElement(By.xpath("//input[@id = 'ctl00_mainContent_ddl_originStation1_CTXT']")).click(); //dropdown from
        driver.findElement(By.xpath("//div[contains(@id, 'glsctl00_mainContent')]//a[@value = 'BLR']")).click();
        Thread.sleep(2000);
        //dropdown to
        driver.findElement(By.xpath("//div[contains(@id, 'glsctl00_mainContent_ddl_destinationStation1')]//a[@value = 'MAA']")).click();

        driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style");


        if (driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style").contains("0.5")){
            System.out.println("It's disabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertTrue(false);
        }

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_chk_SeniorCitizenDiscount']")).click();

        driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
        Thread.sleep(2000);
        for (int i = 1; i < 5; i++) {
            driver.findElement(By.id("hrefIncAdt")).click();

        }

        Assert.assertEquals(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText(), "5 Adult");
        System.out.println(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText());

        Select drowdown = new Select(driver.findElement(By.xpath("//select[@id = 'ctl00_mainContent_DropDownListCurrency']")));
        drowdown.selectByVisibleText("USD");

        driver.findElement(By.xpath("//input[@id='ctl00_mainContent_btn_FindFlights']")).click();







//        driver.quit();
    }
}
