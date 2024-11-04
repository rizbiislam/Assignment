package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.LoginPage;
import utilities.BaseTest;
import utilities.DataProviders;

public class LoginErrorTest extends BaseTest {

    @Test(dataProvider = "loginData", dataProviderClass = DataProviders.class)
    public void testLoginError(String username, String password) {
        LoginPage loginPage = new LoginPage(driver);
        loginPage.login(username, password);
        
        if (username.equals("locked_out_user")) {
            String errorMessage = loginPage.getErrorMessage();
            Assert.assertEquals(errorMessage, "Sorry, this user has been locked out.");
        }
    }
}
