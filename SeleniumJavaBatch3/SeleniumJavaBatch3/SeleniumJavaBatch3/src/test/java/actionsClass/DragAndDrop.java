package actionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.lang.reflect.AccessibleObject;

public class DragAndDrop {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver;

        driver = new ChromeDriver();

        driver.navigate().to("https://jqueryui.com/droppable/");

        driver.manage().window().maximize();

        Thread.sleep(3000);

        int frames = driver.findElements(By.tagName("iframe")).size();

        System.out.println(frames);

        driver.switchTo().frame(driver.findElement(By.xpath("//iframe[@class='demo-frame']")));

        WebElement draggable = driver.findElement(By.id("draggable"));

        WebElement droppable = driver.findElement(By.id("droppable"));

        Actions a = new Actions(driver);

        a.dragAndDrop(draggable,droppable).perform();


        driver.switchTo().defaultContent(); // come out of frame and switch to application




    }

}
