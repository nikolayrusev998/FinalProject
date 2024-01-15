package Pages;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupLoginPage {
    WebDriver driver;

    By newUserNameField = By.xpath("//input[@name='name']");
    By newUserEmailField = By.cssSelector(".signup-form > form[method='post'] > input[name='email']");
    By signupButton = By.xpath("//form[@action='/signup']/button[@type='submit']");
    By passwordField = By.xpath("//input[@id='password']");
    By firstNameField = By.xpath("//input[@id='first_name']");
    By lastNameField = By.xpath("//input[@id='last_name']");
    By addressField = By.xpath("//input[@name='address1']");
    By stateField = By.xpath("/html//input[@id='state']");
    By cityField = By.xpath("//input[@id='city']");
    By zipcodeField = By.xpath("//input[@id='zipcode']");
    By mobileNumberField = By.xpath("//input[@id='mobile_number']");
    By createAccBtn = By.xpath("//form[@action='/signup']/button[@type='submit']");
    By accCreated = By.xpath("//h2/b[.='Account Created!']");
    By loginEmail = By.xpath("//form[@action='/login']/input[@name='email']");
    By loginPass = By.xpath("//form[@action='/login']/input[@name='password']");
    By loginBtn = By.xpath("//form[@action='/login']/button[@type='submit']");
    By incorrectEmailPass = By.xpath("//form[@action='/login']/p[.='Your email or password is incorrect!']");
    public SignupLoginPage(WebDriver driver) {
        this.driver = driver;
    }

    public void setNewUserNameField(String name){
        driver.findElement(newUserNameField).clear();
        driver.findElement(newUserNameField).sendKeys(name);
    }

    public void setNewUserEmailField(String email){
        driver.findElement(newUserEmailField).clear();
        driver.findElement(newUserEmailField).sendKeys(email);
    }

    public void clickSignupButton(){
        driver.findElement(signupButton).click();
    }

    public void setPasswordField(String password){
        driver.findElement(passwordField).clear();
        driver.findElement(passwordField).sendKeys(password);
    }
    public void setFirstNameField(String fname){
        driver.findElement(firstNameField).clear();
        driver.findElement(firstNameField).sendKeys(fname);

    }
    public void setLastNameField(String lname){
        driver.findElement(lastNameField).clear();
        driver.findElement(lastNameField).sendKeys(lname);
    }
    public void setAddressField(String address){
        driver.findElement(addressField).clear();
        driver.findElement(addressField).sendKeys(address);
    }
    public void setStateField(String state){
        driver.findElement(stateField).clear();
        driver.findElement(stateField).sendKeys(state);
    }
    public void setCityField(String city){
        driver.findElement(cityField).clear();
        driver.findElement(cityField).sendKeys(city);
    }
    public void setZipcodeField(String zip){
        driver.findElement(zipcodeField).clear();
        driver.findElement(zipcodeField).sendKeys(zip);
    }
    public void setMobileNumberField(String mnumber){
        driver.findElement(mobileNumberField).clear();
        driver.findElement(mobileNumberField).sendKeys(mnumber);

    }
    public void clickCreateAcc(){
        driver.findElement(createAccBtn).click();
    }
    public void accCreated(){
        Assert.assertTrue(driver.findElement(accCreated).isDisplayed());
    }

    public void fillLoginEmail(String lemail){
        driver.findElement(loginEmail).clear();
        driver.findElement(loginEmail).sendKeys(lemail);

    }

    public void fillLoginPass(String lpass){
        driver.findElement(loginPass).clear();
        driver.findElement(loginPass).sendKeys(lpass);

    }

    public void clickLoginBtn(){
        driver.findElement(loginBtn).click();
    }

    public void validationPresented(){
        Assert.assertTrue(driver.findElement(incorrectEmailPass).isDisplayed());
    }


}
