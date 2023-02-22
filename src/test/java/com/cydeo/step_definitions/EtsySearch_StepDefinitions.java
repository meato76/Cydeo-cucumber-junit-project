package com.cydeo.step_definitions;

import com.cydeo.pages.EtsySearchPage;
import com.cydeo.utilities.BrowserUtils;
import com.cydeo.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class EtsySearch_StepDefinitions {


    EtsySearchPage etsySearchPage = new EtsySearchPage();

    @Given("user is on the Etsy homepage")
    public void user_is_on_the_etsy_homepage() {
        Driver.getDriver().get("https://www.etsy.com");
    }

    @Then("user should see title is as expected")
    public void user_should_see_title_is_as_expected() {
        String expectedTitle = "Etsy - Shop for handmade, vintage, custom, and unique gifts for everyone";

        BrowserUtils.verifyTitleContains(expectedTitle);

    }

    @When("User types Wooden Spoon in the search box")
    public void user_types_wooden_spoon_in_the_search_box() {
        etsySearchPage.searchBox.sendKeys("Wooden Spoon");
    }

    @When("User clicks search button")
    public void user_clicks_search_button() {
        etsySearchPage.searchButton.click();

    }

    @Then("User sees Wooden Spoon is in the title")
    public void user_sees_wooden_spoon_is_in_the_title() {
        BrowserUtils.verifyTitle("Wooden spoon - Etsy");


    }


    @When("User types {string} in the search box")
    public void userTypesInTheSearchBox(String keyword) {

        etsySearchPage.searchBox.sendKeys(keyword);
    }


    @Then("User sees {string} is in the title")
    public void userSeesIsInTheTitle(String expectedTitle) {

        BrowserUtils.verifyTitle(expectedTitle);
    }
}
