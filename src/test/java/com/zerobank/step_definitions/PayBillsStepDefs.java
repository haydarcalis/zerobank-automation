package com.zerobank.step_definitions;

import com.zerobank.pages.PayBills;
import com.zerobank.utilities.BrowserUtils;
import io.cucumber.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

public class PayBillsStepDefs {

    PayBills payBills=new PayBills();

    @When("The user select option {string}")
    public void the_user_select_option(String Payee) {
    payBills.selectFrom("payee",Payee);
    BrowserUtils.waitFor(3);
    }
    @And("The user select option{string}")
    public void theUserSelectOption(String Account) {
        payBills.selectFrom("account",Account);
        BrowserUtils.waitFor(3);
    }

    @When("The user completes {string}")
    public void the_user_completes(String Amount ) {

        BrowserUtils.waitForClickablility(payBills.amount,40);
        payBills.amount.click();
        BrowserUtils.waitFor(5);
       payBills.enterDataTo(Amount,"amount");

    }
    @And("The user completes{string}")
    public void theUserCompletes(String date) {
       BrowserUtils.waitForClickablility(payBills.date,15);
        payBills.date.click();
       payBills.enterDataTo(date,"date");
        BrowserUtils.waitFor(3);
    }

    @When("The user clicks Pay button")
    public void the_user_clicks_Pay_button() {
        payBills.payButton.click();
        BrowserUtils.waitFor(3);
    }

    @Then("The user should see the message {string}")
    public void the_user_should_see_the_message(String expectedMessage) {
        System.out.println("expectedMessage = " + expectedMessage);
        Assert.assertEquals(expectedMessage,payBills.successMessage);
    }

}
