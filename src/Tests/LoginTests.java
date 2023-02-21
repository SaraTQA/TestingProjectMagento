package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;

public class LoginTests extends BaseTest {
    String expectedErrorMessage = "A login and a password are required.";
    String expectedErrorSign = "Incorrect CAPTCHA";
    String invalidEmail = "st@gmail.com";
    String invalidPassword = "abc123";
    String demoStoresign = "This is a demo store. No orders will be fulfilled.";

    @Test
    public void verifyNavigationToLoginFromHomepage(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        
        homePage.goToBaseUrl();
        homePage.navigateToLogin(); 
        loginPage.verifyNavigationFromHomepage(); 
    }
   
    @Test
    public void verifySuccessfullogin(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.verifySuccessfulLogin();
        
    }
   
    @Test
    public void verifyEmptyEmailLoginAttemt(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login("", validPassword);
        loginPage.verifyEmptyEmailLogin(expectedErrorMessage);
  }

    @Test
    public void verifyEmptyPasswordLoginAttemt(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, "");
        loginPage.verifyEmptyPasswordLogin(expectedErrorMessage);
  }

     @Test
     public void verifyInvalidEmailLoginAttemt(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(invalidEmail, validPassword);
        loginPage.verifyInvalidEmailLogin(expectedErrorSign);
  }
 
     @Test
     public void verifyInvalidPasswordLoginAttemt(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, invalidPassword);
        loginPage.verifyInvalidPasswordLogin(expectedErrorSign);

 } 

     @Test
     public void successfulLogout(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.expandMenu();
        productListPage.navigateToHomepage();
        homePage.verifySuccessfulLogout(demoStoresign);
 }

}
    
