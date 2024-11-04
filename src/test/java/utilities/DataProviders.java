package utilities;

import org.testng.annotations.DataProvider;

public class DataProviders {
    
    @DataProvider(name = "loginData")
    public static Object[][] loginData() {
        return new Object[][] {
            {"locked_out_user", "secret_sauce"},
            {"standard_user", "secret_sauce"},
            {"performance_glitch_user", "secret_sauce"}
        };
    }
}
