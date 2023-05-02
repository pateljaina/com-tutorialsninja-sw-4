package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;

import java.util.List;

public class MyAccount extends Utility {
    By myAccount = By.xpath(" //span[contains(text(),'My Account')]");
    By registerText = By.xpath("//h1[contains(text(),'Register Account')]");
    By firstName = By.id("input-firstname");
    By lastName = By.id("input-lastname");
    By emailField = By.id("input-email");
    By telephoneField = By.id("input-telephone");
    By passwordField = By.id("input-password");
    By confirmPasswordField = By.id("input-confirm");
    By privacyCheck = (By.xpath("//div[@class = 'buttons']//input[@name='agree']"));
    By continueButton = By.xpath("//div[@class = 'buttons']//input[@value='Continue']");
    By continueButton2 = By.xpath("//a[normalize-space()='Continue']");
    By confirmMessage = By.xpath("//h1[contains(text(),'Your Account Has Been Created!')]");
    By logoutMessage = By.xpath("//div[@class='col-sm-9']/h1");
    By returningCustomerText = By.xpath("//h2[contains(text(),'Returning Customer')]");

    public void clickOnMyAccount() {
        clickOnElement(myAccount);
    }

    public void selectMyAccountOptions(String option) {
        List<WebElement> myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        try {
            for (WebElement options : myAccountList) {
                if (options.getText().equalsIgnoreCase(option)) {
                    options.click();
                }
            }
        } catch (StaleElementReferenceException e) {
            myAccountList = driver.findElements(By.xpath("//div[@id='top-links']//li[contains(@class,'open')]/ul/li"));
        }
    }

    public void enterFirstname(String firstname) {
        sendTextToElement(firstName, firstname);
    }

    public void enterLastname(String lastname) {
        sendTextToElement(lastName, lastname);
    }

    public void enterEmail(String email) {
        sendTextToElement(emailField, email);
    }

    public void enterTelephone(String phone) {
        sendTextToElement(telephoneField, phone);
    }

    public void enterPassword(String password) {
        sendTextToElement(passwordField, password);
    }

    public void enterConfirmPassword(String confirmPass) {
        sendTextToElement(confirmPasswordField, confirmPass);
    }

    public void selectRadioButton() {
        List<WebElement> radioButtons = driver.findElements(By.xpath("//fieldset[3]//input"));
        for (WebElement e : radioButtons) {
            if (e.getText().equals("Yes")) {
                e.click();
                break;
            }
        }
    }

    public void clickONPrivacyCheck() {
        clickOnElement(privacyCheck);
    }

    public void clickOnContinueButton() {
        clickOnElement(continueButton);
    }

    public void clickOnContinueButton2() {
        clickOnElement(continueButton2);
    }

    public String getRegistrationConfirmMessage() {
        return getTextFromElement(confirmMessage);
    }

    public String getLogoutMessage() {
        return getTextFromElement(logoutMessage);
    }

    public String getRegisterText() {
        return getTextFromElement(registerText);
    }

    public String getReturningCustomerText() {
        return getTextFromElement(returningCustomerText);
    }


}
