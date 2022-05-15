package com.tests.billpayment;

import com.constants.Constants;
import com.pages.BillPaymentServicePage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class BillPaymentTestCases extends PrePost{
    @Test
    public void TC001_ValidateBillPayPageNevigation() {

            Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
            BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
            billPayPage.validateBillPayLabel(testData.get("bill_pay"));

            //click on bill pay link
           //validate the page

    }
    @Test
    public void TC002_ValidateAllFileds(){
        Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
        BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
        //billPayPage.validateBillPayLabel(testData.get("bill pay"));
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
        billPayPage.validateAllFieldsMessage("All fields are valid ");
    }

    @Test
    public void TC003_SuccessfullPayment() {
        Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
        BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
        public void TC004_InvalidPayeeName() {
            Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
            BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
            billPayPage.validateErrorMessage("Invalid Payee Name ");
            //enter invalid PayeeName
            //click on send Payment button
            //validate error message

        }
        @Test
        public void TC005_InvalidAccountNumber() {
            Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
            BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
            billPayPage.validateErrorMessage("Invalid Account Number:");

            //enter invalid account number
            //click on send payment button
            //validate error message
        }
        @Test
        public void TC006_EmptyTextFields(){
            Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
            BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
            billPayPage.clickSendPaymentButton();
            billPayPage.validateEmptyTextFieldsMessage("All fields are empty:");
            //All fields are empty
            //click on send payment button
            //validate error message
       }
       @Test
       public void TC007_InvalidVerifyAccountNumber(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid Verify Account Number:");
             //enter valid acoount number
             //enter invalid VerifyAccountNumber
             //click on send Payment button
             //validate error message
       }
       @Test
       public void TC008_InvalidPhoneNumber(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid phone number:");
             //enter all valid fileds
             //enter invalid phone Number
            //validate error message
       }
       @Test
       public void TC009_InvalidState(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid State:");
              //enter all valid fields
             //enter invalid State
            //validate error message
       }
       @Test
       public void TC010_InvalidCity(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid City:");
             //enter all valid fields
            //enter invalid city
           //validate error message
       }
       @Test
        public void TC011_InvalidZipCode(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid ZipCode:");
             //enter all valid fields
            //enter invalid zipcode
            //validate error message
       }
       @Test
       public void TC012_InvalidFromAccount(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateErrorMessage("Invalid From Account:");
            //enter all valid fields
            //enter invalid fromAccountId
            //validate error message
       }
       @Test
       public void TC013_SendPaymentButtonNotClickable(){
           Map<String,String> testData = FileReading.readProperties(Constants.billpaymentservice+Constants.slash+"TC001");
           BillPaymentServicePage billPayPage= new BillPaymentServicePage(browser.getDriver());
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
           billPayPage.validateSendPaymentButtonNotClickabel("Send Payment button is not clickable:");


            //enter all valid fields
            //SendPayment button not clickable
            //validate error message
       }


}
