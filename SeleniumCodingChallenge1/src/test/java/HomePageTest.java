import com.scc.qa.base.TestBase;
import com.scc.qa.pages.HomePage;
import org.apache.poi.hpsf.Array;
import org.apache.poi.ss.formula.functions.T;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.*;


public class HomePageTest extends TestBase {
    HomePage homePage;
    //public HomePageTest(){super();} //Calling constructor of testbase

    @BeforeMethod
    public void setUp(){
        initialization(); //Initializing the browser.
        homePage = new HomePage();
        homePage.clickAcceptCookiesTest();
    }

    @Test(priority = 1)
    public void verifySearchBox(){
        homePage.search();
        homePage.clickSearchBtn();
        driver.close();
    }

    @Test(priority = 2)
    public void verifyHomePageTitleTest(){
        //homePage.clickHomePageIcon();
        String homePageTitle = homePage.verifyTitleHomePage();
        Assert.assertEquals(homePageTitle, "Zoopla > Search Property to Buy, Rent, House Prices, Estate Agents");
        System.out.println(homePageTitle);
        driver.close();
    }

    @Test(priority = 3)//, dependsOnMethods={"verifySearchBox"}
    public void printSearchItem() {
        // print the product details
        //List<String> listOfProductTitles = new ArrayList<String>();
        homePage.search();
        homePage.clickSearchBtn();
        List<WebElement> allProducts = driver.findElements(By.xpath("//a[@class=\"listing-results-price text-price\"]"));

        //allProducts.toArray();

        //allProducts.sort(Comparator< T > naturalOrder());

        // List<WebElement> sortedList = allProducts.stream().sorted().collect(Collectors.toList());
        //sortedList.forEach(System.out::println);
        System.out.println(allProducts.size());
        for(WebElement product: allProducts){
            System.out.println(product.getText());

            //*[@id="listing_55599328"]/div/div[2]/a
            //*[@id="listing_55599318"]/div/div[2]/a
            //*[@id="listing_55599320"]/div/div[2]/a

        }


    }

//    @AfterMethod
//    public void tearDown(){
//        driver.close();
//    }
}
