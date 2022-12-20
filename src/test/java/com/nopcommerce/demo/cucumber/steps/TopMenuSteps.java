package com.nopcommerce.demo.cucumber.steps;

import com.nopcommerce.demo.pages.HomePage;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;

public class TopMenuSteps {
    @Given("^I am on homepage$")
    public void iAmOnHomepage() {
    }
    @When("^I select \"([^\"]*)\"$")
    public void iSelect(String menu){
        new HomePage().selectMenu(menu);

    }
    @Then("^I should navigate \"([^\"]*)\" page$")
    public void iShouldNavigatePage(String menu) {
        Assert.assertEquals("Page Navigated Successfully",menu, new HomePage().getTitleOfPage() );
    }
}
