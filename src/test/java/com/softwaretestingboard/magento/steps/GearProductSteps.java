package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.GearBagPage;
import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class GearProductSteps {
    @Given("^I am on home page$")
    public void iAmOnHomePage() {

    }

    @When("^I mouse hover on Gear menu$")
    public void iMouseHoverOnGearMenu() {
        new HomePage().hoverMouseOnGearMenu();
    }

    @And("^I click on Bag menu$")
    public void iClickOnBagMenu() {
        new HomePage().clickOnBagMenu();
    }

    @And("^I click on Night Duffle Bag$")
    public void iClickOnNightDuffleBag() {
        new GearBagPage().clickOnNightDuffleBag();
    }

    @And("^Verify I am navigated to Bag page with \"([^\"]*)\" text$")
    public void verifyIAmNavigatedToBagPageWithText(String expected) {
        Assert.assertEquals(new GearBagPage().verifyTheBagText(),expected,"User not navigated to bag page");
    }

    @And("^I change quantity \"([^\"]*)\"$")
    public void iChangeQuantity(String quantity) {
        new GearBagPage().changeTheQuantityOfTheBag(quantity);
    }

    @And("^I click on add to cart Button$")
    public void iClickOnAddToCartButton() {
        new GearBagPage().clickOnAddToCartButton();
    }

    @And("^Verify bag added successfully with \"([^\"]*)\" message$")
    public void verifyBagAddedSuccessfullyWithMessage(String expected) {
        Assert.assertEquals(new GearBagPage().bagAddedToCartSuccessfullyMessage(),expected,"Product is not added to cart");
    }

    @And("^I click on shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new GearBagPage().clickOnShoppingCartLink();
    }

    @And("^Verify product name \"([^\"]*)\"$")
    public void verifyProductName(String expected) {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductsName(),expected,"Product name is not matching");
    }

    @And("^Verify product quantity \"([^\"]*)\"$")
    public void verifyProductQuantity(String expected) {
        Assert.assertEquals(new ShoppingCartPage().getQuantityOfProduct(),expected,"Quantity is not matching");
    }

    @And("^Verify product price \"([^\"]*)\"$")
    public void verifyProductPrice(String expected) {
        Assert.assertEquals(new ShoppingCartPage().getPriceOfTheProduct(),expected,"Price is not matching");
    }

    @And("^I click on update cart button$")
    public void iClickOnUpdateCartButton() {
        new ShoppingCartPage().updateTheShoppingCart();
    }

    @Then("^Verify that cart is updated successfully with \"([^\"]*)\"$")
    public void verifyThatCartIsUpdatedSuccessfullyWith(String expected) throws InterruptedException {
        Assert.assertEquals(new ShoppingCartPage().UpdatedProductPrice(),expected,"Price is not updated");
    }

    @And("^I change quantity \"([^\"]*)\" on shopping page$")
    public void iChangeQuantityOnShoppingPage(String quantity) {
        new ShoppingCartPage().changeTheQuantityOfTheBag(quantity);
    }
}
