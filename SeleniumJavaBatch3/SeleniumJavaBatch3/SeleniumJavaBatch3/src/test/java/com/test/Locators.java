package com.test;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Locators
{

    public static void main(String[] args)
    {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        /*
        driver.findElement(By.id("Email")).sendKeys("test@123.com");
        driver.findElement(By.id("Password")).sendKeys("testing");

        driver.findElement(By.className("login-button")).click();
        */
      //  driver.findElement(By.linkText("Register")).click();



     //   driver.findElement(By.linkText("Log in")).click();

       // driver.navigate().refresh();


       // driver.findElement(By.partialLinkText("downloads")).click();

       /*
        driver.findElement(By.tagName("input")).sendKeys("test@nop.com");
        driver.findElement(By.name("Email")).sendKeys("test@nop.com");

        //

        driver.findElement(By.name("Password")).sendKeys("testing");

        */
        driver.findElement(By.cssSelector("input#pollanswers-1")).click();


    }
}
