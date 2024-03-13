package StepDefinitions;

import Base.TestBase;
import Pages.*;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class CheckoutStepDef extends TestBase {

//    WebDriver driver;
//    @Before
//    public void setDriver(){
//        driver = new ChromeDriver();
//        driver.get("https://magento.softwaretestingboard.com/");
//    }

    @Before
    public void setUP(){
        initialization();
    }

    @Given("user navigates to the homepage")
    public void user_navigates_to_the_homepage() {
        Homepage homepage = new Homepage();
        homepage.checkHomepage(driver);
    }
    @And("user selects a category")
    public void user_selects_a_category() {
        ListingPage listingPage = new ListingPage();
        listingPage.clickOnACategoryElement(driver);
    }
    @When("picks a product from the listing page")
    public void picks_a_product_from_the_listing_page() {
        ProductSelection productSelection = new ProductSelection();
        productSelection.clickOnAProductFromListing(driver);
    }


    @And("adds to Basket an item from PDP")
    public void adds_to_Basket_an_item_from_PDP() throws InterruptedException {
        ProductPage productPage = new ProductPage();
        productPage.addToBasketFromPDP(driver);
    }


    @When("fills in the shipping address")
    public void fills_in_the_shipping_address() throws InterruptedException{
        ShippingPage shippingPage = new ShippingPage();
        shippingPage.checkShippingPage(driver);

    }
    @When("selects a payment method")
    public void selects_a_payment_method() throws InterruptedException{
        PaymentPage paymentPage = new PaymentPage();
        paymentPage.completePayment(driver);

    }
    @Then("user is able to place the order")
    public void user_is_able_to_place_the_order() throws InterruptedException{
        OrderConfirmationPage orderConfirmationPage = new OrderConfirmationPage();
        orderConfirmationPage.orderConfirmationMessage(driver);
    }

    @Given("sign in with {string} and {string}")
    public void sign_in_with_and(String username, String password) {
        SignInPage signInPage = new SignInPage();
        signInPage.signIn(driver,username, password);
    }

    @And("selects a payment method using a different billing address")
    public void selects_a_payment_method_using_a_different_billing_address() throws InterruptedException{
        PaymentWithDifferentBillingAddress paymentWithDifferentBillingAddress = new PaymentWithDifferentBillingAddress();
        paymentWithDifferentBillingAddress.payWithDifferentBillingAddress(driver);
    }



}
