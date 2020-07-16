package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns
{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

        driver.findElement(By.linkText("Register")).click();

        Select s = new Select(driver.findElement(By.name("DateOfBirthDay")));

        //s.selectByIndex(1);

       // s.selectByValue("7");

        s.selectByVisibleText("5");


        Select month = new Select(driver.findElement(By.name("DateOfBirthMonth")));

        month.selectByVisibleText("July");

       /*
        driver.findElement(By.xpath("(//select[@class='valid'])[1]")).click();

        Thread.sleep(2000);

        driver.findElement(By.xpath("(//option[@value='7'])[1]")).click();
       */
    }
}
