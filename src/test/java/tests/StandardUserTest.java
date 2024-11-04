package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.CartPage;
import pages.CheckoutPage;
import pages.HomePage;
import pages.LoginPage;
import utilities.BaseTest;

public class StandardUserTest extends BaseTest {

    @Test
    public void testStandardUserPurchase() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");
        
        HomePage homePage = new HomePage(driver);
        homePage.resetAppState();
        
        for (int i = 1; i <= 3; i++) {
            homePage.addItemToCart(i);
        }
        
        homePage.goToCart();
        CartPage cartPage = new CartPage(driver);
        cartPage.proceedToCheckout();

        CheckoutPage checkoutPage = new CheckoutPage(driver);
        checkoutPage.completeCheckout("First", "Last", "12345");

        String successMessage = checkoutPage.getOrderCompleteMessage();
        Assert.assertEquals(successMessage, "Thank you for your order!");
        
        String totalPrice = checkoutPage.getTotalPrice();
        Assert.assertTrue(totalPrice.contains("Total: $"));
    }
}
