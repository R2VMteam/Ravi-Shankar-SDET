package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login
{
    public static void main(String[] args)
    {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        driver.findElement(By.linkText("Log in")).click();

        JavascriptExecutor js = (JavascriptExecutor) driver;

        js.executeScript("document.getElementById('Email').setAttribute('value','test@nop.com')");

        js.executeScript("document.getElementById('Password').setAttribute('value','testing')");

        js.executeScript("arguments[0].click();",driver.findElement(By.className("login-button")));

        //driver.findElement(By.className("login-button")).click();

        driver.quit();







    }
}
