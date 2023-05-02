package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class DesktopsPage extends Utility {

    By desktopsText = By.xpath("//h2[text()='Desktops']");
    By sortOption = By.id("input-sort");
    By hplp3065Link = By.linkText("HP LP3065");
    By hplp3065PageText = By.xpath("//h1[contains(text(),'HP LP3065')]");
    By currencyDropDown = By.xpath("//i[@class='fa fa-caret-down']");
    By poundSterlingOption = By.xpath("//button[normalize-space()='£Pound Sterling']");
    By quantityField = By.xpath("//input[@id='input-quantity']");
    By addToCartButtonHP = By.xpath("//button[@id='button-cart']");
    By successMessageHP = By.xpath("//div[text()='Success: You have added ']");
    By shoppingCartbutton = By.xpath("//a[contains(text(),'shopping cart')]");



    public String getVerifyDesktopsText() {
        return getTextFromElement(desktopsText);
    }

    public String getVerifyHPLP3065Text() {
        return getTextFromElement(hplp3065PageText);
    }

    public String getVerifySuccessMessage() {
        return getTextFromElement(successMessageHP);
    }

    public void sortOptionZtoA() {
        selectByVisibleTextFromDropDown(sortOption, "Model (Z - A)");
    }

    public void sortOptionAtoZ() {
        selectByVisibleTextFromDropDown(sortOption, "Model (A - Z)");
    }

    public void selectCurrencyPounds() {
        clickOnElement(currencyDropDown);
    }

    public void clickOnPoundSterlingOption() {
        clickOnElement(poundSterlingOption);
    }

    public void selectHPLP3065() {
        clickOnElement(hplp3065Link);
    }

    public void clickOnQuantityField() {
        clickOnElement(quantityField);
    }

    public void changeQuantity() {
        sendTextToElement(quantityField, "1");
    }

    public void clickAddToCartButtonHP() {
        clickOnElement(addToCartButtonHP);
    }
public void clickOnLinkShoppingCart(){
        clickOnElement(shoppingCartbutton);
}

    public void selectRequiredDateFormCalendar(String year, String month, String date) {
        clickOnElement(By.xpath("//div[@class = 'input-group date']//button"));
        while (true) {
            String monthAndYear = driver.findElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='picker-switch']")).getText();
            String[] arr = monthAndYear.split(" ");
            String mon = arr[0];
            String yer = arr[1];
            if (mon.equalsIgnoreCase(month) && yer.equalsIgnoreCase(year)) {
                break;
            } else {
                clickOnElement(By.xpath("//div[@class = 'datepicker']/div[1]//th[@class='next']"));
            }
        }
        List<WebElement> allDates = driver.findElements(By.xpath("//div[@class = 'datepicker']/div[1]//tbody/tr/td[@class = 'day']"));
        for (WebElement e : allDates) {
            if (e.getText().equalsIgnoreCase(date)) {
                e.click();
                break;
            }
        }
    }


}
