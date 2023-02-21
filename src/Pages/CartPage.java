package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CartPage extends BasePage{
    public CartPage(WebDriver driver){
        super(driver);
    }

    By productTitleBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/phoebe-zipper-sweatshirt.html']");
    By estimateButtonBy = By.xpath("//*[@id='block-shipping-heading']");
    By countryFilterBy = By.xpath("//*[@id='VMFI4Y3[]]");
    By stateFieldBy = By.xpath("//*[@id='QVJNUFE']");
    By zipFieldBy = By.xpath("//*[@id='JU8KI7C']");
    By flatRateSignBy = By.xpath("//*[@id='s_method_flatrate_flatrate']");
    By productPriceBy = By.xpath("//*[@id='cart-totals']/div/table/tbody/tr[1]/td/span");
    By shippingPriceBy = By.xpath("//*[@id='cart-totals']/div/table/tbody/tr[2]/td/span");
    By totalPriceBy = By.xpath("//*[@id='cart-totals']/div/table/tbody/tr[3]/td/strong/span");



    public CartPage verifyNavigationFromPDP(){
        assertElementVisible(productTitleBy);
           
        return this;
    }


    public CartPage verifySuccessfulPriceDisplay(String expectedText){
       
        String actualText = readText(productPriceBy);
        assertTextEquals(expectedText, actualText);
        
        return this;

    }

    public CartPage verifySuccessfulShippingDisplay(String expectedText){
        String actualText = readText(shippingPriceBy);
        assertTextEquals(expectedText, actualText);

        return this;
    }

    public CartPage verifySuccessfulTotalPriceDisplay(String expectedText){
        String actualText = readText(totalPriceBy);
        assertTextEquals(expectedText, actualText);

        return this;
    }
    
}
