package com.scc.qa.pages;

import com.scc.qa.base.TestBase;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class HomePage extends TestBase {

    @FindBy(id="search-input-location")
    WebElement searchBox;

    @FindBy(id="search-submit")
    WebElement searchBtn;

    @FindBy(xpath = "//button[@class = \"ui-button-primary ui-cookie-accept-all-medium-large\"]")
    WebElement acceptCookies;

    @FindBy(xpath = "//img[@class = \"icon--logo\"]")
    WebElement homePageIcon;

    //Initial page objects using constructor

    public HomePage(){
        PageFactory.initElements(driver, this);
    }

    public void clickAcceptCookiesTest(){
        System.out.println("Entered Test 1");
        By cookies_accept = By.xpath("//button[@class = \"ui-button-primary ui-cookie-accept-all-medium-large\"]");
        //By cookies_gotIt = By.xpath("//a[text()='Got it!']");
        WebDriverWait wait = new WebDriverWait(driver, 20);
        wait.until(ExpectedConditions.elementToBeClickable(cookies_accept)).click();
        wait.until(ExpectedConditions.invisibilityOfElementLocated(cookies_accept));
        System.out.println("Exit Test 1");
    }

    public void search(){
        searchBox.sendKeys("London");
    }

    public void clickSearchBtn(){
        searchBtn.click();
    }

    public String verifyTitleHomePage(){

        return driver.getTitle();
    }

    public void clickHomePageIcon(){
        homePageIcon.click();
    }
}
