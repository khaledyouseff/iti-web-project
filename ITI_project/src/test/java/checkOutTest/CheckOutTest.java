package checkOutTest;

import BaseTest.baseTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.checkOutPage;
import pages.mainPage;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class CheckOutTest extends baseTest {
    @Test
    public void checkOutTest(){
        //login
        SignInPage signInPage= new SignInPage(driver);
        signInPage.setUsername("standard_user");
        signInPage.setPassword("secret_sauce");
        var addToCart = signInPage.clickLogin();

        //dropdown
        String option ="Name (Z to A)";
        mainPage.selectDropDownElement(option);
        var selectedOption = mainPage.getSelectedOption();
        assertEquals(selectedOption.size(), 1 , "incorrect number of selections");
        assertTrue(selectedOption.contains(option),"incorrect option");

        //find item
        pages.mainPage mainPage = new mainPage(driver);
        mainPage.findAddToCart();

        //click add to cart

        mainPage.clickCartIcon();
        checkOutPage checkout= yourCartPage.clickCheckOut();

        //checkout and finish
        checkOutPage checkOutPage =new checkOutPage(driver);
        checkOutPage.SetFirstName("Khaled");
        checkOutPage.setLastname("yousef");
        checkOutPage.setPostalcode("3210001");
        checkOutPage.clickContinue();
        checkOutPage.clickFinish();

    }
}
