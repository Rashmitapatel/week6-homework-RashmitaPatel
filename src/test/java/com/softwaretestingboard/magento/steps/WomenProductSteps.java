package com.softwaretestingboard.magento.steps;

import com.softwaretestingboard.magento.pages.HomePage;
import com.softwaretestingboard.magento.pages.WomenPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.testng.Assert;

public class WomenProductSteps {
    @When("^I mouse hover on Women menu$")
    public void iMouseHoverOnWomenMenu() {
        new HomePage().hoverMouseOnWomenMenu();
    }

    @And("^I mouse hover on Top menu$")
    public void iMouseHoverOnTopMenu() {
        new HomePage().mouseHoverOnWomenTopMenu();
    }

    @And("^I click on Jacket menu$")
    public void iClickOnJacketMenu() {
        new HomePage().clickOnWomenJacketMenu();
    }

    @And("^I select Product name from Drop down list$")
    public void iSelectProductNameFromDropDownList() throws InterruptedException {
        new WomenPage().selectFilterFromDropDownList();
    }

    @Then("^Verify that products are sorted by Product name$")
    public void verifyThatProductsAreSortedByProductName() throws InterruptedException {
        Assert.assertTrue(new WomenPage().isSorted(),"Products are not sorted");
    }

    @And("^I select Price from DropDown list$")
    public void iSelectPriceFromDropDownList() throws InterruptedException {
        new WomenPage().setSelectByFilterPrice();
    }

    @Then("^Verify that products are sorted by Price$")
    public void verifyThatProductsAreSortedByPrice() throws InterruptedException {
        Assert.assertTrue(new WomenPage().isSortedByPrice(),"products are not sorted by Price");
    }
}
