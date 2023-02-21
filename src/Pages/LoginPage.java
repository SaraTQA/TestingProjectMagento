package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage {
    
    public LoginPage(WebDriver driver){
        super(driver);
    }

    By cartIconBy = By.xpath("//a[@href ='https://magento.softwaretestingboard.com/checkout/cart/']");
    By emailBy = By.id("email");
    By passwordBy = By.id("pass");
    By signinButtonBy = By.id("send2");
    By errorMessageBy = By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");
    By errorSignBy = By.xpath("/html/body/div[2]/main/div[2]/div[2]/div/div/div");
    
    

    public LoginPage verifyNavigationFromHomepage(){
    assertElementVisible(cartIconBy);

    return this;
    
  }

    public LoginPage login(String email, String password){
    writeText(emailBy, email);
    writeText(passwordBy, password);
    click(signinButtonBy);
  
    return this;
    
  }

  public LoginPage verifyEmptyEmailLogin(String expectedError){
    String actualText = readText(errorMessageBy);
    assertTextEquals(actualText, expectedError);
    
    return this;

  }

  public LoginPage verifyEmptyPasswordLogin(String expectedError){
    String actualText = readText(errorMessageBy);
    assertTextEquals(actualText, expectedError);
   
    return this;
  }

  public LoginPage verifyInvalidEmailLogin(String expectedError){
    String actualText = readText(errorSignBy);
    assertTextEquals(actualText, expectedError);
   
    return this;
 }

 public LoginPage verifyInvalidPasswordLogin(String expectedError){
  String actualText = readText(errorSignBy);
  assertTextEquals(actualText, expectedError);
  
  return this;
 }

}
