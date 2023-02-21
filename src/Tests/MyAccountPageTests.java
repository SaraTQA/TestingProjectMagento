package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.MyAccountPage;
import Pages.RegisterPage;

public class MyAccountPageTests extends BaseTest {
    
    @Test
    public void verifySuccessfulRegister(){
        HomePage homePage = new HomePage(driver);
        RegisterPage registerPage = new RegisterPage(driver);
        MyAccountPage myAccountPage = new MyAccountPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToRegister();
        registerPage.registerNewUser(firstName, lastName, validEmail, validPassword, confirmPassword);
        myAccountPage.verifySuccessfulSignup();
    }   
}
