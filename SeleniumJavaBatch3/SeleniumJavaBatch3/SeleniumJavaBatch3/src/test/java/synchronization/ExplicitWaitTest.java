package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.concurrent.TimeUnit;

public class ExplicitWaitTest
{

    public static void main(String[] args)
    {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Log in")).click();

        WebDriverWait wait = new WebDriverWait(driver,30);

        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("Email")));


        driver.findElement(By.id("Email")).sendKeys("test@nop.com");

        driver.findElement(By.id("Password")).sendKeys("testing");

        WebElement loginBtn = driver.findElement(By.className("login-button"));

        wait.until(ExpectedConditions.elementToBeClickable(loginBtn));
        driver.findElement(By.className("login-button")).click();

        driver.quit();

    }
}
