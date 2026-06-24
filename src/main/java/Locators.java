import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
    public static void main(String[] args) {

//        System.setProperty("webdriver.chrome.driver", "D:\\Kursevi\\Documents\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/locatorspractice/");
    }
}
