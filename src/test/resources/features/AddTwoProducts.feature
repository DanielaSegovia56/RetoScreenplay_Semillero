Feature: Add two products

  Scenario: Select and add two products on cart of Alkosto
    Given the user open the page of Alkosto and search the produts
    When the user select two products and add to cart
    Then the user can view the two products added