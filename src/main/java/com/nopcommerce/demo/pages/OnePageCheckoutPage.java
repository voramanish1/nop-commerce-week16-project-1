package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

public class OnePageCheckoutPage extends Utility {
    private static final Logger log = LogManager.getLogger(OnePageCheckoutPage.class.getName());
    public OnePageCheckoutPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "BillingNewAddress_FirstName")
    WebElement firstNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_CountryId")
    WebElement country;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_StateProvinceId")
    WebElement state;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_City")
    WebElement city;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_Address1")
    WebElement address;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_ZipPostalCode")
    WebElement zipCodeField;
    @CacheLookup
    @FindBy(id = "BillingNewAddress_PhoneNumber")
    WebElement phoneNumberField;
    @CacheLookup
    @FindBy(xpath = "//div[@id='billing-buttons-container']/button[4]")
    WebElement clickContinue;
    @CacheLookup
    @FindBy(id = "shippingoption_1")
    WebElement clickRadioButton;
    @CacheLookup
    @FindBy(id = "shippingoption_2")
    WebElement clickRadioButton1;
    @CacheLookup
    @FindBy(xpath = "//div[@id='shipping-method-buttons-container']/button")
    WebElement clickContinue1;
    @CacheLookup
    @FindBy(xpath = "//input[@id='paymentmethod_1']")
    WebElement radioClick;

    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-method-buttons-container']/button")
    WebElement click;
    @CacheLookup
    @FindBy(id = "CreditCardType")
    WebElement selectCard;
    @CacheLookup
    @FindBy(id = "CardholderName")
    WebElement cardHolder;
    @CacheLookup
    @FindBy(id = "CardNumber")
    WebElement cardNumberField;
    @CacheLookup
    @FindBy(id = "ExpireMonth")
    WebElement expiryMonthField;
    @CacheLookup
    @FindBy(id = "ExpireYear")
    WebElement expiryYearField;
    @CacheLookup
    @FindBy(id = "CardCode")
    WebElement cardCodeField;
    @CacheLookup
    @FindBy(xpath = "//div[@id='payment-info-buttons-container']/button")
    WebElement clickContinue2;
    @CacheLookup
    @FindBy(xpath = "//div[@class='payment-method-info']/ul/li")
    WebElement creditCardText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='shipping-method-info']/ul/li")
    WebElement nextDayAirText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='shipping-method-info']/ul/li")
    WebElement secondDayAirText;
    @CacheLookup
    @FindBy(xpath = "//tr[@class ='order-total']/td[2]/span//strong")
    WebElement totalPriceText;
    @CacheLookup
    @FindBy(xpath = "//div[@id='confirm-order-buttons-container']//button")
    WebElement clickConfirm;
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Thank you']")
    WebElement thankYouText;
    @CacheLookup
    @FindBy(xpath = "//strong[text()='Your order has been successfully processed!']")
    WebElement successfullyText;
    @CacheLookup
    @FindBy(xpath = "//button[@class='button-1 order-completed-continue-button']")
    WebElement continue1;

    //************************************************2.22 Fill the all mandatory field*************************************************//
    //Enter FirstName
    public void enterFirstName(String firstName){
        sendTextToElement(firstNameField,firstName+getRandomString(2));
        log.info("Enter Firstname " + firstName+ " to Firstname field " + firstNameField.toString());
    }

    //Enter LastName
    public void enterLastName(String lastName){
        sendTextToElement(lastNameField,lastName+getRandomString(2));
        log.info("Enter LastName " + lastName+ " to LastName field " + lastNameField.toString());
    }

    //Enter Email
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
        log.info("Enter Email " + email+ " to Email field " + emailField.toString());

    }

    //Select country
    public void selectCountry(String countryName){
        selectByVisibleTextFromDropDown(country,countryName);
        log.info("Select country " + country.toString());
    }
    //Select State
    public void selectState(String stateName){
        selectByVisibleTextFromDropDown(state,stateName);
        log.info("Select State " + state.toString());
    }

    //Enter City
    public void selectCity(String cityName){
        sendTextToElement(city,cityName);
        log.info("Enter City" + city.toString());
    }

    //Enter Address 1
    public void enterAddressLine1(String addressLine){
        sendTextToElement(address,addressLine);
        log.info("Enter Address Line 1" + address.toString());
    }

    //Enter Zip code
    public void enterZipCode(String zipCode){
        sendTextToElement(zipCodeField,zipCode);
        log.info("Enter Zip code " + zipCodeField.toString());
    }

    //Enter PhoneNumber
    public void enterPhoneNumber(String phoneNumber){
        sendTextToElement(phoneNumberField,phoneNumber);
        log.info("Enter PhoneNumber" + phoneNumberField.toString());

    }

    //2.23 Click on “CONTINUE”
    public void clickOnContinueButton1(){
        clickOnElement(clickContinue);
        log.info("Click on “CONTINUE”" + clickContinue.toString());
    }

    //2.24 Click on Radio Button “Next Day Air($0.00)”
    public void clickOnNextDayAirRadioButton(){
        clickOnElement(clickRadioButton);
        log.info("Click on Radio Button “Next Day Air($0.00)”" + clickRadioButton.toString());
    }

    //2.29 Click on Radio Button “2nd Day Air ($0.00)”
    public void clickOn2ndDayAirRadioButton(){
        clickOnElement(clickRadioButton1);
        log.info("Click on Radio Button “2nd Day Air ($0.00)”" + clickRadioButton1.toString());
    }

    //2.25 Click on “CONTINUE”
    public void clickOnContinueButton2(){
        clickOnElement(clickContinue1);
        log.info("Click on “CONTINUE”" + clickContinue1.toString());
    }

    //2.26 Select Radio Button “Credit Card”
    public void clickOnCreditCardRadioButton(){
        clickOnElement(radioClick);
        log.info("Select Radio Button “Credit Card”" + radioClick.toString());
    }

    //Click on “CONTINUE”
    public void clickOnContinueButton3(){
        clickOnElement(click);
        log.info("Click on “CONTINUE”" + click.toString());
    }

    //2.27 Select “Master card” From Select credit card dropdown
    public void selectCreditCardFromDropDown(String card){
        selectByVisibleTextFromDropDown(selectCard,card);
        log.info("Select “Master card” From Select credit card dropdown" + selectCard.toString());

    }
    //*********2.28 Fill all the details**************//

    //Enter CardHolder Name
    public void enterCardHolderName(String name){
        sendTextToElement(cardHolder,name+getRandomString(1));
        log.info("Enter CardHolder Name" +name+ " to CardHolder name field " +cardHolder.toString());
    }

    //Enter card number
    public void enterCardNumber(String cardNumber){
        sendTextToElement(cardNumberField,cardNumber);
        log.info("Enter Card Number" +cardNumber+ " to Card Number field " + cardNumberField.toString());
    }

    //Select Expiry month
    public void selectExpiryMonthOfCard(String month){
        selectByVisibleTextFromDropDown(expiryMonthField,month);
        log.info("Select Expiry Month" + expiryMonthField.toString());
    }

    //Select Expiry Year
    public void selectExpiryYearOfCard(String year){
        selectByVisibleTextFromDropDown(expiryYearField,year);
        log.info("Select Expiry Year" + expiryYearField.toString());
    }

    //Enter Card code
    public void enterCardCode(String code){
        sendTextToElement(cardCodeField,code);
        log.info("Enter Card coder" +code+ "to card code field" +  cardCodeField.toString());
    }

    //2.29 Click on “CONTINUE”
    public void clickOnContinueButton4(){
        clickOnElement(clickContinue2);
        log.info("Click on “CONTINUE”" +  clickContinue2.toString());
    }

    //2.30 Verify “Payment Method” is “Credit Card”
    public String getPaymentMethodIsCreditCard(){
        log.info("Verify “Payment Method” is “Credit Card”" +  creditCardText.toString());
        return getTextFromElement(creditCardText);
    }

    //2.32 Verify “Shipping Method” is “Next Day Air”
    public String getShoppingMethodIsNextDayAir(){
        log.info(" Verify “Shipping Method” is “Next Day Air”" + nextDayAirText.toString());
        return getTextFromElement(nextDayAirText);
    }

    //2.36 Verify “Shipping Method” is “2nd Day Air”
    public String getShoppingMethodIs2ndDayAir(){
        log.info(" Verify “Shipping Method” is “2nd Day Air”" + secondDayAirText.toString());
        return getTextFromElement(secondDayAirText);
    }

    //2.33 Verify Total is “$2,950.00”
    public String getTotalPriceOfProduct(){
        log.info("  Verify Total is “$2,950.00”" + secondDayAirText.toString());
        return getTextFromElement(totalPriceText);
    }

    //2.34 Click on “CONFIRM”
    public void clickOnConfirm(){
        clickOnElement(clickConfirm);
        log.info("Click on “CONFIRM”" +clickConfirm.toString());
    }

    //2.35 Verify the Text “Thank You”
    public String getThankYouText(){
        log.info("Verify the Text “Thank You”" + thankYouText.toString());
        return getTextFromElement(thankYouText);
    }

    //2.36 Verify the message “Your order has been successfully processed!”
    public String getOrderSuccessfullyProcessed(){
        log.info("Verify the message “Your order has been successfully processed!”" + successfullyText.toString());
        return getTextFromElement(successfullyText);
    }

    //2.37 Click on “CONTINUE”
    public void clickOnContinueButton(){
        clickOnElement(continue1);
        log.info("Click on “CONTINUE”" +continue1.toString());
    }
}
