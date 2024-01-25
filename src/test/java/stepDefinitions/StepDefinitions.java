package stepDefinitions;

import Pages.Index;
import Pages.PurchaseProduct;
import Pages.SignupLoginPage;
import Utils.Hooks;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.support.ui.WebDriverWait;

public class StepDefinitions {
    SignupLoginPage signupLoginPage;
    Index index;
    PurchaseProduct purchaseProduct;



    @Given("The user enters the site, clicks on Signup")
    public void the_user_enters_the_site_clicks_on_Signup() {
        index = new Index(Hooks.driver);

        index.clickSignupLoginBtn();


    }

    @When("The user provides valid information")
    public void userEntersValidData() {
        signupLoginPage = new SignupLoginPage(Hooks.driver);

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
        signupLoginPage = new SignupLoginPage(Hooks.driver);

        signupLoginPage.accCreated();


    }


    @Given("The user logins into the system")
    public void userLogin() {
        index = new Index(Hooks.driver);
        signupLoginPage = new SignupLoginPage(Hooks.driver);

        index.clickSignupLoginBtn();
        signupLoginPage.fillLoginEmail("rrandom@abv.bg");
        signupLoginPage.fillLoginPass("randompass123");
        signupLoginPage.clickLoginBtn();


    }

    @When("The user buys a product")
    public void buyProduct() {
        index = new Index(Hooks.driver);
        purchaseProduct = new PurchaseProduct(Hooks.driver);

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
        purchaseProduct = new PurchaseProduct(Hooks.driver);

        purchaseProduct.validatePlacedOrder();
        purchaseProduct.clickContinue();


    }

    @When("The user click on Delete account")
    public void deleteAccount() {
        index = new Index(Hooks.driver);

        index.clickDelete();

        index.clickDeleteAccContinue();


    }

    @Then("The user no longer can login with his account")
    public void validateDeletedAccount() {
        index = new Index(Hooks.driver);
        signupLoginPage = new SignupLoginPage(Hooks.driver);

        index.clickSignupLoginBtn();
        signupLoginPage.fillLoginEmail("rrandom@abv.bg");
        signupLoginPage.fillLoginPass("randompass123");
        signupLoginPage.clickLoginBtn();
        signupLoginPage.validationPresented();


    }

}
