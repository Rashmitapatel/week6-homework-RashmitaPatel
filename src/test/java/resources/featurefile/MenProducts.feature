Feature: Men product test
  As a User I want to add product in shopping cart

  @sanity @regression
  Scenario: User should add product successfully to shopping cart
    Given I am on home page
    When I mouse hover on Men menu
    And I mouse hover on Men Bottom
    And I click on Pants menu
    And I sort products by product name
    And I click on size of Cronos pant
    And I click on black colour of Cronos pant
    And I click on Add to cart Button of Cronos pant
    Then Verify product added successfully message with "You added Cronus Yoga Pant to your shopping cart."
    When I click on Shopping cart link
    Then Verify Shopping cart is displayed with "Shopping Cart"
    And Verify Product name with "Cronus Yoga Pant"
    And Verify Pant size with "32"
    And Verify Colour of pant "Black"