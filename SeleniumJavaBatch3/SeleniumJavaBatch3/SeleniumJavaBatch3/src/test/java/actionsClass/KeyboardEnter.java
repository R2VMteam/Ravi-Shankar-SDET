package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyboardEnter
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

       driver.findElement(By.id("small-searchterms")).sendKeys("computer");

       WebElement searchBox = driver.findElement(By.id("small-searchterms"));

       Actions a = new Actions(driver);

       a.sendKeys(searchBox, Keys.ENTER).build().perform();






    }
}
