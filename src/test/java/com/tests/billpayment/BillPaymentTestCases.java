package com.tests.billpayment;

import com.constants.Constants;
import com.pages.BillPaymentServicePage;
import com.pages.LoginPage;
import com.pages.RegistrationPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class BillPaymentTestCases extends PrePost {
    @Test
    public void TC001_ValidateBillPayPageNevigation() {

        Map<String, String> testData = FileReading.readProperties(Constants.billpaymentservice + Constants.slash + "TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.clickLoginButton();
        BillPaymentServicePage billPayPage = new BillPaymentServicePage(browser.getDriver());
        billPayPage.validateBillPayLabel(testData.get("bill_pay"));

        //click on bill pay link
        //validate the page

    }

    @Test
    public void TC002_ValidateAllFileds() {
        Map<String, String> testData = FileReading.readProperties(Constants.billpaymentservice + Constants.slash + "TC002");
       // LoginPage loginPage=new LoginPage(browser.getDriver());
        //loginPage.clickLoginButton();
        BillPaymentServicePage billPayPage = new BillPaymentServicePage(browser.getDriver());

        billPayPage.clickBillPayLabel("bill_pay");
        billPayPage.validateBillPaymentServiceLabel(testData.get("bill_payment_service"));
        billPayPage.validatePayeeName(testData.get("payee_name"));
        billPayPage.validateAddress(testData.get("address"));
        billPayPage.validateCity(testData.get("city"));
        billPayPage.validateState(testData.get("state"));
        billPayPage.validateZipCode(testData.get("zipcode"));
        billPayPage.validatePhoneNumber(testData.get("phone"));
        billPayPage.validateAccountNumber(testData.get("account "));
        billPayPage.validateVerifyAccountNumber("verify_account");
        billPayPage.validateAmount(testData.get("amount"));
        billPayPage.validateFromAccountId(testData.get("from_account"));
        billPayPage.validateSendPaymentButtonLabel(testData.get("send_payment"));
        billPayPage.clickSendPaymentButton();
        billPayPage.validateAllFieldsMessage("All fields are valid ");
    }

    @Test
    public void TC003_SuccessfullPayment() {
        Map<String, String> testData = FileReading.readProperties(Constants.billpaymentservice + Constants.slash + "TC003");
        //LoginPage loginPage=new LoginPage(browser.getDriver());
        //loginPage.clickLoginButton();
        BillPaymentServicePage billPayPage = new BillPaymentServicePage(browser.getDriver());
        billPayPage.clickBillPayLabel("bill_pay");
        billPayPage.enterPayeeName("payee_name");
        billPayPage.enterAddress("address");
        billPayPage.enterCity("city");
        billPayPage.enterState("state");
        billPayPage.enterZipCode("zipcode");
        billPayPage.enterPhoneNumber("phone");
        billPayPage.enterAccountNumber("account");
        billPayPage.enterVerifyAccountNumber("verify_account");
        billPayPage.enterAmount("amount");
        billPayPage.enterFromAccount("from_account");
        billPayPage.clickSendPaymentButton();
        billPayPage.validatePaymentSuccessfullyTitle("Payment is done successfully:");
        //click on Bill Payment service label
        //enter valid  Payee Name
        //enter valid Address
        //enter valid city
        //enter valid State
        //enter valid ZipCode
        //enter valid Phone number
        //enter valid Account number
        //enter valid Verify account number
        //enter valid Amount
        //enter valid from account number
        //click on send payment button
        //validate the page
    }


    @Test
    public void TC004_EmptyTextFields() {
        Map<String, String> testData = FileReading.readProperties(Constants.billpaymentservice + Constants.slash + "TC004");
       // LoginPage loginPage=new LoginPage(browser.getDriver());
       // loginPage.clickLoginButton();
        BillPaymentServicePage billPayPage = new BillPaymentServicePage(browser.getDriver());
        billPayPage.clickBillPayLabel("bill_pay");
        billPayPage.clickSendPaymentButton();
        billPayPage.validatePayeeNameEmptyMessageError(testData.get("payee_name_is_required"));
        billPayPage.validateAddressEmptyMessageError(testData.get("address_is_required"));
        billPayPage.validateCityEmptyMessageError(testData.get("city_is_required"));
        billPayPage.validateStateEmptyMessageError(testData.get("state_is_required"));
        billPayPage.validateZipCodeEmptyMessageError(testData.get("zip_code_is_required"));
        billPayPage.validatePhoneNumberEmptyMessage(testData.get("phone_number_is_required"));
        billPayPage.validateAccountEmptyMessage(testData.get("account_number_is_required"));
        billPayPage.validateFromAccountEmptyMessage(testData.get("Account_number_is_required"));
        billPayPage.validateAmountEmptyMessage(testData.get("the_amount_cannot_be_empty"));

        //All fields are empty
        //click on send payment button
        //validate error message
    }

}




