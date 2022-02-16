package com.zerobank.step_definitions;

import com.zerobank.pages.LoginPage;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.*;
import org.junit.Assert;

import java.util.Map;

public class LoginStepDefs {

    @Given("The user is on the login page")
    public void the_user_is_on_the_login_page() {
        Driver.get().get(ConfigurationReader.get("url"));
    }

    @When("The user enters valid username and password and click login button")
    public void the_user_enters_username_and_password_and_click_login_button() {

        new LoginPage().login(ConfigurationReader.get("username"),ConfigurationReader.get("password"));
    }

    @Then("The user should be able to login")
    public void the_user_should_be_able_to_login() {
        BrowserUtils.waitFor(5);
        String expectedTitle="Zero - Account Summary";
        String actualTitle = Driver.get().getTitle();
        Assert.assertEquals(expectedTitle,actualTitle);
    }
    @When("The user logs in wrong or empty {string},{string}")
    public void theUserLogsInWrongOrEmpty(String invalidUsername, String invalidPassword) {
        new LoginPage().login(invalidUsername,invalidPassword);
    }
    @Then("The user should see the error message {string}")
    public void the_user_should_see_the_error_message(String expectedMessage) {
        String errorMessageText = new LoginPage().errorMessage.getText();
        Assert.assertEquals(expectedMessage,errorMessageText);
    }

    @Given("The user Logged in")
    public void theUserLoggedIn() {
        Driver.get().get(ConfigurationReader.get("url"));
        new LoginPage().loginAsUser();
    }

    @Then("The user should see title {string}")
    public void theUserShouldSeeTitle(String expectedTitle) {
        Assert.assertEquals(expectedTitle,Driver.get().getTitle());
    }
}
