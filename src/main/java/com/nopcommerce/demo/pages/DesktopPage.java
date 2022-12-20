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

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DesktopPage extends Utility {
    private static final Logger log = LogManager.getLogger(DesktopPage.class.getName());
    public DesktopPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(id = "products-orderby")
    WebElement selectSorted;

    @CacheLookup
    @FindBy(xpath = "//h2[@class='product-title']")
    List<WebElement> productsList1;

    @CacheLookup
    @FindBy(xpath = "//div[@data-productid='1']/div[2]/div[3]/div[2]/button[1]")
    WebElement clickComputer;

    //1.3 Select Sort By position "Name: Z to A"
    public void selectSortedPosition(String text) {
        clickOnElement(selectSorted);
        selectByVisibleTextFromDropDown(selectSorted, text);
        log.info("Select Sort By position \"Name: Z to A\"" +selectSorted.toString());

    }
    public ArrayList expectedList() {

        // Get all the products name and stored into array list
        List<WebElement> products = productsList1;
        ArrayList<String> originalProductsName = new ArrayList<>();
        for (WebElement e : products) {
            originalProductsName.add(e.getText());
        }
        // Sort By Reverse order
        // Collections.reverse(originalProductsName);
        return originalProductsName;
    }

    public ArrayList getSortedProductList() {
        // Get all the products name and stored into array list
        Collections.reverse(expectedList());
        List<WebElement> products = productsList1;


        ArrayList<String> afterSortByZToAProductsName = new ArrayList<>();
        for (WebElement e : products) {
            afterSortByZToAProductsName.add(e.getText());
        }
        return afterSortByZToAProductsName;
    }

    //Click on add to cart of product "Build your own computer"
    public void clickOnAddToCartOfBuildYourOwnComputer(){
        mouseHoverToElementAndClick(clickComputer);
        log.info("Click on add to cart of product \"Build your own computer\"" +clickComputer.toString());
    }
}
