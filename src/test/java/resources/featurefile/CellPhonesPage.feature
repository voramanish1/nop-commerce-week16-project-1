Feature: Cell Phones page Test
  As a user i want check functionality of cell phone page

  Background: I am on homepage of tutorial ninja website
    Given I am on homepage

  @sanity @regression
  Scenario: User should navigate to cell phones page successfully
    When I mouse hover to electronic tab
    And I mouse hover to cell phone link and click
    Then I should navigate to cell phone page successfully

  @smoke @regression
  Scenario: User should add product successfully and place order successfully
    When I mouse hover to electronic tab
    And I mouse hover to cell phone link and click
    Then I should navigate to cell phone page successfully
    And I click on list view tab of cell phone page
    And I click on nokia lumia cell phone
    Then I should navigate to nokia lumia cell phone page
    And I should see product price "$349.00"
    And I change the quantity to "2"
    And I click on add to cart button of cell phone page
    Then I should see product added shopping cart successfully message
    And I click on cross button of success message green bar
    And I mouse hover on shopping cart
    And I click on go to cart
    Then I should see shopping cart text on page
    And I should see quantity "2" of product
    And I should see "$698.00" price
    And I click on check box of terms and service
    And I click on check out button
    Then I should navigate to check out as guest or login page
    And I click on register tab
    Then I should navigate to register page successfully
    And I fill all mandatory field of registration
    And I click on Register button
    Then I should get registration completed message
    And I click on continue of registration
    Then I should see shopping cart text on page
    And I click on check box of terms and service
    And I click on check out button
    And I fill all mandatory field on check out page
    And I click on continue button of check page
    And I click on second day air radio button
    And I click on continue button after selection
    And I click on credit card radio button
    And I click on continue button after card selection
    And I select "Visa" from credit card drop down
    And I fill all visa card detail
    And I click on continue after filling all card detail
    Then I should see payment method "Credit Card"
    And I should see shopping method "2nd Day Air"
    And I should see "$698.00" price of product
    And I click on confirm button
    Then I should see Thank you message
    And I should see order successfully processed message
    And I click on continue button
    Then I should see welcome to our store text
    And I click on Logout link
    Then I should navigate to homepage of website successfully

 




