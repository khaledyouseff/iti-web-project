package BaseTest;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import pages.SignInPage;
import pages.checkOutPage;
import pages.mainPage;
import pages.yourCartPage;


public class baseTest {
  protected    WebDriver driver  ;

protected SignInPage signInPage;
protected yourCartPage yourCartPage = new yourCartPage(driver);
protected checkOutPage checkOutPage = new checkOutPage(driver);
protected mainPage mainPage = new mainPage(driver);
@BeforeClass
    public void setup(){
    WebDriverManager.chromedriver().setup();
    driver=new ChromeDriver();
    driver.manage().window().maximize();
    driver.get("https://www.saucedemo.com/");
    signInPage= new SignInPage(driver);
    mainPage = new mainPage(driver);
    yourCartPage= new yourCartPage(driver);

}

@AfterClass
    public void tearDown(){
    this.driver.quit();
}




}
