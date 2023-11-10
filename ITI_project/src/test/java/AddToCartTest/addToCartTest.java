package AddToCartTest;

import BaseTest.baseTest;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.checkOutPage;
import pages.mainPage;
import pages.yourCartPage;
import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class addToCartTest extends baseTest {
@Test
    public void AddToCart(){

    SignInPage signInPage= new SignInPage(driver);
    signInPage.setUsername("standard_user");
    signInPage.setPassword("secret_sauce");
    var addToCart = signInPage.clickLogin();

       pages.mainPage mainPage = new mainPage(driver);
       mainPage.findAddToCart();
    }
    @Test
    public void clickCartIcon(){
        //SignInPage signInPage= new SignInPage(driver);
        //signInPage.setUsername("standard_user");
        //signInPage.setPassword("secret_sauce");
        //var addToCart = signInPage.clickLogin();

        pages.mainPage mainPage = new mainPage(driver);
        mainPage.clickCartIcon();

        checkOutPage checkout= yourCartPage.clickCheckOut();


    }
}
