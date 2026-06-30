package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;
import java.util.Iterator;
import java.util.Set;

public class WindowAssigment4 {
    public static void main(String[] args) {
        //Open page https://the-internet.herokuapp.com/
        //Click on Multiple windows
        //click on clickHere
        //Capture text on the new tab and print it in the console
        //Switch back to the parent tab
        //Print text opening a new window

        WebDriver driver = new ChromeDriver();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        Actions actions = new Actions(driver);


        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        WebElement multipleWindows = driver.findElement(By.cssSelector("a[href='/windows']"));
        actions.scrollToElement(multipleWindows).build().perform();
        multipleWindows.click();
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='example'] h3")));
        driver.findElement(By.cssSelector("a[href='/windows/new']")).click();
        Set<String> windows = driver.getWindowHandles();
        Iterator<String> iterator = windows.iterator();
        String parentId = iterator.next();
        String childId = iterator.next();
        driver.switchTo().window(childId);
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());
        driver.close();
        driver.switchTo().window(parentId);
        wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div[class='example'] h3")));
        System.out.println(driver.findElement(By.cssSelector("div[class='example'] h3")).getText());



    }
}
