package com.tests.login;

import com.constants.Constants;
import com.pages.LoginPage;
import com.pages.RegistrationPage;
import com.tests.utilities.PrePost;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class LoginTestCases extends PrePost {

    @Test(testName = "Title of your test cases from TMT")
    public void TC001_ValidateAllLablesOnLoginScreen(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());

        loginPage.validateSolutionsLabel(testData.get("solutions"));
        loginPage.validateAboutUslink(testData.get("about_Us"));
        loginPage.validateServicesLink(testData.get("services"));
        loginPage.validateProductLink(testData.get("products"));
        loginPage.validateLocationLink(testData.get("locations"));
        loginPage.validateAdminPageLink(testData.get("admin_Page"));
        loginPage.validateCustomerLabel(testData.get("customer_login"));
        loginPage.validateUserNameLabel(testData.get("username"));
        loginPage.validatePasswordLabel(testData.get("password"));
        loginPage.validateLoginButton(testData.get("log_in"));  //some problem
        loginPage.validateForgotPasswordLink(testData.get("forgot_login_info_?"));
        loginPage.validateRegisterLink(testData.get("register"));


        // assert and verify(soft assert) -
        // assert - if it fails it stops the test there
        // verify - it continues the test
    }

    @Test
    public void TC002_sucesssfulllogin(){
        // enter username
        // enter password
        // click login
        // validate home page


        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");

}

    @Test
    public void TC003_InvalidUsername(){
        // enter wrong username
        // enter wrong password
        // click login
        // validate error message

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateWrongErrorMessage("");
    }

    @Test
    public void TC004_InvalidPassword(){
        //enter userName
        //enter wrong password
        //click login
        //validate error message

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
    }

    @Test
    public void TC005_BlankUsernamePassword(){

        //click login
        //validate error message

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickLoginButton();
        loginPage.validateBlankErrorMessage("");

    }
    @Test
    public void TC006_validateForgotLoginInfoLink(){

        //click on forgot login info?
        //validate customer Lookup page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        loginPage.validateCustomerLabel("");

    }

    @Test
    public void TC007_validateRegisterLink(){

        //click on registerlink
        //validate Signing up is easy! page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickRegisterLink();
      //  RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
        //registrationPage.validateRegistrationLabel("");


    }
    @Test
    public void TC008_validateAboutusLink(){
        //click on Aboutus link
        //validate customer ParaSoft Demo Website page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickAboutUslink();
        loginPage.validateParasoftTittle("");
    }

    @Test
    public void TC009_validateServicesLink(){
        //click on Services link
        //validate customer Available Bookstore SOAP services: page open
        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickServicesLink();
        loginPage.validateServicePageTittle("");

    }

    @Test
    public void TC0010_validateProductLink(){
        //click on Product link
        //validate customer Parasoft  page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickProductLink();
        loginPage.validateProductPageTittle("");

    }

    @Test
    public void TC0011_validateLocationsLink(){
        //click on locations link
        //validate customer Parasoft  page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickLocationLink();
        loginPage.validateLocationPageTittle("");

    }

    @Test
    public void TC0012_validateAdminPageLink(){
        //click on Adminpage link
        //validate Administration  page open

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickAdminPageLink();
        loginPage.validateAdminPageLink("");

    }




}
