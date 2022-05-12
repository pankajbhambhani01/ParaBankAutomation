package com.tests.updateprofile;

import com.constants.Constants;
import com.pages.AccountServicesPage;
import com.pages.LoginPage;
import com.pages.UpdateProfilePage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class UpdateProfileTestCase extends PrePost {
    //Abhijit Raoot

    @Test
    public void TC001_validateUpdateProfileNavigation() {
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.validateUpdateLabel("titleUpdateProfile");

    }

    @Test
    public void TC002_allFieldValidation() {
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.validateFirstNameLabel(testData.get("fName_lbl"));
        updateProfilePage.validateLastNameLabel(testData.get("lName_lbl"));
        updateProfilePage.validateAddressLabel(testData.get("add_lbl"));
        updateProfilePage.validatecityLabel(testData.get("city_lbl"));
        updateProfilePage.validateStateLabel(testData.get("state_lbl"));
        updateProfilePage.validateZipcode(testData.get("zip_lbl"));
        updateProfilePage.validatePhoneNumber(testData.get("phone_lbl"));
        updateProfilePage.validateUpdateButtonLabel(testData.get("update_lbl"));




    }

    @Test
    public void TC003_allFiledValidationErrorMessage() {  //Incomplete
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.clickUpdateProfileButton();
        //validate message
    }

    @Test
    public void TC004_someFieldBlank() {

        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.enterTxtFirstName(testData.get("fName_lbl"));
        updateProfilePage.enterTxtAddress(testData.get("add_lbl"));
        updateProfilePage.enterZipCode(testData.get("zip_lbl"));
        updateProfilePage.clickUpdateProfileButton();
        updateProfilePage.validatErrorMessage(testData.get("blank_message"));




    }

    public void TC005_validationWithSameInformation() {
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.enterTxtFirstName(testData.get("same_Fname"));
        updateProfilePage.enterTxtLastName(testData.get("same_Lname"));
        updateProfilePage.enterTxtAddress(testData.get("same_add"));
        updateProfilePage.enterTxtCity(testData.get("same_city"));
        updateProfilePage.enterTxtState(testData.get("same_state"));
        updateProfilePage.enterZipCode(testData.get("same_zip"));
        updateProfilePage.clickUpdateProfileButton();
        updateProfilePage.validatErrorMessage(testData.get("same_error_message"));
    }

    public void TC006_validationSucessfulUpdateProfile() {
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.enterTxtFirstName(testData.get("first_name"));
        updateProfilePage.enterTxtLastName(testData.get("last_name"));
        updateProfilePage.enterTxtAddress(testData.get("address"));
        updateProfilePage.enterTxtCity(testData.get("city"));
        updateProfilePage.enterTxtState(testData.get("state"));
        updateProfilePage.enterZipCode(testData.get("zipcode"));
        updateProfilePage.clickUpdateProfileButton();
        updateProfilePage.validatSuccesfulUpdateProfileMessage(testData.get("sucssesMessage"));
    }

}
