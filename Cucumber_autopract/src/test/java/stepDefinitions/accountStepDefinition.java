package stepDefinitions;

import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class accountStepDefinition {

    WebDriver driver;


    @Given("^user is already on Account Page$")
    public void userIsAlreadyOnAccountPage() throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\SUNITA\\Desktop\\Ravi\\software\\chromedriver_win32\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("http://automationpractice.com");
        Thread.sleep(4000);
        WebElement signinBtn = driver.findElement(By.xpath("//a[contains(text(), 'Sign in')]"));
        signinBtn.click();
    }


    @When("^title of login page is My Store$")
    public void titleOfLoginPageIsMyStore() {
        String title = driver.getTitle();
        System.out.println(title);
        Assert.assertEquals("Login - My Store", title);
    }


    @Then("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
    public void userEntersAnd(String username, String password) throws InterruptedException {
        driver.findElement(By.name("email")).sendKeys(username);
        driver.findElement(By.name("passwd")).sendKeys(password);
        driver.findElement(By.id("SubmitLogin")).click();
        Thread.sleep(3000);
        // Write code here that turns the phrase above into concrete actions
    }

    @Then("^user is on My Account page$")
    public void userIsOnMyAccountPage() {
        String title1 = driver.getTitle();
        System.out.println(title1);
        Assert.assertEquals("My account - My Store", title1);
    }

    @Then("^user clicks on Your personal information link$")
    public void userClicksOnYourPersonalInformationLink() {
        WebElement personalInfoLink = driver.findElement(By.xpath("//span[contains(text(), 'My personal information')]"));
        personalInfoLink.click();
    }

    @Then("^user clicks radio button titled Mr$")
    public void userClicksRadioButtonTitledMr() {
        driver.findElement(By.xpath("//*[@id=\"center_column\"]/div/form/fieldset/div[1]/div[1]/label")).click();
    }

    @Then("^user clicks on First name input box and enters first name and user enters \"([^\"]*)\"$")
    public void userClicksOnFirstNameInputBoxAndEntersFirstName(String first_name) {
        WebElement first = driver.findElement(By.xpath("//input[@id='firstname']"));
        first.click();
        first.clear();
        first.sendKeys(first_name);

    }

    @Then("^user clicks on Second Name input box and enters second name \"([^\"]*)\"$")
    public void userClicksOnSecondNameInputBoxAndEntersSecondName(String second_name) {
        // Write code here that turns the phrase above into concrete actions
        WebElement second = driver.findElement(By.xpath("//input[@id='lastname']"));
        second.click();
        second.clear();
        second.sendKeys(second_name);
    }

    @Then("^user clicks on Email and enters email address$")
    public void userClicksOnEmailAndEntersEmailAddress() {
        WebElement email1 = driver.findElement(By.id("email"));
        email1.click();
        email1.clear();
        email1.sendKeys("ravishankarpatro@mail.com");
    }

    @Then("^user enters Date of birth using drop down$")
    public void userEntersDateOfBirthUsingDropDown() {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("document.getElementById('uniform-days').value='30/01/1978'");
    }

    @Then("^Close the browser1$")
    public void Close_the_browser1(){
        driver.quit();
    }
}
