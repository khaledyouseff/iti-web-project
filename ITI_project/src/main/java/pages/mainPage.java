package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.List;
import java.util.stream.Collectors;

public class mainPage {
   private final WebDriver driver;


    public mainPage(WebDriver driver){
        this.driver=driver;
    }

    //-------------------------------------------------------------------------
    //DropDown Field
    By dropDown = By.xpath("//*[@id=\"header_container\"]/div[2]/div/span/select");
    By AddToCart = By.id("add-to-cart-sauce-labs-onesie");
    By CartIcon = By.id("shopping_cart_container");
    public void findDropDown(){
        driver.findElement(dropDown);
    }
public void selectDropDownElement(String option){
      // Select DropDown = new Select(driver.findElement(dropDown)); //ده الي حصل الاول
       // DropDown.selectByVisibleText(option);                       // بس تم اختصاه
        findDropDownElement().selectByVisibleText(option);
}
public List<String> getSelectedOption(){
     List<WebElement> selectedElement=
             findDropDownElement().getAllSelectedOptions();
     return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());

}
/*
public List<String> getSelectedOption (){
        List<WebElement> selectedElement =
                findDropDownElement().getAllSelectedOptions();
        return selectedElement.stream().map(e->e.getText()).collect(Collectors.toList());
}
 */

    private Select findDropDownElement(){
        return new Select(driver.findElement(dropDown));
    }
//End of Drop Down code
    //-------------------------------------------------------------------------------
//Adding an Item to cart
public void findAddToCart(){
        driver.findElement(AddToCart).click();
}
    public yourCartPage clickCartIcon(){
        driver.findElement(CartIcon).click();
        return new yourCartPage(driver);
    }






}
