import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class UpdatedDropdown {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).click();
        System.out.println(driver.findElement(By.xpath("//input[contains(@id, 'SeniorCitizenDiscount')]")).isSelected());

        System.out.println(driver.findElements(By.xpath("//input[@type='checkbox']")).size());


        driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).click();
        Thread.sleep(1000);
        int i = 1;
        while (i < 5) {
            driver.findElement(By.id("hrefIncAdt")).click();
            i++;
        }
        driver.findElement(By.xpath("//input[@id = 'btnclosepaxoption']")).click();
        Assert.assertEquals(driver.findElement(By.xpath("//div[@id = 'divpaxinfo']")).getText(), "5 Adult");


        //checking if elements are enabled
        driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style");
        if (driver.findElement(By.cssSelector("#Div1")).getDomAttribute("style").contains("0.5")) {
            System.out.println("It's enabled");
            Assert.assertTrue(true);
        } else {
            Assert.assertFalse(true);
        }




        driver.quit();

    }


}
