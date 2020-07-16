package stepDefinitions;

import com.qa.auto.base.TestBase;
import com.qa.auto.pages.WishlistPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static com.qa.auto.util.TestUtil.IMPLICIT_WAIT;

public class WishlistSteps extends TestBase {
    //WebDriver driver;
    WishlistPage wishlistPage;

    public WishlistSteps(){
        super();
    }


    @Given("^user opens browser$")
    public void userOpensBrowser(){


        TestBase.initialization();
        wishlistPage = new WishlistPage();
    }

    @When("^title of home page is nopCommerce demo store$")
    public void titleOfHomePageIsNopCommerceDemoStore() {

        wishlistPage.validateWishListPageTitle();
    }

    @Then("^user clicks on Wishlist link$")
    public void userClicksOnWishlistLink() {
        wishlistPage.clickOnWishlistLink();
    }

    @Then("^close the browser$")
    public void closeTheBrowser() {

        driver.quit();
    }


}
