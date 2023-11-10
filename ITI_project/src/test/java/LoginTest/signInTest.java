package LoginTest;

import BaseTest.baseTest;
import org.testng.annotations.Test;
import pages.SignInPage;
import pages.mainPage;

public class signInTest extends baseTest {


    @Test
   public void successfulSignInTest(){
       SignInPage signInPage= new SignInPage(driver);
       signInPage.setUsername("standard_user");
       signInPage.setPassword("secret_sauce");
       mainPage mainePage =   signInPage.clickLogin();
   }

}
