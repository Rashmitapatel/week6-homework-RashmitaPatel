Feature: Gear Product Test
  As a user I want to add product in shopping cart

  @sanity @regression
  Scenario: User should add product to shopping cart successfully
    Given I am on home page
    When I mouse hover on Gear menu
    And I click on Bag menu
    And I click on Night Duffle Bag
    Then Verify I am navigated to Bag page with "Overnight Duffle" text
    When I change quantity "3"
    And I click on add to cart Button
    And Verify bag added successfully with "You added Overnight Duffle to your shopping cart." message
    And I click on shopping cart link
    Then Verify product name "Overnight Duffle"
    And Verify product quantity "3"
    And Verify product price "$135.00"
    When I change quantity "5" on shopping page
    And I click on update cart button
    Then Verify that cart is updated successfully with "$225.00"