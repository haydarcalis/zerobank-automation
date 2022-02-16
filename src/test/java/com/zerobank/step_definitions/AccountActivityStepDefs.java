package com.zerobank.step_definitions;

import com.zerobank.pages.AccountActivity;
import com.zerobank.pages.BasePage;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.List;

public class AccountActivityStepDefs {

    AccountActivity accountActivity=new AccountActivity();

    @When("the user navigates to {string} Page")
    public void theUserNavigatesToPage(String tab) {
        accountActivity.navigateTo(tab);
    }
    @Then("The user should see default option {string}")
    public void the_user_should_see_default_option(String expectedOption) {

        Select select=new Select(accountActivity.dropDownMenu);
        WebElement element= select.getFirstSelectedOption();
        String actualOption = element.getText();
        Assert.assertEquals(expectedOption,actualOption);
    }

    @Then("The user should see following options")
    public void the_user_should_see_following_options(List<String> expectedOptions ) {
        Select select=new Select(accountActivity.dropDownMenu);
        List<String> actualOptions=new ArrayList<>();
        List<WebElement>options = select.getOptions();
        for (WebElement option : options) {
            actualOptions.add(option.getText());
        }
        Assert.assertEquals(expectedOptions,actualOptions);
    }

    @Then("The user should see the columns on the Transactions table")
    public void the_user_should_see_the_columns_on_the_Transactions_table(List<String>expectedColoumns) {
        List<String> actualColoumns = BrowserUtils.getElementsText(accountActivity.coloumnNames);
        Assert.assertEquals(expectedColoumns,actualColoumns);

    }

}
