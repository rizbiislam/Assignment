package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.*;
import utilities.BaseTest;
public class CartTest{
/*
public class CartTest extends BaseTest {

    @Test(description = "Login with standard_user, add items to cart, and verify checkout")
    public void verifyAddToCartAndCheckout() {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login("standard_user", "secret_sauce");

        HomePage homePage = new HomePage(driver);
        homePage.resetAppState();
        homePage.addProductToCart("Sauce Labs Backpack");
        homePage.addProductToCart("Sauce Labs Bike Light");
        homePage.addProductToCart("Sauce Labs Bolt T-Shirt");

        CartPage cartPage = homePage.goToCart();
        Assert.assertTrue(cartPage.isProductInCart("Sauce Labs Backpack"));
        Assert.assertTrue(cartPage.isProductInCart("Sauce Labs Bike Light"));
        Assert.assertTrue(cartPage.isProductInCart("Sauce Labs Bolt T-Shirt"));

        CheckoutPage checkoutPage = cartPage.proceedToCheckout();
        checkoutPage.enterCheckoutInfo("John", "Doe", "12345");
        checkoutPage.finishOrder();
        Assert.assertTrue(checkoutPage.isOrderSuccessMessageDisplayed());

        homePage.resetAppState();
        homePage.logout();
    }*/
}
