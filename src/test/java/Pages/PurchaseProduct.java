package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class PurchaseProduct {
    WebDriver driver;

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
        driver.findElement(addToCart).click();
    }
    public void clickViewCart(){
        driver.findElement(viewCart).click();
    }
    public void clickProceedToCheckout(){
        driver.findElement(proceedToCheckout).click();
    }
    public void clickPlaceOrder(){
        driver.findElement(placeOrder).click();
    }
    public void setNameOnCard(String cardName){
        driver.findElement(nameOnCard).clear();
        driver.findElement(nameOnCard).sendKeys(cardName);
    }
    public void setCardNumber (String cardNum){
        driver.findElement(cardNumber).clear();
        driver.findElement(cardNumber).sendKeys(cardNum);
    }
    public void setCvc(String cvcCode){
        driver.findElement(cvc).clear();
        driver.findElement(cvc).sendKeys(cvcCode);
    }
    public void setCardExpirationMonth(String month){
        driver.findElement(cardExpirationMonth).clear();
        driver.findElement(cardExpirationMonth).sendKeys(month);
    }
    public void setCardExpirationYear(String year){
        driver.findElement(cardExpirationYear).clear();
        driver.findElement(cardExpirationYear).sendKeys(year);
    }
    public void clickPay(){
        driver.findElement(payConfirmOrder).click();
    }
    public void validatePlacedOrder(){
        Assert.assertTrue(driver.findElement(orderPlacedText).isDisplayed());
    }
    public void clickContinue(){
        driver.findElement(orderContinue).click();
    }
}

