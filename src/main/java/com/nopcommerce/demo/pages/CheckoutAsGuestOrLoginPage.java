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

public class CheckoutAsGuestOrLoginPage extends Utility {
    private static final Logger log = LogManager.getLogger(CheckoutAsGuestOrLoginPage.class.getName());
    public CheckoutAsGuestOrLoginPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Welcome, Please Sign In!')]")
    WebElement welcomeText;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Checkout as Guest')]")
    WebElement clickCheckout;
    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Register')]")
    WebElement clickRegister;

    //2.20 Verify the Text “Welcome, Please Sign In!”
    public String getWelcomePleaseSignInText(){
        log.info("Verify the Text “Welcome, Please Sign In!”" +welcomeText.toString());
        return getTextFromElement(welcomeText);

    }

    //2.21 Click on “CHECKOUT AS GUEST” Tab
    public void clickOnCheckoutAsGuest(){
        clickOnElement(clickCheckout);
        log.info("Click on “CHECKOUT AS GUEST” Tab" +clickCheckout.toString());
    }


    //2.18 Click on “Register” Tab
    public void clickOnRegisterTab(){
        clickOnElement(clickRegister);
        log.info("Click on “Register” Tab" +clickRegister.toString());
    }
}
