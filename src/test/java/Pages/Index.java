package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class Index {
    WebDriver driver;

    By signupLoginBtn = By.xpath("//a[@href='/login']");
    By bluetopViewProduct = By.xpath("//a[@href='/product_details/1']");
    By deleteAccount = By.xpath("//a[@href='/delete_account']");
    By accountDeletedText = By.xpath("//h2/b[.='Account Deleted!']");
    By deleteAccountContinue = By.xpath("//section[@id='form']/div[@class='container']//a[@href='/']");
    public Index(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignupLoginBtn (){
        Assert.assertTrue(driver.findElement(signupLoginBtn).isEnabled());
        driver.findElement(signupLoginBtn).click();

    }
    public void viewProduct(){
        Assert.assertTrue(driver.findElement(bluetopViewProduct).isDisplayed());
        driver.findElement(bluetopViewProduct).click();
    }
    public void clickDelete(){
        Assert.assertTrue(driver.findElement(deleteAccount).isEnabled());
        driver.findElement(deleteAccount).click();
    }
    public void clickDeleteAccContinue(){
        Assert.assertTrue(driver.findElement(deleteAccountContinue).isEnabled());
        driver.findElement(deleteAccountContinue).click();
    }
}
