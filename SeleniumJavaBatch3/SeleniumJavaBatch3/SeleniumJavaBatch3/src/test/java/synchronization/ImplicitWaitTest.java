package synchronization;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class ImplicitWaitTest
{

    public static void main(String[] args)
    {
        WebDriver driver;


        driver = new ChromeDriver();

        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Log in")).click();

        driver.findElement(By.id("Email")).sendKeys("test@nop.com");

        driver.findElement(By.id("Password")).sendKeys("testing");

        driver.findElement(By.className("login-button")).click();

        driver.quit();

    }
}
