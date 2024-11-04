package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BaseTest;

public class PerformanceGlitchTest extends BaseTest {

    @Test
    public void testPerformanceGlitchPurchase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("performance_glitch_user", "secret_sauce");
        
        HomePage homePage = new HomePage(driver);
        homePage.resetAppState();

        homePage.filterProductsByZtoA();

        homePage.addFirstProductToCart();

        homePage.goToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.completeCheckout("First", "Last", "12345");

        String successMessage = checkoutPage.getOrderCompleteMessage();
        Assert.assertEquals(successMessage, "Thank you for your order!");
    }
}
