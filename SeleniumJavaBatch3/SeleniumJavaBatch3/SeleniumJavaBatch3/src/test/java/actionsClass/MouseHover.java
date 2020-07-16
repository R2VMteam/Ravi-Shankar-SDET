package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseHover
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

       Thread.sleep(3000);

        WebElement computers = driver.findElement(By.linkText("Computers"));

        Actions a = new Actions(driver);

        a.moveToElement(computers).perform();

        driver.findElement(By.linkText("Notebooks")).click();






    }
}
