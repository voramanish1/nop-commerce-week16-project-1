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

public class BuildYourOwnComputerProductPage extends Utility {
    private static final Logger log = LogManager.getLogger(BuildYourOwnComputerProductPage.class.getName());
    public BuildYourOwnComputerProductPage(){
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//h1[contains(text(),'Build your own computer')]")
    WebElement computerText;

    @CacheLookup
    @FindBy(id = "product_attribute_1")
    WebElement processor;

    @CacheLookup
    @FindBy(xpath = "//select[@id='product_attribute_2']")
    WebElement selectRAMField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_3_7']")
    WebElement selectHDDButton;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_4_9']")
    WebElement selectOSField;

    @CacheLookup
    @FindBy(xpath = "//input[@id='product_attribute_5_12']")
    WebElement selectCheckBoxField;

    @CacheLookup
    @FindBy(xpath = "//span[text()='$1,475.00']")
    WebElement price;

    @CacheLookup
    @FindBy(xpath = "//button[@id='add-to-cart-button-1']")
    WebElement clickButton;

    @CacheLookup
    @FindBy(xpath = "//div[@class='bar-notification success']")
    WebElement textMessage;

    @CacheLookup
    @FindBy(xpath = "//body/div[@id='bar-notification']/div[1]/span[1]")
    WebElement closeMessage;

    @CacheLookup
    @FindBy(xpath = "//span[contains(text(),'Shopping cart')]")
    WebElement hoverCart;

    @CacheLookup
    @FindBy(xpath = "//button[contains(text(),'Go to cart')]")
    WebElement clickCart;



    //*****************************Build Your Own Computer Product**********************************************//
    //2.5 Verify the Text "Build your own computer"
    public String getBuildYourComputerText(){
        log.info("Verify the Text 'Build your own computer'" +computerText.toString());
        return getTextFromElement(computerText);
    }

    //2.6 Select "2.2 GHz Intel Pentium Dual-Core E2200" using Select class
    public void selectProcessor(String text){
        selectByVisibleTextFromDropDown(processor,text);
        log.info("Select" +text+ "processor" +processor.toString());
    }

    //2.7.Select "8GB [+$60.00]" using Select class.
    public void selectRAM(String text){
        selectByVisibleTextFromDropDown(selectRAMField,text);
        log.info("Select "+text+ " RAM" +selectRAMField.toString());
    }

    //2.8 Select HDD radio "400 GB [+$100.00]"
    public void selectHDDRadioButton(String hdd){
        clickOnElement(selectHDDButton);
        log.info("Select "+hdd +selectHDDButton.toString());
    }

    //2.9 Select OS radio "Vista Premium [+$60.00]"
    public void selectOSVistaPremium(String os){
        clickOnElement(selectOSField);
        log.info("Select OS "+ os +selectOSField.toString());
    }

    //2.10 Check Two Check boxes "Microsoft Office [+$50.00]" and "Total Commander [+$5.00]"
    public void selectTwoCheckBox(){
        clickOnElement(selectCheckBoxField);
        log.info("Check Two Check boxes 'Microsoft Office [+$50.00]' and 'Total Commander [+$5.00]'" +selectCheckBoxField.toString());
    }

    //2.11 Verify the price "$1,475.00"
    public String getTotal(){
        log.info("Verify the price '$1,475.00'" +price.toString());
        return getTextFromElement(price);
    }

    //2.12 Click on "ADD TO CARD" Button.
    public void clickOnAddToCart(){
        clickOnElement(clickButton);
        log.info("Click on 'ADD TO CARD' Button" +clickButton.toString());
    }

    //2.13 Verify the Message "The product has been added to your shopping cart" on Top green Bar
    public String getProductAddedMessage(){
        log.info("Verify the Message 'The product has been added to your shopping cart' on Top green Bar" +textMessage.toString());
        return getTextFromElement(textMessage);
    }

    //2.13 After on green bar Close the bar clicking on the cross button.
    public void clickOnCrossButtonOnGreenBar(){
        clickOnElement(closeMessage);
        log.info("On green bar Close the bar clicking on the cross button." +closeMessage.toString());
    }

    //2.14 Then MouseHover on "Shopping cart" and Click on "GO TO CART" button.
    public void mouseHoverOnShoppingCart(){
        mouseHoverToElement(hoverCart);
        log.info("Then MouseHover on \"Shopping cart\" and Click on \"GO TO CART\" button." +hoverCart.toString());
    }

    //2.14 Click on "GO TO CART" button.
    public void clickOnGoToCart(){
        clickOnElement(clickCart);
        log.info("Click on \"GO TO CART\" button." +clickCart.toString());
    }
}
