package com.softwaretestingboard.magento.pages;

import com.softwaretestingboard.magento.utility.Utility;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShoppingCartPage extends Utility {
    private static final Logger log = LogManager.getLogger(ShoppingCartPage.class.getName());

    public ShoppingCartPage() {
        PageFactory.initElements(driver, this);
    }
    @CacheLookup
    @FindBy(xpath = "(//div[@class='product-item-details'])[2]/strong/a")
    WebElement productName;

    @CacheLookup
    @FindBy(xpath = "//input[@class='input-text qty']")
    WebElement quantityField;

    @FindBy(xpath = "//span[@data-bind='text: getValue()'][normalize-space()='$135.00']")
    WebElement productPrice;
    @CacheLookup
    @FindBy(xpath = "//button[@class='action update']")
    WebElement clickOnUpdateShoppingCart;

    @FindBy(xpath = "//span[@class='cart-price']//span[@class='price'][normalize-space()='$225.00']")
    WebElement updatedPrice;

    @CacheLookup
    @FindBy(xpath = "//span[@class='base']")
    WebElement shoppingCartText;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'32')]")
    WebElement theSizeOfThePants;

    @CacheLookup
    @FindBy(xpath = "//dd[contains(text(),'Black')]")
    WebElement theColourOfThePants;

    public String verifyTheProductsName() {
        log.info("Getting product name : " + productName.toString());
        return productName.getText();
    }

    public String getQuantityOfProduct() {
        String quantity = quantityField.getAttribute("value");
        log.info("Get quantity : " + quantityField.toString());
        return quantity;
    }

    public String getPriceOfTheProduct() {
        log.info("Getting product price : " + productPrice.toString());
        return productPrice.getText();
    }

    public void changeTheQuantityOfTheBag(String qty) {
        quantityField.sendKeys(Keys.DELETE);
        log.info("Change quantity : " + quantityField.toString());
        sendTextToElement(quantityField, qty);
    }

    public void updateTheShoppingCart() {
        clickOnElement(clickOnUpdateShoppingCart);
        log.info("Clicking on update shopping cart : " + clickOnUpdateShoppingCart.toString());
    }

    public String UpdatedProductPrice() throws InterruptedException {
        Thread.sleep(500);
        log.info("Get updated price : " + updatedPrice.toString());
        return updatedPrice.getText();
    }

    public String getTheShoppingCartPageTitle() {
        log.info("Shopping cart title : " + shoppingCartText.toString());
        return shoppingCartText.getText();
    }

    public String getTheSizeOfThePants() {
        log.info("Getting size of pant : " + theSizeOfThePants.toString());
        return theSizeOfThePants.getText();
    }

    public String getTheColourOfThePants() {
        log.info("Getting colour of pant : " + theColourOfThePants.toString());
        return theColourOfThePants.getText();
    }
}
