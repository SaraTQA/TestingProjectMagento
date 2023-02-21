package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.RegisterPage;

public class RegisterPageTests extends BaseTest{
    

    @Test
    public void registerNewAccount(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        
        homePage.goToBaseUrl();
        homePage.navigateToRegister();
        registerPage.verifyNavigationFromHomepageToRegister();
        registerPage.registerNewUser(firstName, lastName, validEmail, validPassword, confirmPassword);
    }    
}
