package Tests;

import org.junit.Test;

import Pages.HomePage;

public class HomepageTests extends BaseTest{
    int expectedNumberOfProducts = 6;
    
    @Test
    public void navigateToUrl(){
        HomePage homePage = new HomePage(driver);

        homePage.goToBaseUrl();
    }
    
    @Test
    public void verifyNumberOfHotSellersProducts(){
        HomePage homePage = new HomePage(driver);

        homePage.goToBaseUrl();
        homePage.verifyNumberOfProducts(expectedNumberOfProducts);
    }  
 
}
