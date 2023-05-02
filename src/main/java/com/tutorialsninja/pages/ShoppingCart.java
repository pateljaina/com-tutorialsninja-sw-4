package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;

public class ShoppingCart extends Utility {
    By titleShoppingCart = By.xpath("//h1[contains(text(),' (1.00kg)')]");
    By productNameTextHP = By.xpath("//body[1]/div[2]/div[1]/div[1]/form[1]/div[1]/table[1]/tbody[1]/tr[1]/td[2]/a[1]");
    By date = By.xpath("//small[contains(text(),'Delivery Date:2022-11-30')]");
    By modelHP = By.xpath("//td[contains(text(),'Product 21')]");
    By totalPriceHP = By.xpath("//body[1]/div[2]/div[1]/div[1]/div[2]/div[1]/table[1]/tbody[1]/tr[4]/td[2]");

    By shoppingCartTextMacbook = By.xpath("//h1[contains(text(),'Shopping Cart')]");
    By productNameMacbook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[2]/a");
    By quantityInputField = By.xpath("//input[contains(@name, 'quantity')]");
    By updateCartMacbook = By.xpath("//button[contains(@data-original-title, 'Update')]");
    By updateSuccessMacbook = By.xpath("//div[@id='checkout-cart']/div[1]");
    By priceMacbook = By.xpath("//div[@class = 'table-responsive']/table/tbody/tr/td[6]");
    By checkoutButton = By.linkText("Checkout");

    public String verifyShoppingCartText() {
        return getTextFromElement(titleShoppingCart);
    }

    public String verifyHPProductNameTextHP() {
        return getTextFromElement(productNameTextHP);
    }

    public String verifyDeliveryDateHP() {
        return getTextFromElement(date);
    }

    public String verifyModelNameHP() {
        return getTextFromElement(modelHP);
    }

    public String verifyPriceHP() {
        return getTextFromElement(totalPriceHP);
    }

    public String verifyShoppingCartTextMacbook() {
        return getTextFromElement(shoppingCartTextMacbook);
    }

    public String verifyProductNameMacbook() {
        return getTextFromElement(productNameMacbook);
    }

    public String verifyModifySuccessMessage() {
        return getTextFromElement(updateSuccessMacbook);
    }

    public String verifyMacbookTotalPrice() {
        return getTextFromElement(priceMacbook);
    }

    public void clearQuantityField() {
        driver.findElement(quantityInputField).clear();
    }

    public void changeQuantityTo2() {
        sendTextToElement(quantityInputField, "2");
    }

    public void clickOnUpdateTab() {
        clickOnElement(updateCartMacbook);
    }

    public void clickOnCheckoutButton() {
        clickOnElement(checkoutButton);
    }


}
