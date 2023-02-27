package com.cybertek.step_definitions;

import com.cybertek.pages.CheckboxesPage;
import com.cybertek.utilities.ConfigurationReader;
import com.cybertek.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class Checkboxes_stepDefinitions {

    CheckboxesPage checkboxesPage = new CheckboxesPage();

    @Given("user is on Cybertek checkboxes page")
    public void user_is_on_cybertek_checkboxes_page() {
        Driver.getDriver().get(ConfigurationReader.getProperty("urlCheckboxes"));
    }

    @Then("user sees checkboxTwo is selected")
    public void user_sees_checkbox_two_is_selected() {
        Assert.assertTrue(checkboxesPage.checkbox2.isSelected());
    }


}

