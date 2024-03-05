Feature: Guest checkout feature

  Scenario: Guest user performs a checkout
    Given user navigates to the homepage
    And user selects a category
    When picks a product from the listing page
    And adds to Basket an item from PDP
    And fills in the shipping address
    And selects a payment method
    Then user is able to place the order

  Scenario: Guest user performs a checkout with different billing and shipping addresses
    Given user navigates to the homepage
    And user selects a category
    When picks a product from the listing page
    And adds to Basket an item from PDP
    And fills in the shipping address
    And selects a payment method using a different billing address
    Then user is able to place the order