package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProductDetailsPage extends BasePage {
    public ProductDetailsPage(WebDriver driver){
        super(driver);
    }

    By addToCartButtonBy = By.id("product-addtocart-button");
    By MSizeButtonBy = By.xpath("//*[@id='option-label-size-143-item-168']");
    By greyColorButtonBy = By.xpath("//*[@id='option-label-color-93-item-52']");
    By quantityFieldBy = By.xpath("//*[@id='qty']");
    By addToCartMessageBy = By.xpath("//div[@class='message-success success message']");
    By cartIconBy = By.xpath("//a[@class='action showcart']");
    By editCartBy = By.xpath("/html/body/div[2]/header/div[2]/div[1]/div/div/div/div[2]/div[5]/div/a");
    By checkoutButtonBy = By.xpath("/html/body/div[2]/main/div[1]/div[2]/div/div/div/a");

    public ProductDetailsPage verifyNavigationFromWhatsNewToPDP(){
        assertElementVisible(addToCartButtonBy);

        return this;
    }

    public ProductDetailsPage chooseProductSize(){
        click(MSizeButtonBy);

        return this;

    }

    public ProductDetailsPage chooseItemsColor(){
        click(greyColorButtonBy);

        return this;
    }

    public ProductDetailsPage chooseQuantity(String kolicina){
        writeText(quantityFieldBy, kolicina);

        return this;
    }

    public ProductDetailsPage addToCart(){
        click(addToCartButtonBy);

        return this;
    }

    public ProductDetailsPage verifyAddToCartAction(String expectedMessage){
        String actualText = readText(addToCartMessageBy);
        assertTextEquals(actualText, expectedMessage);
      
        return this;
      }
    
    public ProductDetailsPage navigateToCart(){
        click(checkoutButtonBy);

        return this;
   }  
 }
