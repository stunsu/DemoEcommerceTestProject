Feature: Guest checkout feature

  Scenario Outline: Registered user performs a checkout
    Given user navigates to the homepage
    And sign in with "<username>" and "<password>"
    And user selects a category
    When picks a product from the listing page
    And adds to Basket an item from PDP
    And fills in the shipping address
    And selects a payment method
    Then user is able to place the order

    Examples:
      | username        | password  |
      | sorin@yahoo.com | Dacia123  |