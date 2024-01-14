package stepDefinitions;

import Pages.Index;
import Pages.PurchaseProduct;
import Pages.SignupLoginPage;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.io.File;
import java.util.concurrent.TimeUnit;

public class StepDefinitions {

    WebDriver driver;
    SignupLoginPage signupLoginPage;
    Index index;
    PurchaseProduct purchaseProduct;

    @Before
    public void Setup() {
        ChromeOptions opt = new ChromeOptions();
        opt.addExtensions(new File("C:\\extension\\uBlock.crx"));

        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver(opt);
        driver.manage().window().maximize();
        driver.manage().deleteAllCookies();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
        driver.get("https://automationexercise.com/");
    }

    @Given("The user enters the site, clicks on Signup")
    public void the_user_enters_the_site_clicks_on_Signup() {
        index = new Index(driver);

        index.clickSignupLoginBtn();


    }

    @When("The user provides valid information")
    public void userEntersValidData() {
        signupLoginPage = new SignupLoginPage(driver);

        signupLoginPage.setNewUserNameField("Random");
        signupLoginPage.setNewUserEmailField("rrandom@abv.bg");
        signupLoginPage.clickSignupButton();
        signupLoginPage.setPasswordField("randompass123");
        signupLoginPage.setFirstNameField("Random");
        signupLoginPage.setLastNameField("Randomov");
        signupLoginPage.setAddressField("random address, 123");
        signupLoginPage.setStateField("Random state");
        signupLoginPage.setCityField("Random city");
        signupLoginPage.setZipcodeField("9000");
        signupLoginPage.setMobileNumberField("0123456789");
        signupLoginPage.clickCreateAcc();

    }

    @Then("The user's account is successfully created")
    public void validateUserAccount() {
        signupLoginPage = new SignupLoginPage(driver);

        signupLoginPage.accCreated();


    }


    @Given("The user logins into the system")
    public void userLogin() {
        index = new Index(driver);
        signupLoginPage = new SignupLoginPage(driver);

        index.clickSignupLoginBtn();
        signupLoginPage.fillLoginEmail("rrandom@abv.bg");
        signupLoginPage.fillLoginPass("randompass123");
        signupLoginPage.clickLoginBtn();


    }

    @When("The user buys a product")
    public void buyProduct() {
        index = new Index(driver);
        purchaseProduct = new PurchaseProduct(driver);

        index.viewProduct();
        purchaseProduct.clickAddToCart();
        purchaseProduct.clickViewCart();
        purchaseProduct.clickProceedToCheckout();
        purchaseProduct.clickPlaceOrder();
        purchaseProduct.setNameOnCard("Random Randomov");
        purchaseProduct.setCardNumber("4111111111111111");
        purchaseProduct.setCvc("534");
        purchaseProduct.setCardExpirationMonth("05");
        purchaseProduct.setCardExpirationYear("2026");
        purchaseProduct.clickPay();


    }

    @Then("The user successfully has bought a product")
    public void productBought() {
        purchaseProduct = new PurchaseProduct(driver);

        purchaseProduct.validatePlacedOrder();
        purchaseProduct.clickContinue();


    }

    @When("The user click on Delete account")
    public void deleteAccount() {
        index = new Index(driver);

        index.clickDelete();
        index.clickDeleteAccContinue();


    }

    @Then("The user no longer can login with his account")
    public void validateDeletedAccount() {
        index = new Index(driver);
        signupLoginPage = new SignupLoginPage(driver);

        index.clickSignupLoginBtn();
        signupLoginPage.fillLoginEmail("rrandom@abv.bg");
        signupLoginPage.fillLoginPass("randompass123");


    }

    @After
    public void tearDown() {
        driver.quit();


    }

}
