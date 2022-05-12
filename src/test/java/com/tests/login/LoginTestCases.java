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

        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
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

    }

    @Test
    public void TC002_sucesssfulllogin(){


        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName(testData.get("username_login"));
        loginPage.enterPassword(testData.get("password_login"));
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("login_message");

}

    @Test
    public void TC003_InvalidUsername(){

        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName(testData.get("invalid_username"));
        loginPage.enterPassword(testData.get("password_login"));
        loginPage.clickLoginButton();
        loginPage.validateWrongErrorMessage(testData.get("Invalid_error_message"));
    }

    @Test
    public void TC004_InvalidPassword(){

        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName(testData.get("username_login"));
        loginPage.enterPassword(testData.get("invalid_password"));
        loginPage.clickLoginButton();
    }

    @Test
    public void TC005_BlankUsernamePassword(){

        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickLoginButton();
        loginPage.validateBlankErrorMessage(testData.get("blank_message"));

    }
    @Test
    public void TC006_validateForgotLoginInfoLink(){

        Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        loginPage.validateCustomerLabel(testData.get("forgot_page_tittle"));

    }

    @Test
    public void TC007_validateRegisterLink(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickRegisterLink();
       RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
        registrationPage.validateRegistrationLabel(testData.get("register_page_tittl"));


    }
    @Test
    public void TC008_validateAboutusLink(){


        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickAboutUslink();
        loginPage.validateParasoftTittle(testData.get("aboutus_page_tittle"));
    }

    @Test
    public void TC009_validateServicesLink(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickServicesLink();
        loginPage.validateServicePageTittle(testData.get("services_page_tittle"));

    }

    @Test
    public void TC0010_validateProductLink(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickProductLink();
        loginPage.validateProductPageTittle(testData.get("product_page_tittle"));

    }

    @Test
    public void TC0011_validateLocationsLink(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickLocationLink();
        loginPage.validateLocationPageTittle(testData.get("location_page_tittle"));

    }

    @Test
    public void TC0012_validateAdminPageLink(){

        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickAdminPageLink();
        loginPage.validateAdminPageLink(testData.get("admin_page_tittle"));

    }




}
