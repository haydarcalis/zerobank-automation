package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PayBills extends BasePage{
    public PayBills(){
        PageFactory.initElements(Driver.get(),"this");
    }
    @FindBy(css = "[id='sp_payee']")
    public WebElement payee;

    @FindBy(css = "[id='sp_account']")
    public WebElement account;

    @FindBy(css = "[id='sp_amount']")
    public WebElement amount;

    @FindBy(css = "[id='sp_date']")
    public WebElement date;

    @FindBy(css = "[id='sp_description']")
    public WebElement description;

    @FindBy(xpath = "//input[@value='Pay']")
    public WebElement payButton;

    @FindBy(xpath = "//span[.='The payment was successfully submitted.']")
    public WebElement successMessage;

    @FindBy(xpath = "//a[text()='Pay Saved Payee']")
    public WebElement PaySavedPayee;

}
