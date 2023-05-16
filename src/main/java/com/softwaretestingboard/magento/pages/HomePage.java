package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage extends Utility {
    private static final Logger log = LogManager.getLogger(HomePage.class.getName());

    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//span[normalize-space()='Women']")
    WebElement womenMenu;
    @FindBy(id = "ui-id-5")
    WebElement menMenu;
    @FindBy(xpath = "//ul[@class='ui-menu ui-widget ui-widget-content ui-corner-all']/li[4]")
    WebElement gearMenu;
    @FindBy(xpath = "//a[@id='ui-id-9']")
    WebElement womenTopMenu;
    @FindBy(id = "ui-id-11")
    WebElement womenJacketMenu;
    @FindBy(id = "ui-id-18")
    WebElement menBottomMenu;
    @FindBy(linkText = "Pants")
    WebElement menPantsMenu;
    @FindBy(xpath = "//span[normalize-space()='Bags']")
    WebElement gearBagMenu;

    public void hoverMouseOnWomenMenu(){
        mouseHoverToElement(womenMenu);
        log.info("Mouse hover on women menu : " + womenMenu.toString());
    }

    public void mouseHoverOnWomenTopMenu() {
        mouseHoverToElement(womenTopMenu);
        log.info("Mouse hover on women top menu : " + womenTopMenu.toString());
    }

    public void clickOnWomenJacketMenu() {
        clickOnElement(womenJacketMenu);
        log.info("Click on women jacket menu : " + womenJacketMenu.toString());
    }

    public void hoverMouseOnMenMenu() {
        mouseHoverToElement(menMenu);
        log.info("Mouse hover on men menu : " + menMenu.toString());
    }

    public void hoverMouseOnMenBottom() {
        mouseHoverToElement(menBottomMenu);
        log.info("Mouse hover on men bottom menu : " + menBottomMenu.toString());
    }

    public void clickOnMenPantsMenu() {
        clickOnElement(menPantsMenu);
        log.info("Click on : " + menPantsMenu.toString());
    }

    public void hoverMouseOnGearMenu() {
        mouseHoverToElement(gearMenu);
        log.info("Mouse hover on gear menu : " + gearMenu.toString());
    }

    public void clickOnBagMenu() {
        clickOnElement(gearBagMenu);
        log.info("Click on bag menu : " + gearBagMenu.toString());
    }
}
