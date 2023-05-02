package com.tutorialsninja.pages;

import com.tutorialsninja.Utilities.Utility;
import org.openqa.selenium.By;

public class ComponentsPage extends Utility {
    By componentsText = By.xpath("//h2[normalize-space()='Components']");

    public String getVerifyComponentsText(){
        return getTextFromElement(componentsText);
    }

}
