Feature: buy in tottus webshop
  As a web user
  I want to add product to shopping cart
  to make the purchase


  Scenario: Add product
    Given that I'm on the page tottus
    When I search and add a product as televisor
    Then I check my products in the shopping cart
