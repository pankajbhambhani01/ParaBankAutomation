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
    public void TC001_validateForgotPasswordLinkNavigation(){             //ok

        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        loginPage.validateForgotPasswordPage(testData.get("forgot_Password_page_Tittle"));

    }

    @Test
    public void TC002_enterCorrectInfoInFieldForgotPassword(){                  //ok 1d

        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage=new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.enterFirstName(testData.get("Ofirst_name"));
        forgotLoginInfoPage.enterLastName(testData.get("Olast_name"));
        forgotLoginInfoPage.enterAddress(testData.get("Oaddress"));
        forgotLoginInfoPage.enterCity(testData.get("Ocity"));
        forgotLoginInfoPage.enterState(testData.get("Ostate"));
        forgotLoginInfoPage.enterZipCode(testData.get("Ozip"));
        forgotLoginInfoPage.enterSSN(testData.get("Ossn"));
        forgotLoginInfoPage.clickFindMYLoginInfo();
        forgotLoginInfoPage.validatforgotSucssesMessage(testData.get("forgot_sucsses_message"));  //defect

    }

    @Test
    public void TC003_enterWrongInfoInFieldForgotPassword(){                  //ok
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
        forgotLoginInfoPage.clickFindMYLoginInfo();
        forgotLoginInfoPage.validateWrongInfoMessage(testData.get("wrong_error_message"));


    }

    @Test
    public void TC004_enterSomeFieldBlankINForgotPassword() {             //ok

        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.enterFirstName(testData.get("Ofirst_name"));
        forgotLoginInfoPage.enterAddress(testData.get("Oaddress"));
        forgotLoginInfoPage.enterCity(testData.get("Ocity"));
        forgotLoginInfoPage.enterZipCode(testData.get("Ozip"));
        forgotLoginInfoPage.clickFindMYLoginInfo();
        forgotLoginInfoPage.validatedLastNameBlankErrorMessage(testData.get("Last_name_error_message"));
        forgotLoginInfoPage.validatedStateBlankErrorMessage(testData.get("state_error_message"));
        forgotLoginInfoPage.validatedSSNBlankErrorMessage(testData.get("ssn_error_message"));

    }

    @Test
    public void TC005_KeepAllFieldBlankINForgotPassword(){                   //ok

        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.clickFindMYLoginInfo();
        forgotLoginInfoPage.validatedFirstNameBlankErrorMessage(testData.get("name_error_message"));
        forgotLoginInfoPage.validatedLastNameBlankErrorMessage(testData.get("Last_name_error_message"));
        forgotLoginInfoPage.validatedAddressBlankErrorMessage(testData.get("address_error_message"));
        forgotLoginInfoPage.validatedCityBlankErrorMessage(testData.get("city_error_message"));
        forgotLoginInfoPage.validatedStateBlankErrorMessage(testData.get("state_error_message"));
        forgotLoginInfoPage.validatedZipCodeBlankErrorMessage(testData.get("zipcode_error_message"));
        forgotLoginInfoPage.validatedSSNBlankErrorMessage(testData.get("ssn_error_message"));




    }

@Test
    public void TC006_validateAlllabels(){                                  //ok
        Map<String, String> testData = FileReading.readProperties(Constants.forgotpassword + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        ForgotLoginInfoPage forgotLoginInfoPage = new ForgotLoginInfoPage(browser.getDriver());
        loginPage.clickForgotPasswordLink();
        forgotLoginInfoPage.validateCommandLine(testData.get("command_line"));
        forgotLoginInfoPage.validateFirstNameLabel(testData.get("fName_lbl"));
        forgotLoginInfoPage.validateLASTNameLabel(testData.get("lName_lbl"));
        forgotLoginInfoPage.validateAddressLabel(testData.get("add_lbl"));
        forgotLoginInfoPage.validateCityLabel(testData.get("city_lbl"));
        forgotLoginInfoPage.validateStateLabel(testData.get("state_lbl"));
        forgotLoginInfoPage.validateZipCodeLabel(testData.get("zip_lbl"));
        forgotLoginInfoPage.validateSSNLabel(testData.get("ssn_lbl"));

    }

}
