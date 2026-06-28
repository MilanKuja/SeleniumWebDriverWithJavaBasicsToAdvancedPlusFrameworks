import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assigment {
    public static void main(String[] args) {
        String text = "Milan";
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/AutomationPractice/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("#name")).sendKeys(text);
        driver.findElement(By.cssSelector("#alertbtn")).click();
        System.out.println(driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
        driver.findElement(By.cssSelector("#confirmbtn")).click();
        System.out.println(driver.switchTo().alert().getText());;
        driver.switchTo().alert().dismiss();



    }
}
