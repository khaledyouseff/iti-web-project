package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class checkOutPage {
    WebDriver driver;
    public checkOutPage(WebDriver driver){
        this.driver=driver;
    }
By firstname = By.id("first-name");
By lastname = By.id("last-name");
By postalcode = By.id("postal-code");
By finish = By.id("finish");

public void SetFirstName(String Fname){
    driver.findElement(firstname).sendKeys(Fname);
}
public void setLastname(String Lname){
    driver.findElement(lastname).sendKeys(Lname);
}
public void setPostalcode(String pcode){
    driver.findElement(postalcode).sendKeys(pcode);
}
public overviewPage clickContinue(){
    driver.findElement(By.id("continue")).click();
    return new overviewPage(driver);
}
public completedPage clickFinish(){
driver.findElement(finish).click();
return new completedPage(driver);
}
}
