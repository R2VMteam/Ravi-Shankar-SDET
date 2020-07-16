package com.qa.auto.pages;

import com.qa.auto.base.TestBase;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.concurrent.TimeUnit;

import static com.qa.auto.util.TestUtil.IMPLICIT_WAIT;

public class WishlistPage extends TestBase {

    //Page Factory or Object Repo
    @FindBy(className = "wishlist-label")
    WebElement wishlistBtn;

    @FindBy(id = "small-searchterms")
    WebElement searchInput;

    @FindBy(className = "ui-autocomplete-input")
    WebElement searchBtn;

    @FindBy(xpath = "//a[contains(text(), 'Computers')]")//Locate Computers link
    WebElement computersLink;

    @FindBy(xpath = "//a[contains(text(), 'Desktops')]")//Locate Desktops in dropdown list of computers
    WebElement desktops;//Hover action on Computers will show dropdown.

    @FindBy(xpath = "//input[contains(@value, 'Add to wishlist')]")//Locate Add to Wishlist in Desktops
    WebElement addToWishlist;//Hover, click and click.


    //Initializatin page objects using Page Factory

    public WishlistPage() { PageFactory.initElements(driver, this);
    }

    //Actions

    public void validateWishListPageTitle() {
        driver.manage().timeouts().implicitlyWait(IMPLICIT_WAIT, TimeUnit.SECONDS);
        System.out.println("cursor enters here");
        //driver.navigate().refresh();
        String title = driver.getTitle();
        Assert.assertEquals("nopCommerce demo store", title);
        System.out.println((title));
    }

    public void clickOnWishlistLink()
    {
        wishlistBtn.click();
//        JavascriptExecutor js = (JavascriptExecutor) driver;
//        js.executeScript("arguments[0].click);", wishlistBtn );
    }

    public WishlistPage search() {
        searchInput.sendKeys("apple");
        searchBtn.click();

        return new WishlistPage();

    }
}