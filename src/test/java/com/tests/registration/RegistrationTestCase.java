package com.tests.registration;

import com.constants.Constants;
import com.pages.LoginPage;
import com.pages.RegistrationPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class RegistrationTestCase {
    public class RegistrationTestCases extends PrePost {

        @Test
        public void TC001_ValidateAllLablesOnRegistrationScreen() {

            Map<String, String> testData = FileReading.readProperties(Constants.registration + Constants.slash + "TC001");
            RegistrationPage registrationPage = new RegistrationPage(browser.getDriver());

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
            registrationPage.enterTxtUsername("first_name");
            registrationPage.enterTxtLastName("last_name");
            registrationPage.enterTxtAddress("address");
            registrationPage.enterTxtCity("city");
            registrationPage.enterTxtState("state");
            registrationPage.enterZipCode("zip_code");
            registrationPage.enterPhoneNumber("phone");
            registrationPage.enterSSN("ssn");
            registrationPage.enterTxtUsername("username");
            registrationPage.enterTxtPassword("password");
            registrationPage.enterTxtXConfirm("confirm");
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
            registrationPage.clickRegisterButton();
            registrationPage.validatedFirstNameBlankErrorMessage("first_name_is_required.");
            registrationPage.validatedLastNameBlankErrorMessage("Last name is required.");
            registrationPage.validatedAddressBlankErrorMessage("Address is required.");
            registrationPage.validatedCityBlankErrorMessage("City is required.");
            registrationPage.validatedStateBlankErrorMessage("State is Required.");
            registrationPage.validatedZipCodeBlankErrorMessage("Zip Code is required.");
            registrationPage.validatedSSNBlankErrorMessage("SSN is required.");
            registrationPage.validatedUsernameBlankErrorMessage("Username is required.");
            registrationPage.validatedPasswordBlankErrorMessage("Address is required.");
            registrationPage.validatedConfirmBlankErrorMessage("Password confirmation is required.");

        }


        /*@Test
        public void TC005_Already_Used_Username_ErrorMessageValidation() {
            //Enter All Valid Field
            //Click On Register Button
            // Validate Error Message
            Map<String, String> testData = FileReading.readProperties("TC001");
            RegistrationPage registrationPage=new RegistrationPage(browser.getDriver());
            registrationPage.enterTxtUsername("");
            registrationPage.enterTxtLastName("");
            registrationPage.enterTxtAddress("");
            registrationPage.enterTxtCity("");
            registrationPage.enterTxtState("");
            registrationPage.enterZipCode("");
            registrationPage.enterPhoneNumber("");
            registrationPage.enterSSN("");
            registrationPage.enterTxtUsername("");
            registrationPage.enterTxtPassword("");
            registrationPage.enterTxtXConfirm("");
            registrationPage.clickRegisterButton();
            //registrationPage.validateUsernameAlreadyExists("");

        }*/
    }
}