package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;

public class HomePage extends Utility {
    By deskTopTab = By.xpath("//a[text()='Desktops']");
    By laptopsAndNotebooksTab = By.xpath("//a[normalize-space()='Laptops & Notebooks']");
    By componentsTab = By.xpath("//a[normalize-space()='Components']");


    public void mouseHoverAndClickDesktopTab(){
        mouseHoverToElementAndClick(deskTopTab);
    }
    public void mouseHoverAndClickLaptopsAndNotebooksTab(){
        mouseHoverToElementAndClick(laptopsAndNotebooksTab);
    }
    public void mouseHoverAndClickComponents(){
        mouseHoverToElementAndClick(componentsTab);
    }
    public void selectAllDesktopsMenu() {
        clickOnElement(By.linkText("Show AllDesktops"));
    }
    public void selectShowAllLaptopsAndNotebooks(){
        clickOnElement(By.linkText("Show AllLaptops & Notebooks"));
    }
    public void selectShowAllComponents(){
        clickOnElement(By.linkText("Show AllComponents"));
    }
}
