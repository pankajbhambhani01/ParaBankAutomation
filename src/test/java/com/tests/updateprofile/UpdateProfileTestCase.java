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
    public void TC001_validateUpdateProfileNavigation() {                //ok
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.clickUpdateProfile();        //dummy

        updateProfilePage.validateUpdateLabel(testData.get("titleUpdateProfile"));

    }

    @Test
    public void TC002_allFieldValidation() {                      //ok   1p
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);
        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.clickUpdateProfile();        //dummy

        updateProfilePage.validateFirstNameLabel(testData.get("fName_lbl"));
        updateProfilePage.validateLastNameLabel(testData.get("lName_lbl"));
        updateProfilePage.validateAddressLabel(testData.get("add_lbl"));
        updateProfilePage.validatecityLabel(testData.get("city_lbl"));
        updateProfilePage.validateStateLabel(testData.get("state_lbl"));
        updateProfilePage.validateZipcode(testData.get("zip_lbl"));
        updateProfilePage.validatePhoneNumber(testData.get("phone_lbl"));
        updateProfilePage.validateUpdateButtonLabel(testData.get("update_lbl"));   //update button text null




    }

    @Test
    public void TC003_allFiledValidationErrorMessage() {        //ok
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);

        updateProfilePage.clickUpdateProfile();        //dummy

        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.clearTxtFirstName();
        updateProfilePage.clearTxtLastName();
        updateProfilePage.clearTxtAddress();
        updateProfilePage.clearTxtCity();
        updateProfilePage.clearTxtState();
        updateProfilePage.clearTxtZipCode();

        updateProfilePage.validatedFirstNameBlankErrorMessage(testData.get("name1_error_message"));
        updateProfilePage.validatedLastNameBlankErrorMessage(testData.get("Last1_name_error_message"));
        updateProfilePage.validatedAddressBlankErrorMessage(testData.get("address1_error_message"));
        updateProfilePage.validatedCityBlankErrorMessage(testData.get("city_error1_message"));
        updateProfilePage.validatedStateBlankErrorMessage(testData.get("state_error_message1"));
        updateProfilePage.validatedZipCodeBlankErrorMessage(testData.get("zipcode_error_message1"));
       // updateProfilePage.validatedPhoneNumberBlankErrorMessage(testData.get(""));  //no error message
       updateProfilePage.clickUpdateProfileButton();

    }

    @Test
    public void TC004_someFieldBlank() {            //ok  1d

        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);

        updateProfilePage.clickUpdateProfile();        //dummy

        //accountServicesPage.clickUpdateProfileLink();
        updateProfilePage.enterTxtFirstName(testData.get("same_Fname"));
        updateProfilePage.validatedLastNameBlankErrorMessage(testData.get("Last1_name_error_message"));
        updateProfilePage.enterTxtAddress(testData.get("same_add"));
        updateProfilePage.validatedCityBlankErrorMessage(testData.get("city_error1_message"));
        updateProfilePage.validatedStateBlankErrorMessage(testData.get("state_error_message1"));
        updateProfilePage.enterZipCode(testData.get("same_zip"));
        updateProfilePage.clickUpdateProfileButton();
        updateProfilePage.validatErrorMessage(testData.get("blank2_message"));  //updated after blank textbox




    }
@Test
    public void TC005_validationWithSameInformation() {         //ok   1d
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);

    updateProfilePage.clickUpdateProfile();        //dummy

        //accountServicesPage.clickUpdateProfileLink();

//        updateProfilePage.enterTxtFirstName(testData.get("same_Fname"));
//        updateProfilePage.enterTxtLastName(testData.get("same_Lname"));
//        updateProfilePage.enterTxtAddress(testData.get("same_add"));
//        updateProfilePage.enterTxtCity(testData.get("same_city"));
//        updateProfilePage.enterTxtState(testData.get("same_state"));
//        updateProfilePage.enterZipCode(testData.get("same_zip"));
        updateProfilePage.clickUpdateProfileButton();
        updateProfilePage.validatErrorMessage(testData.get("same_error_message")); //defect
    }

   @Test
    public void TC006_validationSuccessfullUpdateProfile() throws InterruptedException {     //ok  1d
        Map<String, String> testData = FileReading.readProperties(Constants.updateprofile + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
        UpdateProfilePage updateProfilePage = new UpdateProfilePage(browser.getDriver());

        String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);

       updateProfilePage.clickUpdateProfile();        //dummy

        //accountServicesPage.clickUpdateProfileLink();
      //  updateProfilePage.enterTxtFirstName(testData.get("first_name"));
       // updateProfilePage.enterTxtLastName(testData.get("last_name"));
       // updateProfilePage.enterTxtAddress(testData.get("address"));
        updateProfilePage.enterTxtCity(testData.get("city"));
       // updateProfilePage.enterTxtState(testData.get("state"));
       updateProfilePage.enterZipCode(testData.get("zipcode"));
        updateProfilePage.clickUpdateProfileButton();
        Thread.sleep(5000);
        updateProfilePage.validateSuccessfulUpdatedProfileTittle(testData.get("updated_tittle"));
        updateProfilePage.validateSuccessfulUpdateProfileMessage(testData.get("success_Message")); //defect in message

    }

}
