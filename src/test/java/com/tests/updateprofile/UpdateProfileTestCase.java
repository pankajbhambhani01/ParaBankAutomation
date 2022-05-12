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
        updateProfilePage.validateUpdateLabel(testData.get("titleUpdateProfile"));
    }

    @Test
    public void TC002_allFieldValidation() {
        //enter username password
        //click on loginBtn
        // click on updateProfile Link
        //enter all Field with correct information
        //click on updateButton
        //validate message
    }

    @Test
    public void TC003_allFiledValidationErrorMessage() {
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user1").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.validateUpdateLabel(testData.get("titleUpdateProfile"));
        updateProfilePage.clickUpdateProfileButton();
        //validate message
    }

    @Test
    public void TC004_someFieldBlank() {
        //enter username password
        //click on loginBtn
        // click on updateProfile Link
        //enter name,city,zipcode with correct information
        //click on updateButton
        //validate message


    }

    public void TC005_validationWithSameInformation() {
        //enter username password
        //click on loginBtn
        // click on updateProfile Link
        //enter all field with previous information
        //click on updateButton
        //validate message

    }

}
