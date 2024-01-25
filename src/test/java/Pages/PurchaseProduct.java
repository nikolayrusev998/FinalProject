package Pages;

import Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class PurchaseProduct {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(Hooks.driver,(10));

    By addToCart = By.xpath("//button[@type='button']");
    By viewCart = By.xpath("//a[@href='/view_cart']/u[.='View Cart']");
    By proceedToCheckout = By.xpath("//a[@class='btn btn-default check_out']");
    By placeOrder = By.xpath("//a[@href='/payment']");
    By nameOnCard = By.xpath("//input[@name='name_on_card']");
    By cardNumber = By.xpath("//input[@name='card_number']");
    By cvc = By.xpath("//input[@name='cvc']");
    By cardExpirationMonth = By.xpath("//input[@name='expiry_month']");
    By cardExpirationYear = By.xpath("//input[@name='expiry_year']");
    By payConfirmOrder = By.xpath("//button[@id='submit']");
    By orderPlacedText = By.xpath("//h2/b[.='Order Placed!']");
    By orderContinue = By.xpath("//section[@id='form']/div[@class='container']//a[@href='/']");

    public PurchaseProduct(WebDriver driver){this.driver = driver;}

    public void clickAddToCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(addToCart)));
        Assert.assertTrue(driver.findElement(addToCart).isEnabled());
        driver.findElement(addToCart).click();
    }
    public void clickViewCart(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(viewCart)));
        Assert.assertTrue(driver.findElement(viewCart).isEnabled());
        driver.findElement(viewCart).click();
    }
    public void clickProceedToCheckout(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(proceedToCheckout)));
        Assert.assertTrue(driver.findElement(proceedToCheckout).isEnabled());
        driver.findElement(proceedToCheckout).click();
    }
    public void clickPlaceOrder(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(placeOrder)));
        Assert.assertTrue(driver.findElement(placeOrder).isEnabled());
        driver.findElement(placeOrder).click();
    }
    public void setNameOnCard(String cardName){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(nameOnCard)));
        driver.findElement(nameOnCard).clear();
        driver.findElement(nameOnCard).sendKeys(cardName);
    }
    public void setCardNumber (String cardNum){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cardNumber)));
        driver.findElement(cardNumber).clear();
        driver.findElement(cardNumber).sendKeys(cardNum);
    }
    public void setCvc(String cvcCode){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cvc)));
        driver.findElement(cvc).clear();
        driver.findElement(cvc).sendKeys(cvcCode);
    }
    public void setCardExpirationMonth(String month){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cardExpirationMonth)));
        driver.findElement(cardExpirationMonth).clear();
        driver.findElement(cardExpirationMonth).sendKeys(month);
    }
    public void setCardExpirationYear(String year){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(cardExpirationYear)));
        driver.findElement(cardExpirationYear).clear();
        driver.findElement(cardExpirationYear).sendKeys(year);
    }
    public void clickPay(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(payConfirmOrder)));
        Assert.assertTrue(driver.findElement(payConfirmOrder).isEnabled());
        driver.findElement(payConfirmOrder).click();
    }
    public void validatePlacedOrder(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(orderPlacedText)));
        Assert.assertTrue(driver.findElement(orderPlacedText).isDisplayed());
    }
    public void clickContinue(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(orderContinue)));
        Assert.assertTrue(driver.findElement(orderContinue).isEnabled());
        driver.findElement(orderContinue).click();
    }
}

