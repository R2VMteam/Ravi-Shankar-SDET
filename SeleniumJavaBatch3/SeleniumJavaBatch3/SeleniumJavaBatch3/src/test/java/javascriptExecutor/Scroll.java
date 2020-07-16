package javascriptExecutor;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll
{
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        JavascriptExecutor js = (JavascriptExecutor) driver;

       js.executeScript("window.scrollTo(0,document.body.scrollHeight)");

       Thread.sleep(3000);
        js.executeScript("window.scrollTo(0,-document.body.scrollHeight)");

        driver.quit();
    }
}
