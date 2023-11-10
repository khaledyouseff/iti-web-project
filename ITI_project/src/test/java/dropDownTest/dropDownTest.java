package dropDownTest;

import org.testng.annotations.Test;
import pages.SignInPage;
import BaseTest.baseTest;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

public class dropDownTest extends baseTest {

    /*
        @BeforeMethod
            public void successfulSignInTest() throws InterruptedException {
                SignInPage signInPage= new SignInPage(driver);
                signInPage.setUsername("standard_user");
                signInPage.setPassword("secret_sauce");
                mainPage mainePage =   signInPage.clickLogin();
                Thread.sleep(3000);
            }
        /*

         */


    @Test

    public void DropDown() throws InterruptedException {

         SignInPage signInPage= new SignInPage(driver);
         signInPage.setUsername("standard_user");
         signInPage.setPassword("secret_sauce");
         var dropDown = signInPage.clickLogin();
         String option ="Name (Z to A)";
         mainPage.selectDropDownElement(option);
         var selectedOption = mainPage.getSelectedOption();
         assertEquals(selectedOption.size(), 1 , "incorrect number of selections");
         assertTrue(selectedOption.contains(option),"incorrect option");
    }
}
