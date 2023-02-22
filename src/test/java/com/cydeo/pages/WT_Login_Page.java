package com.cydeo.pages;

import com.cydeo.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;



public class WT_Login_Page {
    public WT_Login_Page() { PageFactory.initElements(Driver.getDriver(),this);}

    @FindBy(xpath = "//input[@type='text']")
    public WebElement usernameBox;


    @FindBy(xpath ="//input[@type='password']" )
    public WebElement passwordBox;


    @FindBy(xpath ="//button[@type='submit']" )
    public WebElement loginButton;


    /**
     * This method will login with below credentials
     * @username: Test
     * @password: Tester
     */
    public void login(){

        this.usernameBox.sendKeys("Test");
        this.passwordBox.sendKeys("Tester");
        this.loginButton.click();
    }

    /**
     * This method will log in with credentials that are
     * provided in the method at the time of calling it
     * @param user
     * @param pass
     */

    public void login(String user, String pass){

        this.usernameBox.sendKeys(user);
        this.passwordBox.sendKeys(pass);
        this.loginButton.click();
    }
}
