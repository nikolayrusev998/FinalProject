package Pages;

import Utils.Hooks;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Index {
    WebDriver driver;
    WebDriverWait wait = new WebDriverWait(Hooks.driver,(10));

    By signupLoginBtn = By.xpath("//a[@href='/login']");
    By bluetopViewProduct = By.xpath("//a[@href='/product_details/1']");
    By deleteAccount = By.xpath("//a[@href='/delete_account']");
    By accountDeletedText = By.xpath("//h2/b[.='Account Deleted!']");
    By deleteAccountContinue = By.xpath("//section[@id='form']/div[@class='container']//a[@href='/']");
    public Index(WebDriver driver){
        this.driver = driver;
    }

    public void clickSignupLoginBtn (){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(signupLoginBtn)));
        Assert.assertTrue(driver.findElement(signupLoginBtn).isEnabled());
        driver.findElement(signupLoginBtn).click();

    }
    public void viewProduct(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(bluetopViewProduct)));
        Assert.assertTrue(driver.findElement(bluetopViewProduct).isDisplayed());
        driver.findElement(bluetopViewProduct).click();
    }
    public void clickDelete(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(deleteAccount)));
        Assert.assertTrue(driver.findElement(deleteAccount).isEnabled());
        driver.findElement(deleteAccount).click();
    }
    public void clickDeleteAccContinue(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(deleteAccountContinue)));
        Assert.assertTrue(driver.findElement(deleteAccountContinue).isEnabled());
        driver.findElement(deleteAccountContinue).click();
    }
    public void accDeletedTextPresented(){
        wait.until(ExpectedConditions.visibilityOf(driver.findElement(accountDeletedText)));
        Assert.assertTrue(driver.findElement(accountDeletedText).isDisplayed());
    }
}
