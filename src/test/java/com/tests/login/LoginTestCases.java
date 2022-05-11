package com.tests.login;

import com.constants.Constants;
import com.pages.LoginPage;
import com.tests.utilities.PrePost;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

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
        loginPage.validateLocationLink(testData.get("admin_Page"));
        loginPage.validateCustomerLabel(testData.get("customer_login"));
        loginPage.validateUserNameLabel(testData.get("username"));
        loginPage.validatePasswordLabel(testData.get("Password"));
        loginPage.validateLoginButton(testData.get("log In"));
        loginPage.validateForgotPasswordLink(testData.get("forgot_login_info_?"));
        loginPage.validateRegisterLink(testData.get("register"));
        // assert and verify(soft assert) -
        // assert - if it fails it stops the test there
        // verify - it continues the test
    }
}
