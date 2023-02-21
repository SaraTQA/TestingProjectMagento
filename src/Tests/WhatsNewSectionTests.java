package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductListPage;
import Pages.WhatsNewSectionPage;

public class WhatsNewSectionTests extends BaseTest{

    @Test
    public void verifySuccessfulNavigationfromPLP(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        WhatsNewSectionPage whatsNewSectionPage = new WhatsNewSectionPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.navigateToWhatsNewSection();
        whatsNewSectionPage.verifyNavigationFromPLP();
 }
    
}
