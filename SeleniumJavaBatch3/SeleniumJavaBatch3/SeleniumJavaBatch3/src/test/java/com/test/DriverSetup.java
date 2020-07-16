package com.test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverSetup
{
    public static void main(String[] args)
    {
        WebDriver driver;

        System.setProperty("webdriver.chrome.driver",".\\drivers\\chromedriver.exe");

        driver = new ChromeDriver();

       // driver.get("https://demo.nopcommerce.com/");


        driver.navigate().to("https://demo.nopcommerce.com/");
      /*
        driver.navigate().back();
        driver.navigate().forward();
        driver.navigate().refresh();
        */

       driver.manage().window().maximize();  // maximize the browser


     // driver.close();
        driver.quit();











    }

}

