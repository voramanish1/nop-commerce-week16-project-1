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

public class RegisterPage extends Utility {
    private static final Logger log = LogManager.getLogger(RegisterPage.class.getName());
    public RegisterPage(){
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//h1[text()='Register']")
    WebElement registerText;
    @CacheLookup
    @FindBy(id = "FirstName")
    WebElement firstNameField ;
    @CacheLookup
    @FindBy(id = "LastName")
    WebElement lastNameField;
    @CacheLookup
    @FindBy(name = "DateOfBirthDay")
    WebElement dateField;
    @CacheLookup
    @FindBy(name = "DateOfBirthMonth")
    WebElement monthField;
    @CacheLookup
    @FindBy(name = "DateOfBirthYear")
    WebElement yearField;
    @CacheLookup
    @FindBy(id = "Email")
    WebElement emailField;
    @CacheLookup
    @FindBy(id = "Password")
    WebElement passwordField;
    @CacheLookup
    @FindBy(id = "ConfirmPassword")
    WebElement confirmPasswordField;
    @CacheLookup
    @FindBy(id = "register-button")
    WebElement clickRegister;
    @CacheLookup
    @FindBy(xpath = "//div[contains(text(),'Your registration completed')]")
    WebElement registrationCompleteText;
    @CacheLookup
    @FindBy(xpath = "//a[contains(text(),'Continue')]")
    WebElement clickContinue;

    //2.19 Verify the text “Register”
    public String getRegisterText(){
        log.info("Verify the text “Register”" +  registerText.toString());
        return getTextFromElement(registerText);
    }
    //*************************************************************2.20 Fill the mandatory fields for Register*************************************//

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

    //Select Date
    public void selectDateOfBirth(String date){
        selectByVisibleTextFromDropDown(dateField,date);
        log.info("Select Date" +date + " from date field " + dateField.toString());

    }

    //Select month
    public void selectMonthOfBirth(String month){
        selectByVisibleTextFromDropDown(monthField,month);
        log.info("Select Month" +month + " from Month field " + monthField.toString());

    }

    //Select Year
    public void selectYearOfBirth(String year){
        selectByVisibleTextFromDropDown(yearField,year);
        log.info("Select Year" +year+ " from Year field " + yearField.toString());

    }

    //Enter Email
    public void enterEmail(String email){
        sendTextToElement(emailField,email);
        log.info("Enter Email " +email+ " to Email field " + emailField.toString());
    }

    //Enter Password
    public void enterPassword(String password){
        sendTextToElement(passwordField,password);
        log.info("Enter Password " +password+ " to Password field " +passwordField.toString());

    }

    //Enter Confirm Password
    public void enterConfirmPassword(String confirmPassword){
        sendTextToElement(confirmPasswordField,confirmPassword);
        log.info("Enter Confirm Password " +confirmPassword+ " to Password field " +confirmPasswordField.toString());
    }

    //2.21 Click on “REGISTER” Button
    public void clickOnRegister(){
        clickOnElement(clickRegister);
        log.info("Click on “REGISTER” Button " +clickRegister.toString());
    }

    //2.22 Verify the message “Your registration completed”
    public String getRegistrationCompleted(){
        log.info(" Verify the message “Your registration completed” is display " +registrationCompleteText.toString());
        return getTextFromElement(registrationCompleteText);
    }

    //2.23 Click on “CONTINUE” tab
    public void clickOnContinueButton(){
        try {
            Thread.sleep(500);
            mouseHoverToElementAndClick(clickContinue);
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        log.info("Click on “CONTINUE” tab " +clickContinue.toString());
    }





}
