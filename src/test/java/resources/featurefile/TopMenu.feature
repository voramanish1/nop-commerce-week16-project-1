Feature: Top Menu Test
  As a user i want to check top menu of nopcommerce website

  Background: I am on homepage of tutorial ninja website
    Given I am on homepage
@sanity @regression
    Scenario Outline: User should navigate to page successfully from top menu tab click
      When I select "<menu>"
      Then I should navigate "<menu>" page
    Examples:
  |menu       |
  |Computers  |
  |Electronics|
  |Apparel    |
  |Books      |
