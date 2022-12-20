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

public class CellPhonesPage extends Utility {
    private static final Logger log = LogManager.getLogger(CellPhonesPage.class.getName());
    public CellPhonesPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Cell phones']")
    WebElement cellPhoneText;

    @CacheLookup
    @FindBy(xpath = "//a[text()='List']")
    WebElement clickListview;

    @CacheLookup
    @FindBy(linkText = "Nokia Lumia 1020")
    WebElement clickNokiaLumia;

    //1.3 Verify the text “Cell phones”
    public String getCellPhoneText(){
        log.info("Verify the text “Cell phones”" +cellPhoneText.toString());
        return getTextFromElement(cellPhoneText);
    }

    //2.4 Click on List View Tab
    public void clickOnListViewTab(){
        clickOnElement(clickListview);
        log.info("Click on List View Tab" +clickListview.toString());
    }

    //2.5 Click on product name “Nokia Lumia 1020” link
    public void clickOnNokiaLumia1020CellPhone() {
        mouseHoverToElementAndClick(clickNokiaLumia);
        log.info("Click on product name “Nokia Lumia 1020” link" +clickNokiaLumia.toString());
    }
}
