package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {
    private WebDriver driver;
    private WebDriverWait wait;
    
    private By resetMenu = By.xpath("//button[@id = 'react-burger-menu-btn']");
    private By resetAppState = By.id("reset_sidebar_link");
    private By closeMenu = By.xpath("//button[@id = 'react-burger-cross-btn']");
    private By allItemsButton = By.id("inventory_sidebar_link");
    private By cartButton = By.xpath("//a[@class='shopping_cart_link']");
    private By sortDropdown = By.xpath("//select[@class='product_sort_container']");
    private By addToCartButton = By.xpath("//button[text()='Add to cart']");

    public HomePage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, Duration.ofSeconds(10));
    }

    public void resetAppState() {
        wait.until(ExpectedConditions.elementToBeClickable(resetMenu)).click();
        wait.until(ExpectedConditions.elementToBeClickable(resetAppState)).click();
        wait.until(ExpectedConditions.elementToBeClickable(closeMenu)).click();
        
        WebElement allItemsElement = wait.until(ExpectedConditions.elementToBeClickable(allItemsButton));
        Actions actions = new Actions(driver);
        actions.moveToElement(allItemsElement).click().perform();
    }

    public void goToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(cartButton)).click();
    }

    public void addItemToCart(int index) {
        By itemAddToCartButton = By.xpath("(//button[text()='Add to cart'])[" + index + "]");
        wait.until(ExpectedConditions.elementToBeClickable(itemAddToCartButton)).click();
    }

    public void filterProductsByZtoA() {
        wait.until(ExpectedConditions.elementToBeClickable(sortDropdown)).click();
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//option[@value='za']"))).click();
    }

    public void addFirstProductToCart() {
        wait.until(ExpectedConditions.elementToBeClickable(By.xpath("(//button[text()='Add to cart'])[1]"))).click();
    }
}
