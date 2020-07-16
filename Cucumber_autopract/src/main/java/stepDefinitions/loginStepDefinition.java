package stepDefinitions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class loginStepDefinition {

    WebDriver driver;

    @Given("^user is already on Login Page$")
    public void user_is_already_on_Login_Page(){
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNITA\\Desktop\\Ravi\\software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com/");
    }

    //@When("^title of login page is My Store$")
    //public void title_of_login_page_is_My_Store(){
        //String title = driver.getTitle();
        //System.out.println((title));
      //  Assert.assertEquals("My Store", title);

    //}


    @Then("^Close the browser$")
    public void Close_the_browser(){
        driver.quit();
    }


    //	 @When("^title of login page is Free CRM$")
//	 public void title_of_login_page_is_free_CRM(){
//	 String title = driver.getTitle();
//	 System.out.println(title);
//	 Assert.assertEquals("#1 Free CRM for Any Business: Online Customer Relationship Software", title);
//	 }

}
