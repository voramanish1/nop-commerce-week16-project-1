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

public class NokiaLumia1020CellPhoneProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(NokiaLumia1020CellPhoneProductPage.class.getName());
    public NokiaLumia1020CellPhoneProductPage(){
        PageFactory.initElements(driver, this);
    }
    //*****************************Nokia Lumia 1020 Product**********************************************//
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Nokia Lumia 1020']")
    WebElement nokiaLumiaText;
    @CacheLookup
    @FindBy(xpath = "//div[@class='product-price']//span[text()=' $349.00 ']")
    WebElement price;
    @CacheLookup
    @FindBy(id = "product_enteredQuantity_20")
    WebElement editQuantity;
    @CacheLookup
    @FindBy(id = "add-to-cart-button-20")
    WebElement clickAddToCart;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]")
    WebElement productAddedText;
    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement hoverCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickCart;



    // Verify text “Nokia Lumia 1020”
    public String getNokiaLumia1020Text(){
        log.info("Verify text “Nokia Lumia 1020”" +nokiaLumiaText.toString());
        return getTextFromElement(nokiaLumiaText);
    }

    //2.7 Verify the price “$349.00”
    public String getTotal(){
        log.info("Verify the price “$349.00”" +price.toString());
        return getTextFromElement(price);
    }

    //2.8 Change quantity to 2
    public void changeTheQuantityTo(String quantity){
        sendTextToElement(editQuantity,quantity);
        log.info("Change quantity to"+quantity+" in quantity field" +editQuantity.toString());
    }

    //2.9 Click on “ADD TO CART” tab
    public void clickOnAddToCartButton(){
        mouseHoverToElementAndClick(clickAddToCart);
        log.info("Click on “ADD TO CART” tab" +clickAddToCart.toString());
    }

    //2.10 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String getProductAddedSuccessfullyText(){
        log.info("Verify the Message \"The product has been added to your shopping cart\" on Top green Bar" +productAddedText.toString());
        return getTextFromElement(productAddedText);
    }

    // 2.10 After that close the bar clicking on the cross button.
    public void clickOnCrossButtonOnGreenBar(){
        clickOnElement(closeMessage);
        log.info("Close the green bar clicking on the cross button" +closeMessage.toString());
    }

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(hoverCart);
        log.info("MouseHover on \"Shopping cart\"" +hoverCart.toString());
    }

    //2.14 Click on "GO TO CART" button.
    public void clickOnGoToCart(){
        clickOnElement(clickCart);
        log.info("Click on \"GO TO CART\" button." +clickCart.toString());
    }
}
