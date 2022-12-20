package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.*;
import com.nopcommerce.demo.utility.Utility;
import cucumber.api.PendingException;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class CellPhonePageSteps {
    @When("^I mouse hover to electronic tab$")
    public void iMouseHoverToElectronicTab() {
        new HomePage().mouseHoverToElectronicTab();
    }

    @And("^I mouse hover to cell phone link and click$")
    public void iMouseHoverToCellPhoneLinkAndClick() {
        new HomePage().mouseHoverToCellPhoneLinkAndClick();
    }

    @Then("^I should navigate to cell phone page successfully$")
    public void iShouldNavigateToCellPhonePageSuccessfully() {
        Assert.assertEquals("User not navigate to cell phone page","Cell phones", new CellPhonesPage().getCellPhoneText());
    }

    @And("^I click on list view tab of cell phone page$")
    public void iClickOnListViewTabOfCellPhonePage() {
        new CellPhonesPage().clickOnListViewTab();
    }

    @And("^I click on nokia lumia cell phone$")
    public void iClickOnNokiaLumiaCellPhone() throws InterruptedException{
        Thread.sleep(1000);
        new CellPhonesPage().clickOnNokiaLumia1020CellPhone();
    }

    @Then("^I should navigate to nokia lumia cell phone page$")
    public void iShouldNavigateToNokiaLumiaCellPhonePage() {
        Assert.assertEquals("User Not Navigate to nokia lumia product page","Nokia Lumia 1020", new NokiaLumia1020CellPhoneProductPage().getNokiaLumia1020Text());
    }

    @And("^I should see product price \"([^\"]*)\"$")
    public void iShouldSeeProductPrice(String priceTotal){
        Assert.assertEquals("Product price not matched",priceTotal, new NokiaLumia1020CellPhoneProductPage().getTotal());

    }

    @And("^I change the quantity to \"([^\"]*)\"$")
    public void iChangeTheQuantityTo(String quantity){
        new NokiaLumia1020CellPhoneProductPage().changeTheQuantityTo(quantity);

    }

    @And("^I click on add to cart button of cell phone page$")
    public void iClickOnAddToCartButtonOfCellPhonePage() {
        new NokiaLumia1020CellPhoneProductPage().clickOnAddToCartButton();
    }

    @And("^I should see quantity \"([^\"]*)\" of product$")
    public void iShouldSeeQuantityOfProduct(String quantity){
        Assert.assertEquals("Quantity not updated",quantity,new ShoppingCartPage().getQuantityDisplayedOnPage("value"));

    }

    @And("^I click on register tab$")
    public void iClickOnRegisterTab() {
        new CheckoutAsGuestOrLoginPage().clickOnRegisterTab();
    }

    @Then("^I should navigate to register page successfully$")
    public void iShouldNavigateToRegisterPageSuccessfully() {
        Assert.assertEquals("User not Navigate to register page","Register",new RegisterPage().getRegisterText());
    }

    @And("^I fill all mandatory field of registration$")
    public void iFillAllMandatoryFieldOfRegistration() {
        new RegisterPage().enterFirstName("Manisha");
        new RegisterPage().enterLastName("Mavani");
        new RegisterPage().selectDateOfBirth("15");
        new RegisterPage().selectMonthOfBirth("July");
        new RegisterPage().selectYearOfBirth("1995");
        new RegisterPage().enterEmail("prime"+ Utility.getRandomString(4)+"@gmail.com");
        new RegisterPage().enterPassword("test123");
        new RegisterPage().enterConfirmPassword("test123");
    }

    @And("^I click on Register button$")
    public void iClickOnRegisterButton() {
        new RegisterPage().clickOnRegister();
    }

    @Then("^I should get registration completed message$")
    public void iShouldGetRegistrationCompletedMessage() {
        Assert.assertEquals("Registration not completed","Your registration completed", new RegisterPage().getRegistrationCompleted());
    }

    @And("^I click on continue of registration$")
    public void iClickOnContinueOfRegistration() {
        new RegisterPage().clickOnContinueButton();
    }

    @And("^I fill all mandatory field on check out page$")
    public void iFillAllMandatoryFieldOnCheckOutPage() {
        new OnePageCheckoutPage().selectCountry("United States");
        new OnePageCheckoutPage().selectState("California");
        new OnePageCheckoutPage().selectCity("London");
        new OnePageCheckoutPage().enterAddressLine1("35, Coventry Road");
        new OnePageCheckoutPage().enterZipCode("CV2 0LM");
        new OnePageCheckoutPage().enterPhoneNumber("06767567634");
    }

    @And("^I click on second day air radio button$")
    public void iClickOnSecondDayAirRadioButton() {
        new OnePageCheckoutPage().clickOn2ndDayAirRadioButton();
    }

    @And("^I fill all visa card detail$")
    public void iFillAllVisaCardDetail() {
        new OnePageCheckoutPage().enterCardHolderName("MRs M D Mavani");
        new OnePageCheckoutPage().enterCardNumber("4111111111111111");
        new OnePageCheckoutPage().selectExpiryMonthOfCard("04");
        new OnePageCheckoutPage().selectExpiryYearOfCard("2026");
        new OnePageCheckoutPage().enterCardCode("123");
    }

    @And("^I click on Logout link$")
    public void iClickOnLogoutLink() {
        new HomePage().clickOnLogOutLink();
    }

    @Then("^I should navigate to homepage of website successfully$")
    public void iShouldNavigateToHomepageOfWebsiteSuccessfully() {
        Assert.assertEquals("User not Logout successfully","https://demo.nopcommerce.com/", new Utility().getCurrentUrl());
    }
}
