import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Vezbe {
    public static void main(String[] args) {


        String test = "//div[@class = 'stepper-input']";


        WebDriver driver = new ChromeDriver();
        driver.get("https://rahulshettyacademy.com/seleniumPractise/#/"); //otvara stranu

        //WebDriver
        System.out.println(driver.getTitle()); //Uzima title stranice
        System.out.println(driver.getCurrentUrl()); // Uzima trenutni URL
        System.out.println(driver.getPageSource()); //Uzima trenutni HTML
        driver.findElement(By.xpath(test)); // Nalazi element
        driver.findElements(By.xpath(test)); // Nalazi elemenete, u slucaju da ne nadje, nen baca exception
        driver.close(); // zatvara tab
        driver.quit(); //zatvara sve sesije
        //Navigate
        driver.navigate().back(); //simulacija sterlice na browseru za nazad
        driver.navigate().forward(); //simulacija na browseru stelice napred
        driver.navigate().refresh(); // simullacija refresh-a
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/"); //otvara stranicu isto kao get, koristi navigate interfejs

        //WebElement
        driver.findElement(By.xpath(test)).click(); //click na element
        driver.findElement(By.xpath(test)).sendKeys(); //salje tekst
        driver.findElement(By.xpath(test)).clear(); //cisti input
        driver.findElement(By.xpath(test)).submit(); //simulira enter
        driver.findElement(By.xpath(test)).getText(); // uzima tekst
        driver.findElement(By.xpath(test)).getDomAttribute("class"); //uzima vrednost odredjenog atributa u ovom slucaju class.
        driver.findElement(By.xpath(test)).getTagName(); // vraca ime tag-a, input, div, a, button, span
        driver.findElement(By.xpath(test)).getCssValue("color"); //vraca CSS vrednost boje, rgba(255,0,0)
        driver.findElement(By.xpath(test)).getRect(); //vraca poziciju i dimenzije elementa, X,Y, width, hight, koristi se za UI/layout testiranje.
        driver.findElement(By.xpath(test)).getLocation(); //vraca poziciju elementa na stranici x-odaljenost od leve ivivice, y-od vrha strnnice
        driver.findElement(By.xpath(test)).getSize(); //getSize().getWidth() getSize.getHight(), vraca dimenzije u pikselima
        driver.findElement(By.xpath(test)).isDisplayed(); //validira da je element vidljiv na stranici, nije sakriven CSS-om
        driver.findElement(By.xpath(test)).isEnabled(); //validira da je elemenet aktivan, nije deaktiviran, moze da se klikne, cesto se proverava disabled atribut
        driver.findElement(By.xpath(test)).isSelected(); //validira da je checkbox selektovan, radio button

        //Select
        driver.navigate().to("https://rahulshettyacademy.com/dropdownsPractise/");
        WebElement element = driver.findElement(By.xpath("//select[@id='ctl00_mainContent_DropDownListCurrency']"));
        Select select = new Select(element);
        select.selectByVisibleText("USD"); //bira opciju koja ima tačno vidljiv tekst "USD"
        select.selectByIndex(3); //selektuje po indeksu, indeks krece od 0, ovde selektuje cetvrti element po redu
        select.selectByValue("USD"); //bira opciju po HTML atributu value
        //Povratne metode
        select.getFirstSelectedOption(); //Vraca prvu, trenutnu izabranu opciju u dropdown-u
        select.getOptions();//Vraca sve opcije iz dropdown-a, kao listu webelemenata.
        //Deselect
        select.deselectAll(); //brise sve opcije u slucaju da je multi select
        select.deselectByIndex(3); //deselekt radi po indexu, u ovom slucaju skide cetvrti element
        select.deselectByValue("USD"); //deselekt po value atributu
        select.deselectByVisibleText("USD"); //deselekt po vidljivom tekstu

        //Alert
        driver.switchTo().alert().accept(); //Prihvata alert
        driver.switchTo().alert().dismiss(); //Odbija alert
        driver.switchTo().alert().sendKeys("Yes"); //Salje tekst alert-u, prompt alert
        driver.switchTo().alert().getText(); //Vraca tekst iz alert-a

        //WebDriver options
        driver.manage();
        //Window
        driver.manage().window().maximize(); //Uvelicava prozor na max
        driver.manage().window().minimize(); //Smanjuje prozor
        driver.manage().window().fullscreen(); //Prebacuje na full screen, f11

        //Timeouts
        //Implicit wait
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10)); //Selenium će čekati do 10 sekundi da se element pojavi u DOM-u pre nego što odustane, svaki findelemnt ima implementiran wait ako se postavi na pocetku
                                                                           //Ako se pojavi za 2 sekunde, nastavlja odmah
                                                                           //Ako se ne pojavi za 10 sekundi, baca error
        //Explicit wait
        WebElement element1 = driver.findElement(By.xpath(test));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(2));
        wait.until(ExpectedConditions.visibilityOf(element1)); //Ceka uslov da je elemenet vidljiv
        wait.until(ExpectedConditions.invisibilityOfElementLocated(By.xpath(test))); //Ceka da element da pronadje u DOM-u i da element postane vidljiv
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(test))); //Ceka da element postane vidljiv u DOM-u, ne mora da bude vidljiv
        wait.until(ExpectedConditions.elementToBeClickable(element1)); //Element postoji u DOM-u, vidljiv je i aktivan je (Nije disabled)
        wait.until(ExpectedConditions.alertIsPresent()); //Ceka da se pojavi alert, popup, posle toga ide switchTo().alert();
        wait.until(ExpectedConditions.textToBePresentInElement(element1, "aaa")); //Da se određeni tekst pojavi u elementu, cesto dinamicki sadrzaj (AJAX)
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath(test), 4)); //Da broj elemenata u DOM-u bude tacan broj.
        wait.until(ExpectedConditions.invisibilityOf(element1)); //Da element nestane ili postance nevidljiv, popUP, spinner, loader

        //Actions - Simulira ponasanje korisnika
        Actions actions = new Actions(driver);
        actions.moveToElement(element1).perform(); //preform izvrsava, pomera mis na element, koristi se za dropdown hover, meni koji se otvara na hover
        actions.click(element1).perform(); //preform izvrsava, alternativa WebElement.click
        actions.clickAndHold(element1).perform(); //Klikne i drzi levi klik, koristi se za drag start i selekcija.
        actions.doubleClick().perform(); //Dupli klik, kao dupli klik misem
        actions.contextClick(element1).perform(); //Desni klik, otvara konetkst menu
        actions.dragAndDrop(element1, element1).perform(); //Prevuci element sa source na target
        actions.release(element1).perform(); //pusta klik, zavrsava clickAndHold ili drag opciju
        actions.sendKeys(element1, "aaaa").perform(); //Simulira kucanje preko tastature
        actions.moveToElement(element1).build().perform(); //Pravi plan akcija ali ne izvrasa - OBAVEZNO proveriti

        //Widnow Handling - koristi se za regulisanje novih prozora i tabova.

//        Set<String> windows = driver.getWidowHandles() - vraca nam svaki id od svakog otvorenog taba // return Set<String>
//        Iterator<String> iterator = windows.iterator(); - Iterator je kao pokazivanje prstom na odredjene elemente, ovde prolazi kroz Set stringova pod imenom windows, tako se i poziva.
//        String parentId = iterator.next(); - ovde nam dolazi na prvi tab, odnosno  perent tab.
//        String childId = iterator.next(); - ovde nam dolazi na drugi tab, odnosno child tab.
//        driver.switchTo().window(childId); - ovde prelazimo na novo otvoren tab.
//        Nakon toga, mozemo vrsiti testiranje na novom tabu;
//        driver.switchTo().window(perentId); - vracanje na glavni tab
        String childId = "test";
        String perentIdl = "test";

        driver.switchTo().window(childId); //Prelazak na prvi sledeci tab
        driver.switchTo().newWindow(WindowType.TAB); //Otvara novi tab i odmah prelazi na njega
        driver.switchTo().newWindow(WindowType.WINDOW); //Otvara novi prozor i odmah prelazi na njega
        driver.close(); //Zatvara trenutno aktivan tab ili prozor, ne vraca automatski na perent tabu, potrebno je vratiti se na perent.
        driver.quit(); //Zatvara ceo browser


        //Frames

        driver.switchTo().frame(0); //Prelazak na frame po indksu, prviFrame = 0
        driver.switchTo().frame("logInFrame"); //Prelazak u frame po ID-u ili NAME atributu.
        driver.switchTo().frame(driver.findElement(By.xpath("asd"))); //Prelazak u frame po webelementu
        driver.switchTo().parentFrame(); //Vraca selenium na frame jedan nivo iznad
        driver.switchTo().defaultContent(); //Vraca se na glavnu stranicu




    }

}
