import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class actionsDemo {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.amazon.com/");
            Thread.sleep(3000);
        WebElement dropDownAccount = driver.findElement(By.cssSelector("#nav-link-accountList"));
        WebElement searchBox = driver.findElement(By.cssSelector("#twotabsearchtextbox"));
        Actions actions = new Actions(driver);
        actions.moveToElement(searchBox).click().keyDown(Keys.SHIFT).sendKeys("hello").doubleClick().build().perform();
        actions.moveToElement(dropDownAccount).contextClick().build().perform();
    }
}
