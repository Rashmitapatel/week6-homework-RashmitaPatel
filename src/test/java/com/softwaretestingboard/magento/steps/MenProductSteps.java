package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.MenPage;
import com.softwaretestingboard.magento.pages.ShoppingCartPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class MenProductSteps {
    @When("^I mouse hover on Men menu$")
    public void iMouseHoverOnMenMenu() {
        new HomePage().hoverMouseOnMenMenu();
    }

    @And("^I mouse hover on Men Bottom$")
    public void iMouseHoverOnMenBottom() {
        new HomePage().hoverMouseOnMenBottom();
    }

    @And("^I click on Pants menu$")
    public void iClickOnPantsMenu() {
        new HomePage().clickOnMenPantsMenu();
    }

    @And("^I sort products by product name$")
    public void iSortProductsByProductName() throws InterruptedException {
        new MenPage().sortByProductName();
    }

    @And("^I click on black colour of Cronos pant$")
    public void iClickOnBlackColourOfCronosPant() {
        new MenPage().clickOnCronousBlack();
    }

    @And("^I click on Add to cart Button of Cronos pant$")
    public void iClickOnAddToCartButtonOfCronosPant() {
        new MenPage().mouseHoverOnCronusYogaAndClickAddCart();
    }

    @And("^Verify product added successfully message with \"([^\"]*)\"$")
    public void verifyProductAddedSuccessfullyMessageWith(String expected)  {
        Assert.assertEquals(new MenPage().getSuccessMsgText(),expected,"Product is not added to cart");
    }

    @And("^I click on Shopping cart link$")
    public void iClickOnShoppingCartLink() {
        new MenPage().clickOnShoppingCartLink();
    }

    @Then("^Verify Shopping cart is displayed with \"([^\"]*)\"$")
    public void verifyShoppingCartIsDisplayedWith(String expected)  {
        Assert.assertEquals(new ShoppingCartPage().getTheShoppingCartPageTitle(),expected,"User is not navigated to shopping cart page");
    }

    @And("^Verify Product name with \"([^\"]*)\"$")
    public void verifyProductNameWith(String expected)  {
        Assert.assertEquals(new ShoppingCartPage().verifyTheProductsName(),expected,"Product name is not matching");
    }

    @And("^Verify Pant size with \"([^\"]*)\"$")
    public void verifyPantSizeWith(String expected)  {
        Assert.assertEquals(new ShoppingCartPage().getTheSizeOfThePants(),expected,"Size is not matching");
    }

    @And("^Verify Colour of pant \"([^\"]*)\"$")
    public void verifyColourOfPant(String expected)  {
        Assert.assertEquals(new ShoppingCartPage().getTheColourOfThePants(),expected,"Colour is not matching");
    }

    @And("^I click on size of Cronos pant$")
    public void iClickOnSizeOfCronosPant() throws InterruptedException {
        new MenPage().clickOnCronousSize32();
    }
}
