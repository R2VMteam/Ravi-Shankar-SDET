package basics;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Validations
{

    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://demo.nopcommerce.com/");

        driver.manage().window().maximize();

        Thread.sleep(2000);

       boolean logo = driver.findElement(By.xpath("//img[@src='https://demo.nopcommerce.com/Themes/DefaultClean/Content/images/logo.png']")).isDisplayed();

        System.out.println("Logo is displayed " + logo);


        boolean registerLink =  driver.findElement(By.linkText("Register")).isDisplayed();

      System.out.println("Register link is displayed " + registerLink);

        driver.findElement(By.linkText("Register")).click();



       boolean newsletterChkBox =  driver.findElement(By.id("Newsletter")).isSelected();

        System.out.println("newsletter checkbox is selected  " + newsletterChkBox);


        boolean radiobutton = driver.findElement(By.name("Gender")).isSelected();
        System.out.println("Male radio button is selected  " + radiobutton); // false


       boolean registerBtn = driver.findElement(By.id("register-button")).isEnabled();
        System.out.println("Register button  is enabled  " + registerBtn);


      //

      driver.quit();

    }

}
