package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getTitle
{
    public static void main(String[] args)
    {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        String homepageTitle = driver.getTitle(); // return title of current page

        System.out.println("Home page title is: " + homepageTitle);

        driver.findElement(By.linkText("Register")).click();

        String registerpageTitle = driver.getTitle(); // return title of current page

        System.out.println("Register page title is: " +registerpageTitle);

    }

}
