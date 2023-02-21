package Tests;

import org.junit.Test;

import Pages.CartPage;
import Pages.HomePage;
import Pages.LoginPage;
import Pages.ProductDetailsPage;
import Pages.ProductListPage;
import Pages.WhatsNewSectionPage;

public class CartTests extends BaseTest {
    String kolicina = "1";
    String addToCartMessage = "You added Phoebe Zipper Sweatshirt to your shopping cart.";
    String price = "$59.00";
    String shipping = "$0.00";
    String totalPrice = "$59.00";

    @Test
    public void successfulNavigationFromPDP(){
        HomePage homePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        WhatsNewSectionPage whatsNewSectionPage = new WhatsNewSectionPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CartPage cartPage = new CartPage(driver);

        homePage.goToBaseUrl();
        homePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.navigateToWhatsNewSection();
        whatsNewSectionPage.navigateToPDPViaName();
        productDetailsPage.chooseProductSize();
        productDetailsPage.chooseItemsColor();
        productDetailsPage.chooseQuantity(kolicina);
        productDetailsPage.addToCart();
        productDetailsPage.verifyAddToCartAction(addToCartMessage);
        productDetailsPage.navigateToCart();
        cartPage.verifyNavigationFromPDP();     

    }

    @Test
    public void verifySuccessfulDisplayOfPrice(){
        HomePage homepagePage = new HomePage(driver);
        LoginPage loginPage = new LoginPage(driver);
        ProductListPage productListPage = new ProductListPage(driver);
        WhatsNewSectionPage whatsNewSectionPage = new WhatsNewSectionPage(driver);
        ProductDetailsPage productDetailsPage = new ProductDetailsPage(driver);
        CartPage cartPage = new CartPage(driver);

        homepagePage.goToBaseUrl();
        homepagePage.navigateToLogin();
        loginPage.login(validEmail, validPassword);
        productListPage.navigateToWhatsNewSection();
        whatsNewSectionPage.navigateToPDPViaName();
        productDetailsPage.chooseProductSize();
        productDetailsPage.chooseItemsColor();
        productDetailsPage.chooseQuantity(kolicina);
        productDetailsPage.addToCart();
        productDetailsPage.verifyAddToCartAction(addToCartMessage);
        productDetailsPage.navigateToCart();
        cartPage.verifySuccessfulPriceDisplay(price);
        cartPage.verifySuccessfulShippingDisplay(shipping);
        cartPage.verifySuccessfulTotalPriceDisplay(totalPrice);
     }
}
    

