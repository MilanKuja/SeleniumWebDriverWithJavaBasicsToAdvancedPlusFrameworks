package Assigments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class FramesAssigment5 {
    public static void main(String[] args) {
        //Navigate to "https://the-internet.herokuapp.com/"
        //Click on nested frames
        //Print the middle text frame

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://the-internet.herokuapp.com/");
        Actions actions = new Actions(driver);
        actions.scrollToElement(driver.findElement(By.cssSelector("a[href='/nested_frames']"))).perform();
        driver.findElement(By.cssSelector("a[href='/nested_frames']")).click();
        driver.switchTo().frame("frame-top");
        driver.switchTo().frame("frame-middle");
        System.out.println(driver.findElement(By.cssSelector("#content")).getText());

        driver.quit();




    }
}
