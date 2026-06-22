import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SelIntroduction{
    public static void main(String[] args) {
        //Invoking Browser
        //Chrome - ChromeDriver -> Methods close, get
        //FireFox - FirefoxDriver -> Methods close, get
        //Safari - SafariDriver -> Methods close, get
        //WebDriver - close, get
        //WebDriver methods + class methods
        //Selenium Manager


        //Chrome launch

        //chromedriver.exe
        //webdriver.chrome.driver->value of path
//        System.setProperty("webdriver.chrome.driver", "D:\\Kursevi\\Documents\\chromedriver.exe");
//        WebDriver driver = new ChromeDriver();

        //Firefox launch

        //gecodriver
        //webdriver.gecko.driver
        System.setProperty("webdriver.gecko.driver", "D:\\Kursevi\\Documents\\geckodriver.exe");
        WebDriver driver1 = new FirefoxDriver();


        //Edge Launch

        //msedgedriver
        //webdriver.msedgedriver.driver
//        System.setProperty("webdriver.gecko.driver", "D:\\Kursevi\\Documents\\msedgedriver.exe");
//        WebDriver driver2 = new EdgeDriver();


        driver1.get("https://rahulshettyacademy.com"); //Prosledjuje URL na koji je potrebno otici
        System.out.println(driver1.getTitle()); //Dovlaci Naslov Stranice
        System.out.println(driver1.getCurrentUrl()); //Dovlaci nam trenutni URL
        System.out.println(driver1.getPageSource());
        driver1.close(); //Zatvara trenutni tab ili widnow
//        driver1.quit(); //Zatvara sve browsere vezane za selenium instancu




    }
}
