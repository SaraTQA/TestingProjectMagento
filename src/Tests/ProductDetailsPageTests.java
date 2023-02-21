package Tests;

import org.junit.Test;

import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.ProductListPage;
import Pages.WhatsNewSectionPage;

public class ProductDetailsPageTests extends BaseTest{
    String addToCartMessage = "You added Phoebe Zipper Sweatshirt to your shopping cart.";
    String kolicina = "1";

    @Test
    public void addProductToCart(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        WhatsNewSectionPage whatsNewSectionPage = new WhatsNewSectionPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);


        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.navigateToWhatsNewSection();
        whatsNewSectionPage.navigateToPDPViaName();
        productDetailsPage.verifyNavigationFromWhatsNewToPDP();
        productDetailsPage.chooseProductSize();
        productDetailsPage.chooseItemsColor();
        productDetailsPage.chooseQuantity(kolicina);
        productDetailsPage.addToCart();
        productDetailsPage.verifyAddToCartAction(addToCartMessage);

    }

    @Test
    public void navigationToCart(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        WhatsNewSectionPage whatsNewSectionPage = new WhatsNewSectionPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
    
        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.navigateToWhatsNewSection();
        whatsNewSectionPage.navigateToPDPViaName();
        productDetailsPage.chooseProductSize();
        productDetailsPage.chooseItemsColor();
        productDetailsPage.chooseQuantity(kolicina);
        productDetailsPage.addToCart();
        productDetailsPage.navigateToCart();

    }
  }
