package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignInPage {
By username = By.id("user-name");
By password =By.id("password");
By login = By.id("login-button");
    WebDriver driver;
    public SignInPage(WebDriver driver){
        this.driver=driver;
    }
public void setUsername(String name){
        driver.findElement(username).sendKeys(name);
}
public void setPassword(String passWord){
        driver.findElement(password).sendKeys(passWord);
}
public mainPage clickLogin(){
        driver.findElement(login).click();
        return  new mainPage (driver);
}

}
