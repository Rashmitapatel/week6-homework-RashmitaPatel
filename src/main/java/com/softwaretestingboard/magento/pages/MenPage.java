package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MenPage extends Utility {
    private static final Logger log = LogManager.getLogger(MenPage.class.getName());

    public MenPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectFromDropDown;
    @CacheLookup
    @FindBy(xpath = "//strong[@class='product name product-item-name']//a[@class='product-item-link']")
    WebElement cronusYogaPant;

    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-size-143-item-175']")
    WebElement CronusPant32;
    @CacheLookup
    @FindBy(xpath = "//div[@class='swatch-opt-880']//div[@id='option-label-color-93-item-49']")
    WebElement CronusBlackColour;
    @CacheLookup
    @FindBy(xpath = "//form[@action='https://magento.softwaretestingboard.com/checkout/cart/add/uenc/aHR0cHM6Ly9tYWdlbnRvLnNvZnR3YXJldGVzdGluZ2JvYXJkLmNvbS9tZW4vYm90dG9tcy1tZW4vcGFudHMtbWVuLmh0bWw_cHJvZHVjdF9saXN0X29yZGVyPW5hbWU%2C/product/880/']//button[@class='action tocart primary']")
    WebElement buttonAddToCart;
    @CacheLookup
    @FindBy(xpath = "//div[@data-product-id='880']")
    WebElement productName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='page messages']//a[contains(text(),'shopping cart')]")
    WebElement shoppingCart;
    @CacheLookup
    @FindBy(xpath = "//select[@id='sorter']")
    WebElement selectByProductName;
    @CacheLookup
    @FindBy(xpath = "//div[@class='message-success success message']")
    WebElement successMessage;
    public void clickOnShoppingCartLink(){
        clickOnElement(shoppingCart);
        log.info("Clicking on shopping cart link : " + shoppingCart.toString());
    }

    public void sortByProductName() {
        selectByVisibleTextFromDropDown(selectByProductName, "Product Name");
        log.info("Select from : " + selectByProductName.toString());
    }

    public void clickOnCronousSize32() throws InterruptedException {
        Thread.sleep(500);
        clickOnElement(CronusPant32);
        log.info("Clicking on cronos pant size 32 : " + CronusPant32.toString());
    }
    public void clickOnCronousBlack() {
        clickOnElement(CronusBlackColour);
        log.info("Clicking on Cronos pant black colour : " + CronusBlackColour.toString());
    }

    public void mouseHoverOnCronusYogaAndClickAddCart() {
        mouseHoverToElement(productName);
        clickOnElement(buttonAddToCart);
        log.info("Clicking on add to cart button : " + buttonAddToCart.toString());
    }

    public String getSuccessMsgText() {
        log.info("Get success message : " + successMessage.toString());
        return getTextFromElement(successMessage);
    }
}
