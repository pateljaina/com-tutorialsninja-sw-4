package com.tutorialsninja.testsuite;

import com.tutorialsninja.pages.ComponentsPage;
import com.tutorialsninja.pages.DesktopsPage;
import com.tutorialsninja.pages.HomePage;
import com.tutorialsninja.pages.LaptopsAndNoteBooksPage;
import com.tutorialsninja.testbase.BaseTest;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TopMenuTest extends BaseTest {
    HomePage homepage = new HomePage();
    DesktopsPage desktopsPage = new DesktopsPage();
    LaptopsAndNoteBooksPage laptopsAndNoteBooksPage = new LaptopsAndNoteBooksPage();
    ComponentsPage componentsPage = new ComponentsPage();

    @Test
    public void verifyUserShouldNavigateToDesktopsPageSuccessfully() {
        homepage.mouseHoverAndClickDesktopTab();
        homepage.selectAllDesktopsMenu();
        String expectedMessage = "Desktops";
        Assert.assertEquals(desktopsPage.getVerifyDesktopsText(), expectedMessage, "Not directed to Desktops Page");
    }
    @Test
    public void verifyUserShouldNavigateToLaptopsAndNotebooksPageSuccessfully() {
        homepage.mouseHoverAndClickLaptopsAndNotebooksTab();
        homepage.selectShowAllLaptopsAndNotebooks();
        String expectedMessage = "Laptops & Notebooks";
        Assert.assertEquals(laptopsAndNoteBooksPage.getVerifyLaptopsAndNotebooksText(),expectedMessage,"Not directed to Laptops and Notebooks page successfully");
    }

    @Test
    public void verifyUserShouldNavigateToComponentsPageSuccessfully() {
        homepage.mouseHoverAndClickComponents();
        homepage.selectShowAllComponents();
        String expectedMessage = "Components";
        Assert.assertEquals(componentsPage.getVerifyComponentsText(), expectedMessage,"Not directed to components page successfully");
    }





}
