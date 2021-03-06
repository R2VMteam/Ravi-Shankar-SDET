package com.qa.auto.base;

import com.qa.auto.util.TestUtil;
import com.qa.auto.util.WebEventListener;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.support.events.WebDriverEventListener;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

public class TestBase {

        public static WebDriver driver;
        public static Properties prop;
        public  static EventFiringWebDriver e_driver;
        public static WebEventListener eventListener;


        public TestBase() {
            try {
                prop = new Properties();
                FileInputStream ip = new FileInputStream("C:\\Users\\SUNITA\\Desktop\\ICT Testing\\Ravi-Shankar-SDET\\"
                        + "nopcommerce_bdd\\src\\main\\java\\com\\qa\\auto\\config\\config.properties");
                prop.load(ip);

            } catch (FileNotFoundException e) {
                e.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

        public static void initialization() {
            String browserName = prop.getProperty("browser");
              //if (browserName.equals("chrome")){WebDriverManager.chromedriver().setup();
            if (browserName.equals("chrome")) { //webdriver mananger is not working with IF condition.
                System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNITA\\Desktop\\Ravi\\software\\chromedriver_win32\\chromedriver.exe");

                driver = new ChromeDriver();
                e_driver = new EventFiringWebDriver(driver);
                // Now create object of EventListerHandler to register it with EventFiringWebDriver
                eventListener = new WebEventListener();
                e_driver.register(eventListener);
                driver = e_driver;
                driver.manage().window().maximize();
                driver.manage().deleteAllCookies();
                driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
                driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICIT_WAIT, TimeUnit.SECONDS);

                driver.get(prop.getProperty("url"));
            }
        }
    }


