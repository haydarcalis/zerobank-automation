package com.zerobank.pages;

import com.zerobank.utilities.BrowserUtils;
import com.zerobank.utilities.ConfigurationReader;
import com.zerobank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

    public LoginPage(){PageFactory.initElements(Driver.get(),this);}

    @FindBy(xpath = "//input[@id='user_login']")
    public WebElement userInput;

    @FindBy(xpath = "//input[@id='user_password']")
    public WebElement passwordInput;

    @FindBy(css = "input[type='submit']")
    public WebElement submit;

    @FindBy(css = "[class='alert alert-error']")
    public WebElement errorMessage;

    public void loginAsUser(){
//        LoginPage loginPage=new LoginPage();
//        loginPage.userInput.sendKeys(ConfigurationReader.get("username"));
//        loginPage.passwordInput.sendKeys(ConfigurationReader.get("password"));
//        loginPage.submit.click();

        userInput.sendKeys(ConfigurationReader.get("username"));
        passwordInput.sendKeys(ConfigurationReader.get("password"));
        submit.click();

        BrowserUtils.waitFor(3);
        Driver.get().navigate().to("http://zero.webappsecurity.com/bank/account-summary.html");

    }
    public void login(String usernameStr,String passwordStr){
        userInput.sendKeys(usernameStr);
        passwordInput.sendKeys(passwordStr);
        submit.click();
        BrowserUtils.waitFor(3);
        if((usernameStr.equals(ConfigurationReader.get("username"))&&(passwordStr.equals(ConfigurationReader.get("password"))))){
            Driver.get().navigate().to("http://zero.webappsecurity.com/bank/account-summary.html");
        }else{ }



    }
}
