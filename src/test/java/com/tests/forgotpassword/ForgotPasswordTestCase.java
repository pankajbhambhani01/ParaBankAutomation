package com.tests.forgotpassword;

import com.constants.Constants;
import com.pages.ForgotLoginInfoPage;
import com.pages.LoginPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

import static com.constants.Constants.browser;

public class ForgotPasswordTestCase extends PrePost {
    //Abhijit raoot

    @Test
    public void TC001_validateForgotPasswordLinkNavigation(){
        //click on Forgot Password Info? Link
        //validate Customer Page appered.
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.validateCustomerTittle("");


    }

    @Test
    public void TC002_entercorrectInfoInFieldForgotPassword(){
        //click on Forgot Password Info? Link
        //enter All Field with correct information
        //click on FindMylogininfoBtn
        //validate message
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.enterFirstName(testData.get("fName_lbl"));
        forgotLoginInfoPage.enterLastName(testData.get("lName_lbl"));
        forgotLoginInfoPage.enterAddress(testData.get("add_lbl"));
        forgotLoginInfoPage.enterCity(testData.get("city_lbl"));
        forgotLoginInfoPage.enterState(testData.get("state_lbl"));
        forgotLoginInfoPage.enterZipCode(testData.get("zip_lbl"));
        forgotLoginInfoPage.enterSSN(testData.get("ssn_lbl"));
        forgotLoginInfoPage.validatforgotSucssesMessage(testData.get("forgot_sucsses_message"));

    }

    @Test
    public void TC003_enterWrongInfoInFieldForgotPassword(){
        //click on Forgot Password Info? Link
        //enter All Field with wrong information
        //click on FindMylogininfoBtn
        //validate message
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.enterFirstName(testData.get("wrong_Fname"));
        forgotLoginInfoPage.enterLastName(testData.get("wrong_Lname"));
        forgotLoginInfoPage.enterAddress(testData.get("wrong_add"));
        forgotLoginInfoPage.enterCity(testData.get("wrong_city"));
        forgotLoginInfoPage.enterState(testData.get("wrong_state"));
        forgotLoginInfoPage.enterZipCode(testData.get("wrong_zip"));
        forgotLoginInfoPage.enterSSN(testData.get("wrong_ssn"));
        forgotLoginInfoPage.validateWrongInfoMessage(testData.get("wrong_error_message"));


    }

    @Test
    public void TC004_enterSomeFieldBlankINForgotPassword() {
        //click on Forgot Password Info? Link
        //enter name city phonenumber Field with wrong information
        //click on FindMylogininfoBtn
        //validate message

        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.enterFirstName(testData.get(""));
        forgotLoginInfoPage.enterAddress(testData.get(""));
        forgotLoginInfoPage.enterCity(testData.get(""));
        forgotLoginInfoPage.enterZipCode(testData.get(""));
        forgotLoginInfoPage.validateFindMYLoginInfo(testData.get(""));;//wrong method
        forgotLoginInfoPage.validateFindMYLoginInfo(testData.get(""));;//wrong method

    }

    @Test
    public void TC005_KeepAllFieldBlankINForgotPassword(){
        //click on Forgot Password Info? Link
        //click on FindMylogininfoBtn
        //validate message
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.clickFindMYLoginInfo();
        //validate message method

    }


    public void TC006_validateAlllabels(){
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.validateCommandLine(testData.get(""));
        forgotLoginInfoPage.validateFirstNameLabel(testData.get(""));
        forgotLoginInfoPage.validateLASTNameLabel(testData.get(""));
        forgotLoginInfoPage.validateAddressLabel(testData.get(""));
        forgotLoginInfoPage.validateCityLabel(testData.get(""));
        forgotLoginInfoPage.validateStateLabel(testData.get(""));
        forgotLoginInfoPage.validateZipCodeLabel(testData.get(""));
        forgotLoginInfoPage.validateSSNLabel(testData.get(""));

    }

}
