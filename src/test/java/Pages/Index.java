package Pages;

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
        driver.findElement(signupLoginBtn).click();

    }
    public void viewProduct(){
        driver.findElement(bluetopViewProduct).click();
    }
    public void clickDelete(){
        driver.findElement(deleteAccount).click();
    }
    public void clickDeleteAccContinue(){
        driver.findElement(deleteAccountContinue).click();
    }
}
