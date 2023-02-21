package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        super(driver);
    }

    String baseUrl = "https://magento.softwaretestingboard.com";
    By inventoryItemBy = By.xpath("//li[@class='product-item']");
    By createAnAccountBy = By.xpath("//a[@href='https://magento.softwaretestingboard.com/customer/account/create/']");
    By signinButtonBy = By.xpath("//a[@href ='https://magento.softwaretestingboard.com/customer/account/login/referer/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS8%2C/']");
    By demoStoreSignBy = By.xpath("//div[@class='message global demo']");


    public HomePage goToBaseUrl(){
       driver.get(baseUrl);
   
       return this;
    }
    
    public HomePage verifyNumberOfProducts(int expectedNumberOfProducts){
       int actualNumberOfProducts = countItems(inventoryItemBy);
       assertIntegerEquals(expectedNumberOfProducts, actualNumberOfProducts);

       return this;
    }

    public HomePage navigateToRegister(){
      click(createAnAccountBy);

      return this;
    }

    public HomePage navigateToLogin(){
      click(signinButtonBy);
        return this;
    }

    public HomePage verifySuccessfulLogout(String expectedMessage){
      
      String actualText = readText(demoStoreSignBy);
      assertTextEquals(actualText, expectedMessage);
    
      return this;
    }
}
