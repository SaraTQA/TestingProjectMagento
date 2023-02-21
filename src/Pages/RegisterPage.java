package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class RegisterPage extends BasePage{
   
    public RegisterPage(WebDriver driver){
        super(driver);
    }
    
    By firstNameBy = By.id("firstname");
    By lastNameBy = By.id("lastname");
    By validEmailBy = By.id("email_address");
    By validPasswordBy = By.id("password");
    By confirmPasswordBy = By.id("password-confirmation");
    By createAnAccountButtonBy = By.xpath("//span[.='Create an Account']");
    
   
    public RegisterPage verifyNavigationFromHomepageToRegister(){
      assertElementVisible(firstNameBy);

        return this;

      }
    
    public RegisterPage registerNewUser(String firstName, String lastName, String validEmail, String validPassword, String confirmPassword){
      writeText(firstNameBy, firstName);
      writeText(lastNameBy, lastName);
      writeText(validEmailBy, validEmail);
      writeText(validPasswordBy, validPassword);
      writeText(confirmPasswordBy, confirmPassword);
      click(createAnAccountButtonBy);
      
      return this;
      
   }
 }

