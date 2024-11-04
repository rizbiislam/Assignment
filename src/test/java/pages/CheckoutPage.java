package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CheckoutPage {
    private WebDriver driver;
    private By firstNameField = By.xpath("//input[@id='first-name']");
    private By lastNameField = By.xpath("//input[@id='last-name']");
    private By zipCodeField = By.xpath("//input[@id='postal-code']");
    private By continueButton = By.xpath("//input[@id='continue']");
    private By finishButton = By.xpath("//button[@id='finish']");
    private By successMessage = By.xpath("//h2[@class='complete-header']");
    private By totalPrice = By.xpath("//div[@class='summary_total_label']");

    public CheckoutPage(WebDriver driver) {
        this.driver = driver;
    }

    public void completeCheckout(String firstName, String lastName, String zipCode) {
        driver.findElement(firstNameField).sendKeys(firstName);
        driver.findElement(lastNameField).sendKeys(lastName);
        driver.findElement(zipCodeField).sendKeys(zipCode);
        driver.findElement(continueButton).click();
        driver.findElement(finishButton).click();
    }

    public String getOrderCompleteMessage() {
        return driver.findElement(successMessage).getText();
    }

    public String getTotalPrice() {
        return driver.findElement(totalPrice).getText();
    }
}
