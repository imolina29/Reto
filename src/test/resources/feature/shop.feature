Feature: buy in tottus webshop
  As a web user
  I want to add product to shopping cart
  to make the purchase


  Scenario: Add product
    Given the user is on the tottus page
    When the user search and add a product as televisor
    Then the user check my products in the shopping cart
