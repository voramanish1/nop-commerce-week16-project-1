package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class DesktopPageSteps {
    @When("^I click on Computer menu$")
    public void iClickOnComputerMenu() {
        new HomePage().clickOnComputerTab();
    }

    @And("^I click on Desktop tab$")
    public void iClickOnDesktopTab() {
        new HomePage().clickOnDesktopTab();

    }

    @And("^I select sort by position \"([^\"]*)\"$")
    public void iSelectSortByPosition(String position) {
        new DesktopPage().selectSortedPosition(position);

    }

    @Then("^I should see product arrange in alphabetical order successfully$")
    public void iShouldSeeProductArrangeInAlphabeticalOrderSuccessfully() {
        Assert.assertEquals("Product not arrange in alphabetical order", new DesktopPage().expectedList(), new DesktopPage().getSortedProductList());
    }

    @And("^I click on add to cart of build your own computer$")
    public void iClickOnAddToCartOfBuildYourOwnComputer() throws InterruptedException {
        Thread.sleep(1000);
        new DesktopPage().clickOnAddToCartOfBuildYourOwnComputer();
    }

    @Then("^I should navigate to build your own computer product page$")
    public void iShouldNavigateToBuildYourOwnComputerProductPage() throws InterruptedException{
        Thread.sleep(500);
        Assert.assertEquals("Product not added", "Build your own computer", new BuildYourOwnComputerProductPage().getBuildYourComputerText());
    }

    @And("^I select processor \"([^\"]*)\"$")
    public void iSelectProcessor(String processor) {
        new BuildYourOwnComputerProductPage().selectProcessor(processor);

    }

    @And("^I select RAM \"([^\"]*)\"$")
    public void iSelectRAM(String ram) {
        new BuildYourOwnComputerProductPage().selectRAM(ram);

    }

    @And("^I select HDD radio \"([^\"]*)\"$")
    public void iSelectHDDRadio(String hdd) {
        new BuildYourOwnComputerProductPage().selectHDDRadioButton(hdd);

    }

    @And("^I select OS \"([^\"]*)\"$")
    public void iSelectOS(String os) {
        new BuildYourOwnComputerProductPage().selectOSVistaPremium(os);

    }

    @And("^I select check box \"([^\"]*)\"$")
    public void iSelectCheckBox(String text) {
        new BuildYourOwnComputerProductPage().selectTwoCheckBox();

    }

    @Then("^I should see \"([^\"]*)\" total price$")
    public void iShouldSeeTotalPrice(String totalPrice) {
        Assert.assertEquals("Price not match", totalPrice, new BuildYourOwnComputerProductPage().getTotal());

    }

    @And("^I click on add to cart button$")
    public void iClickOnAddToCartButton() {
        new BuildYourOwnComputerProductPage().clickOnAddToCart();
    }

    @Then("^I should see product added shopping cart successfully message$")
    public void iShouldSeeProductAddedShoppingCartSuccessfullyMessage() {
        Assert.assertEquals("Product not added successfully", "The product has been added to your shopping cart", new BuildYourOwnComputerProductPage().getProductAddedMessage());
    }

    @And("^I click on cross button of success message green bar$")
    public void iClickOnCrossButtonOfSuccessMessageGreenBar() {
        new BuildYourOwnComputerProductPage().clickOnCrossButtonOnGreenBar();
    }

    @And("^I mouse hover on shopping cart$")
    public void iMouseHoverOnShoppingCart() {
        new BuildYourOwnComputerProductPage().mouseHoverOnShoppingCart();
    }

    @And("^I click on go to cart$")
    public void iClickOnGoToCart() {
        new BuildYourOwnComputerProductPage().clickOnGoToCart();
    }

    @Then("^I should see shopping cart text on page$")
    public void iShouldSeeShoppingCartTextOnPage() {
        Assert.assertEquals("Page not navigated to shopping cart", "Shopping cart", new ShoppingCartPage().getShoppingCartPageText());
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String quantity) {
        new ShoppingCartPage().changeQuantity(quantity);
    }

    @And("^I click on update shopping cart$")
    public void iClickOnUpdateShoppingCart() {
        new ShoppingCartPage().clickOnUpdateShoppingCart();
    }

    @Then("^I should see \"([^\"]*)\" price$")
    public void iShouldSeePrice(String totalPrice) {
        Assert.assertEquals("Shopping cart not updated", totalPrice, new ShoppingCartPage().getTotalPrice());
    }

    @And("^I click on check box of terms and service$")
    public void iClickOnCheckBoxOfTermsAndService() {
        new ShoppingCartPage().clickOnCheckBoxOfTermsAndService();
    }

    @And("^I click on check out button$")
    public void iClickOnCheckOutButton() {
        new ShoppingCartPage().clickOnCheckOutButton();
    }

    @Then("^I should navigate to check out as guest or login page$")
    public void iShouldNavigateToCheckOutAsGuestOrLoginPage() {
        Assert.assertEquals("Not navigated to  checkout as guest or login page", "Welcome, Please Sign In!", new CheckoutAsGuestOrLoginPage().getWelcomePleaseSignInText());
    }

    @And("^I click on check out as guest tab$")
    public void iClickOnCheckOutAsGuestTab() {
        new CheckoutAsGuestOrLoginPage().clickOnCheckoutAsGuest();

    }

    @And("^I fill all mandatory field on check out as guest page$")
    public void iFillAllMandatoryFieldOnCheckOutAsGuestPage() {
        new OnePageCheckoutPage().enterFirstName("Manisha");
        new OnePageCheckoutPage().enterLastName("Mavani");
        new OnePageCheckoutPage().enterEmail("ManiPatel@gmail.com");
        new OnePageCheckoutPage().selectCountry("United Kingdom");
        new OnePageCheckoutPage().selectCity("London");
        new OnePageCheckoutPage().enterAddressLine1("40, Coventry Road");
        new OnePageCheckoutPage().enterZipCode("CV2 0LM");
        new OnePageCheckoutPage().enterPhoneNumber("06767567634");

    }

    @And("^I click on continue button of check page$")
    public void iClickOnContinueButtonOfCheckPage() {
        new OnePageCheckoutPage().clickOnContinueButton1();
    }

    @And("^I click on next day air radio button$")
    public void iClickOnNextDayAirRadioButton() {
        new OnePageCheckoutPage().clickOnNextDayAirRadioButton();
    }

    @And("^I click on continue button after selection$")
    public void iClickOnContinueButtonAfterSelection() {
        new OnePageCheckoutPage().clickOnContinueButton2();
    }

    @And("^I click on credit card radio button$")
    public void iClickOnCreditCardRadioButton() {
        new OnePageCheckoutPage().clickOnCreditCardRadioButton();
    }

    @And("^I click on continue button after card selection$")
    public void iClickOnContinueButtonAfterCardSelection() {
        new OnePageCheckoutPage().clickOnContinueButton3();
    }

    @And("^I select \"([^\"]*)\" from credit card drop down$")
    public void iSelectFromCreditCardDropDown(String cardType) {
        new OnePageCheckoutPage().selectCreditCardFromDropDown(cardType);
    }

    @And("^I fill all card detail$")
    public void iFillAllCardDetail() {
        new OnePageCheckoutPage().enterCardHolderName("MRs M M Patel");
        new OnePageCheckoutPage().enterCardNumber("5555 5555 5555 4444");
        new OnePageCheckoutPage().selectExpiryMonthOfCard("04");
        new OnePageCheckoutPage().selectExpiryYearOfCard("2026");
        new OnePageCheckoutPage().enterCardCode("123");
    }

    @And("^I click on continue after filling all card detail$")
    public void iClickOnContinueAfterFillingAllCardDetail() {
        new OnePageCheckoutPage().clickOnContinueButton4();
    }

    @Then("^I should see payment method \"([^\"]*)\"$")
    public void iShouldSeePaymentMethod(String paymentMethod) {
        Assert.assertTrue("Payment method is not selected as credit card", new OnePageCheckoutPage().getPaymentMethodIsCreditCard().contains(paymentMethod));

    }

    @And("^I should see shopping method \"([^\"]*)\"$")
    public void iShouldSeeShoppingMethod(String shoppingMethod) {
        Assert.assertTrue("Shipping method is not selected Next Day Air", new OnePageCheckoutPage().getShoppingMethodIsNextDayAir().contains(shoppingMethod));

    }

    @And("^I should see \"([^\"]*)\" price of product$")
    public void iShouldSeePriceOfProduct(String price) {
        Assert.assertEquals("Total not matched", price, new OnePageCheckoutPage().getTotalPriceOfProduct());
    }

    @And("^I click on confirm button$")
    public void iClickOnConfirmButton() {
        new OnePageCheckoutPage().clickOnConfirm();
    }

    @Then("^I should see Thank you message$")
    public void iShouldSeeThankYouMessage() {
        Assert.assertEquals("Not proceed", "Thank you", new OnePageCheckoutPage().getThankYouText());
    }

    @And("^I should see order successfully processed message$")
    public void iShouldSeeOrderSuccessfullyProcessedMessage() {
        Assert.assertEquals("Order not successfully proceed", "Your order has been successfully processed!", new OnePageCheckoutPage().getOrderSuccessfullyProcessed());
    }

    @And("^I click on continue button$")
    public void iClickOnContinueButton() {
        new OnePageCheckoutPage().clickOnContinueButton();
    }

    @Then("^I should see welcome to our store text$")
    public void iShouldSeeWelcomeToOurStoreText() {
        Assert.assertEquals("Ordered Successfully completed", "Welcome to our store", new HomePage().getWelcomeToOurStoreText());
    }


}



