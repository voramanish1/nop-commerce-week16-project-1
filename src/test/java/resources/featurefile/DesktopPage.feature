Feature: Desktop Page Test
  As a user i want check functionality of desktop page

  Background: I am on homepage of tutorial ninja website
    Given I am on homepage
@sanity @regression
    Scenario: User can arrange product in alphabetical order successfully
      When I click on Computer menu
      And I click on Desktop tab
      And I select sort by position "Name: Z to A"
      Then I should see product arrange in alphabetical order successfully
@smoke @regression
      Scenario: User should add product to shopping cart successfully
        When I click on Computer menu
        And I click on Desktop tab
        And I select sort by position "Name: A to Z"
        And I click on add to cart of build your own computer
        Then I should navigate to build your own computer product page
        And I select processor "2.2 GHz Intel Pentium Dual-Core E2200"
        And I select RAM "8GB [+$60.00]"
        And I select HDD radio "400 GB [+$100.00]"
        And I select OS "Vista Premium [+$60.00]"
        And I select check box "Total Commander[+$5.00]"
        Then I should see "$1,475.00" total price
        And I click on add to cart button
        Then I should see product added shopping cart successfully message
        And I click on cross button of success message green bar
        And I mouse hover on shopping cart
        And I click on go to cart
        Then I should see shopping cart text on page
        And I change quantity "2"
        And I click on update shopping cart
        Then I should see "$2,950.00" price
        And I click on check box of terms and service
        And I click on check out button
        Then I should navigate to check out as guest or login page
        And I click on check out as guest tab
        And I fill all mandatory field on check out as guest page
        And I click on continue button of check page
        And I click on next day air radio button
        And I click on continue button after selection
        And I click on credit card radio button
        And I click on continue button after card selection
        And I select "Master card" from credit card drop down
        And I fill all card detail
        And I click on continue after filling all card detail
        Then I should see payment method "Credit Card"
        And I should see shopping method "Next Day Air"
        And I should see "$2,950.00" price of product
        And I click on confirm button
        Then I should see Thank you message
        And I should see order successfully processed message
        And I click on continue button
        Then I should see welcome to our store text






