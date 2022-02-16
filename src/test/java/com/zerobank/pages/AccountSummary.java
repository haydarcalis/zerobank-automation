package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.ArrayList;
import java.util.List;

public class AccountSummary {

    public AccountSummary(){PageFactory.initElements(Driver.get(),"this");}



    @FindBy(xpath ="//h2[@class='board-header']")
    public List<WebElement> accountTypes;

    @FindBy(xpath = "(//thead)[3]//th")
    public List<WebElement> creditAccountsColoumns;





}
