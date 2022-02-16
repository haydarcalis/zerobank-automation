package com.zerobank.pages;

import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.lang.reflect.Field;
import java.util.List;

public class AccountActivity extends BasePage{

    public AccountActivity(){PageFactory.initElements(Driver.get(),"this");}

    @FindBy(xpath = "//select")
    public WebElement dropDownMenu;

    @FindBy(xpath = "//thead//th")
    public List<WebElement> coloumnNames;






}
