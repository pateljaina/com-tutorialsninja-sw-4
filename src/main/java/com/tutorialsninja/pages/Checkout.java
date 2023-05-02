package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;

public class Checkout extends Utility {
    By checkoutTitle = By.xpath("//h1[normalize-space()='Checkout']");
    By newCustomerText = By.xpath("//h2[normalize-space()='New Customer']");
    By radioGuestCheckout = By.xpath("//input[@value='guest']");
    By continueTab = By.id("button-account");

    By firstNameField = By.id("input-payment-firstname");
    By lastNameField = By.id("input-payment-lastname");
    By emailField = By.id("input-payment-email");
    By phoneNumber = By.id("input-payment-telephone");
    By address1Field = By.id("input-payment-address-1");
    By cityField = By.id("input-payment-city");

    By zipPostalCode = By.id("input-payment-postcode");
    By country = By.id("input-payment-country");

    By region = By.id("input-payment-zone");

    By continueButton = By.id("button-guest");
    By notesArea = By.xpath("textarea[name='comment']");
    By checkboxAgree = By.xpath("//input[@name='agree']");

    By continuePaymentMethodButton = By.id("button-payment-method");

    By warningMessage = By.xpath("//div[@class='alert alert-danger alert-dismissible']");


    public String verifyCheckOutTitle() {
        return getTextFromElement(checkoutTitle);
    }

    public String verifyNewCustomer() {
        return getTextFromElement(newCustomerText);
    }

    public String verifyWarningMessage() {
        return getTextFromElement(warningMessage);
    }

    public void clickOnGuestCheckoutRadioButton() {
        clickOnElement(radioGuestCheckout);
    }

    public void clickOnContinueTab() {
        clickOnElement(continueTab);
    }

    public void enterFirstName(String firstname) {
        sendTextToElement(firstNameField, firstname);
    }

    public void enterLastName(String lastName) {
        sendTextToElement(lastNameField, lastName);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterPhoneNumber(String phoneNo) {
        sendTextToElement(phoneNumber, phoneNo);
    }

    public void enterAddress1(String address1) {
        sendTextToElement(address1Field, address1);
    }

    public void enterCity(String cityName) {
        sendTextToElement(cityField, cityName);
    }

    public void enterZipPostalCode(String postCode) {
        sendTextToElement(zipPostalCode, postCode);
    }

    public void enterNotesInComments(String comment) {
        sendTextToElement(notesArea, comment);
    }

    public void selectCountry() {
        selectByVisibleTextFromDropDown(country, "United Kingdom");
    }

    public void selectRegion() {
        selectByVisibleTextFromDropDown(region, "Greater London");
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnTermsAndConditionsCheckBox() {
        clickOnElement(checkboxAgree);
    }

    public void clickOnContinuePaymentMethodButton() {
        clickOnElement(continuePaymentMethodButton);
    }


}
