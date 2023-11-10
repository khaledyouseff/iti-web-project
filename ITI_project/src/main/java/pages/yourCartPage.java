package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class yourCartPage {
    By checkout = By.id("checkout");
     WebDriver driver ;

    public yourCartPage(WebDriver driver){
        this.driver = driver;
    }
    public String getItemName(){
         return driver.findElement(By.className("inventory_item_desc")).getText();
    }
    public checkOutPage clickCheckOut(){
        driver.findElement(checkout).click();
        return new  checkOutPage (driver);
    }
}
