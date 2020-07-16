package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathExamples
{

    public static void main(String[] args)
    {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();


       // driver.findElement(By.xpath("//a[@class='ico-login']")).click();

     //  String text = driver.findElement(By.xpath("//h2[text()='Welcome to our store']")).getText();

       //System.out.println(text);

      // driver.findElement(By.xpath("//a[contains(text(),'Log')]")).click();

       driver.findElement(By.xpath("//a[contains(text(),'egister')]")).click();

    }
}
