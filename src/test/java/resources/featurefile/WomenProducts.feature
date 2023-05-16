Feature: Women products Test
  As a User I can sort products from Filter
  @sanity @regression
  Scenario: Verify that User can sort products by Product Name
    Given I am on home page
    When I mouse hover on Women menu
    And I mouse hover on Top menu
    And I click on Jacket menu
    And I select Product name from Drop down list
    Then Verify that products are sorted by Product name

  @smoke @regression
  Scenario: Verify that User can sort products by Price
    Given I am on home page
    When I mouse hover on Women menu
    And I mouse hover on Top menu
    And I click on Jacket menu
    And I select Price from DropDown list
    Then Verify that products are sorted by Price