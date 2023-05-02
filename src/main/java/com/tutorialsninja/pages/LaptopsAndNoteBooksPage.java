package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;

public class LaptopsAndNoteBooksPage extends Utility {


    By laptopsAndNotebooksText = By.xpath("//h2[normalize-space()='Laptops & Notebooks']");
    By sortOption = By.id("input-sort");
    By macBookProduct = By.linkText("MacBook");
    By macBookText = By.xpath("//h1[contains(text(),'MacBook')]");
    By macBookAddToCartButton = By.xpath("//button[@id='button-cart']");

    By shoppingCartLink = By.xpath("//a[contains(text(),'shopping cart')]");

    By macBookSuccessMessage = By.xpath("//div[@class='alert alert-success alert-dismissible'][contains(.,'Success: You have added MacBook to your shopping cart!')][1]");

    public String getVerifyLaptopsAndNotebooksText() {
        return getTextFromElement(laptopsAndNotebooksText);
    }

    public String getVerifyMacBookText() {
        return getTextFromElement(macBookText);
    }

    public String getMacbookAddedToCartSuccessfully() {
        return getTextFromElement(macBookSuccessMessage);
    }

    public void sortOptionPriceHighToLow() {
        selectByVisibleTextFromDropDown(sortOption, "Price (High > Low)");
    }

    public void clickOnProductMacBook() {
        clickOnElement(macBookProduct);
    }

    public void clickOnMacBookAddToCartButton() {
        clickOnElement(macBookAddToCartButton);
    }

    public void clickOnShoppingCartSuccess() {
        clickOnElement(shoppingCartLink);
    }

}
