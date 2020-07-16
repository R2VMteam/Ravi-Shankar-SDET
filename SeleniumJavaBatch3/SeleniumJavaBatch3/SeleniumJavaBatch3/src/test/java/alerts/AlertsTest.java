package alerts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertsTest
{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("http://the-internet.herokuapp.com/javascript_alerts");

        driver.manage().window().maximize();


        driver.findElement(By.xpath("//button[text()='Click for JS Alert']")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().accept(); // clicks on ok button of js alert




        driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();

        Thread.sleep(2000);

        driver.switchTo().alert().dismiss(); // clicks on cancel button of js alert

        String message = driver.findElement(By.id("result")).getText();

        System.out.println(message);


        driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();



        driver.switchTo().alert().sendKeys("text");

        Thread.sleep(2000);

        driver.switchTo().alert().accept();

        String message1 = driver.findElement(By.id("result")).getText();

        System.out.println(message1);

    }
}
