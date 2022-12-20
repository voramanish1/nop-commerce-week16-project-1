package com.nopcommerce.demo.pages;

import com.aventstack.extentreports.Status;
import com.nopcommerce.demo.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;

import java.util.List;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());
    public HomePage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//div[@class = 'header-menu']/ul/li")
    List<WebElement> topMenuTabs;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li//a[text()='Computers ']")
    WebElement computerTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='item-grid']/div[1]/div[1]/h2/a")
    WebElement desktopLink;

    @CacheLookup
    @FindBy(xpath = "//h2[text()='Welcome to our store']")
    WebElement welcomeToOurStoreText;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/a")
    WebElement electronicTab;

    @CacheLookup
    @FindBy(xpath = "//div[@class='header-menu']/ul[1]/li[2]/ul/li[2]/a[1]")
    WebElement cellPhoneLink;

    @CacheLookup
    @FindBy(css = "div.page-title")
    WebElement pageTitle;

    @CacheLookup
    @FindBy(linkText = "Log out")
    WebElement clickLogOut;

    //1.2 This method should click on the menu whatever name is passed as parameter.
    public void selectMenu(String menu) {

         List<WebElement> topMenuList = topMenuTabs;
         try{
            for (WebElement element : topMenuList ) {
                if (element.getText().equalsIgnoreCase(menu)) {
                    element.click();
                }
            }
        }catch(StaleElementReferenceException e){
             topMenuList = topMenuTabs;
        }
        log.info("Click on the menu whatever name is passed as parameter" + topMenuTabs.toString());
    }

    //********************Computer**********************************//
    //1.1 Click on Computer Menu.
    public void clickOnComputerTab() {
        mouseHoverToElementAndClick(computerTab);
        log.info("Click on Computer Menu Tab" +computerTab.toString());
    }

    //1.2 Click on Desktop
    public void clickOnDesktopTab() {
        mouseHoverToElementAndClick(desktopLink);
        log.info("Click on Desktop" +desktopLink.toString());
    }
    //2.37 Verify the text “Welcome to our store”
    public String getWelcomeToOurStoreText(){
        log.info("Verify the text “Welcome to our store”" +welcomeToOurStoreText.toString());
        return getTextFromElement(welcomeToOurStoreText);
    }

    //********************Electronics**********************************//

    //1.1 Mouse Hover on “Electronics” Tab
    public void mouseHoverToElectronicTab() {
        mouseHoverToElement(electronicTab);
        log.info("Mouse Hover on “Electronics” Tab" +electronicTab.toString());
    }

    //1.2 Mouse Hover on “Cell phones” and click
    public void mouseHoverToCellPhoneLinkAndClick() {
        mouseHoverToElementAndClick(cellPhoneLink);
        log.info("Mouse Hover on “Cell phones” and click" +cellPhoneLink.toString());
    }

    //Verify page navigate to each tab whatever passed
    public String getTitleOfPage(){
        log.info("Verify page navigate to each tab whatever passed" +pageTitle.toString());
        return getTextFromElement(pageTitle);
    }
    //2.43 Click on “Logout” link
    public void clickOnLogOutLink(){
        clickOnElement(clickLogOut);
        log.info("Click on “Logout” link" +clickLogOut.toString());
    }
}
