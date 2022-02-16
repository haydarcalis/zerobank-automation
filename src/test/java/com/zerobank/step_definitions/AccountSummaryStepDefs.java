package com.zerobank.step_definitions;

import com.zerobank.pages.AccountSummary;
import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.Driver;
import io.cucumber.java.en.Then;
import org.checkerframework.checker.nullness.compatqual.NonNullType;
import org.junit.Assert;
import org.junit.runners.model.InvalidTestClassError;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.ArrayList;
import java.util.List;

public class AccountSummaryStepDefs {

    @Then("The user should see following account types")
    public void the_user_should_see_following_account_types(List<String>expectedAccountTypes) {

      List<String>actualTypes=new ArrayList<>();

      List<WebElement> actualAccountTypes = Driver.get().findElements(By.xpath("//h2"));
          for (WebElement actualAccountType : actualAccountTypes) {
            actualTypes.add(actualAccountType.getText());
        }
        Assert.assertEquals(expectedAccountTypes,actualTypes);

    }

    @Then("The user should see following coloumns on the Credit Accounts table")
    public void theUserShouldSeeFollowingColoumnsOnTheCreditAccountsTable(List<String>expectedColoumns) {
        List<String> actualColoumns = BrowserUtils.getElementsText(new AccountSummary().creditAccountsColoumns);
        Assert.assertEquals(expectedColoumns,actualColoumns);
    }
}
