package com.test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SearchItem
{

    //

    public static void main(String[] args) {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");
        driver.manage().window().maximize();

        driver.findElement(By.cssSelector("input#small-searchterms")).sendKeys("laptop");
       // driver.findElement(By.cssSelector("input.search-box-button")).click();
        driver.findElement(By.cssSelector("input[value='Search']")).click();

      //  driver.quit();


        driver.findElement(By.cssSelector(".answer:first-of-type")).click();

    }
}
