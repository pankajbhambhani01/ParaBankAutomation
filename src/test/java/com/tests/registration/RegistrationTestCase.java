package com.tests.registration;

import com.constants.Constants;
import com.pages.LoginPage;
import com.pages.RegistrationPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Date;
import java.util.Map;


    public class RegistrationTestCase extends PrePost {
        @Test
        public void TC001_ValidateAllLablesOnRegistrationScreen() {

            Map<String, String> testData = FileReading.readProperties(Constants.registration + Constants.slash + "TC001");
            RegistrationPage registrationPage = new RegistrationPage(browser.getDriver());
            LoginPage loginPage=new LoginPage(browser.getDriver());
            loginPage.clickRegisterLink();

            registrationPage.validateRegistrationLabel(testData.get("registration_label"));
            registrationPage.validateRegistrationText(testData.get("registration_text"));
            registrationPage.validateFirstNameLabel(testData.get("first_name_label"));
            registrationPage.validateLastNameLabel(testData.get("last_name_label"));
            registrationPage.validateAddressLabel(testData.get("address_label"));
            registrationPage.validateCityLabel(testData.get("city_label"));
            registrationPage.validateStateLabel(testData.get("state_label"));
            registrationPage.validateZipCodeLabel(testData.get("zip_code_label"));
            registrationPage.validatePhoneLabel(testData.get("phone_label"));
            registrationPage.validateSSNLabel(testData.get("ssn_label"));
            registrationPage.validateUsernameLabel(testData.get("username_label"));
            registrationPage.validatePasswordLabel(testData.get("password_label"));
            registrationPage.validateConfirmLabel(testData.get("confirm_label"));
            registrationPage.validateRegisterButtonLabel(testData.get("register_label"));
        }

        @Test
        public void TC002_Register_Account_With_Valid_Information() {
            //Enter First name
            //Enter Last Name
            //Enter Address
            //Enter City
            //Enter State
            //Enter ZipCode
            //Enter Phone
            //Enter SSN
            //Enter Username
            //Enter Password
            //Enter Confirm
            //Click On REGISTER Button
            Map<String, String> testData = FileReading.readProperties(Constants.registration + Constants.slash + "TC002");
            RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
            LoginPage loginPage=new LoginPage(browser.getDriver());
            loginPage.clickRegisterLink();
            /*Date d = new Date();
            long ss = d.getTime();
            String user = "User_" + ss;*/

            registrationPage.enterTxtFirstName(testData.get("first_name"));
            registrationPage.enterTxtLastName(testData.get("last_name"));
            registrationPage.enterTxtAddress(testData.get("address"));
            registrationPage.enterTxtCity(testData.get("city"));
            registrationPage.enterTxtState(testData.get("state"));
            registrationPage.enterZipCode(testData.get("zip_code"));
            registrationPage.enterPhoneNumber(testData.get("phone"));
            registrationPage.enterSSN(testData.get("ssn"));
            registrationPage.enterTxtUsername(testData.get("username"));
            registrationPage.enterTxtPassword(testData.get("password"));
            registrationPage.enterTxtXConfirm(testData.get("confirm"));
            registrationPage.clickRegisterButton();

        }

        @Test
        public void TC003_AllFiledsBlanksAndErrorMessageValidation() {
            //Blank First name
            //Blank Last Name
            //Blank Address
            //Blank City
            //Blank State
            //Blank ZipCode
            //Blank Phone
            //Blank SSN
            //Blank Username
            //Blank Password
            //Blank Confirm
            //Click On REGISTER Button
            //Validate Error Message
            Map<String, String> testData = FileReading.readProperties(Constants.registration + Constants.slash + "TC003");
            RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
            LoginPage loginPage=new LoginPage(browser.getDriver());
            loginPage.clickRegisterLink();

            registrationPage.clickRegisterButton();
            registrationPage.validatedFirstNameBlankErrorMessage(testData.get("first_name_is_required"));
            registrationPage.validatedLastNameBlankErrorMessage(testData.get("last_name_is_required"));
            registrationPage.validatedAddressBlankErrorMessage(testData.get("address_name_is_required"));
            registrationPage.validatedCityBlankErrorMessage(testData.get("city_is_required"));
            registrationPage.validatedStateBlankErrorMessage(testData.get("state_is_required"));
            registrationPage.validatedZipCodeBlankErrorMessage(testData.get("zipcode_name_is_required"));
            registrationPage.validatedSSNBlankErrorMessage(testData.get("ssn_is_required"));
            registrationPage.validatedUsernameBlankErrorMessage(testData.get("username_is_required"));
            registrationPage.validatedPasswordBlankErrorMessage(testData.get("password_is_required"));
            registrationPage.validatedConfirmBlankErrorMessage(testData.get("confirm_is_required"));

        }


        @Test
        public void TC004_Already_Used_Username_ErrorMessageValidation() {
            //Enter All Valid Field
            //Click On Register Button
            // Validate Error Message
            Map<String, String> testData = FileReading.readProperties(Constants.registration + Constants.slash + "TC004");
            RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
            LoginPage loginPage=new LoginPage(browser.getDriver());
            loginPage.clickRegisterLink();

            registrationPage.enterTxtFirstName(testData.get("first_name"));
            registrationPage.enterTxtLastName(testData.get("last_name"));
            registrationPage.enterTxtAddress(testData.get("address"));
            registrationPage.enterTxtCity(testData.get("city"));
            registrationPage.enterTxtState(testData.get("state"));
            registrationPage.enterZipCode(testData.get("zip_code"));
            registrationPage.enterPhoneNumber(testData.get("phone"));
            registrationPage.enterSSN(testData.get("ssn"));
            registrationPage.enterTxtUsername(testData.get("username"));
            registrationPage.enterTxtPassword(testData.get("password"));
            registrationPage.enterTxtXConfirm(testData.get("confirm"));
            registrationPage.clickRegisterButton();
            registrationPage.validatedUsernameBlankErrorMessage(testData.get("username_is_required"));

        }
    }