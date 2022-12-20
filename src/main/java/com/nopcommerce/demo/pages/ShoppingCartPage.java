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

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());
    public ShoppingCartPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Shopping cart')]")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//td[@class='quantity']/input")
    WebElement quantity;
    @CacheLookup
    @FindBy(xpath = "//button[@id='updatecart']")
    WebElement clickUpdateCart;
    @CacheLookup
    @FindBy(xpath = "//td[@class= 'subtotal']/span")
    WebElement totalPrice;
    @CacheLookup
    @FindBy(xpath = "//input[@id='termsofservice']")
    WebElement clickCheckBox;

    @CacheLookup
    @FindBy(xpath = "//button[@id='checkout']")
    WebElement checkoutButton;

    @CacheLookup
    @FindBy(xpath = "//input[@class='qty-input']")
    WebElement quantityField;
//    @CacheLookup
//    @FindBy(xpath = "//td[@class='subtotal']//span[text()='$698.00']")
//    WebElement total;

   //2.15 Verify the message "Shopping cart"
    public String getShoppingCartPageText(){
        log.info("Verify the message \"Shopping cart\" is display" + shoppingCartText.toString());
        return getTextFromElement(shoppingCartText);
    }


   // 2.16 Change the Qty to "2" and Click on "Update shopping cart"
    public void changeQuantity(String text){
        sendTextToElement(quantity,text);
        log.info("Change the Qty to "+ text + quantity.toString());
    }

    //2.16and Click on "Update shopping cart"
    public void clickOnUpdateShoppingCart(){
        clickOnElement(clickUpdateCart);
        log.info("Click on 'Update shopping cart'"+ clickUpdateCart.toString());
    }

    //2.17 Verify the Total"$2,950.00"
    public String getTotalPrice(){
        log.info("Verify the Total\"$2,950.00\" is display" + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

    //2.18 click on checkbox “I agree with the terms of service”
    public void clickOnCheckBoxOfTermsAndService(){
        clickOnElement(clickCheckBox);
        log.info("Click on checkbox “I agree with the terms of service”" + clickCheckBox.toString());

    }


    //2.19 Click on “CHECKOUT
    public void clickOnCheckOutButton(){
        clickOnElement(checkoutButton);
        log.info("Click on “CHECKOUT button" + checkoutButton.toString());

    }


    //2.13 Verify the quantity is 2
    public String getQuantityDisplayedOnPage(String text){
        String text1 = getAttributeFromElement(quantityField,text);
        log.info("Verify the quantity is 2" + quantityField.toString());
        return text1;
    }

    //2.14 Verify the Total $698.00
    public String getTotalPriceOfProduct(String total){
        log.info("Verify the Total "+total + totalPrice.toString());
        return getTextFromElement(totalPrice);
    }

}
