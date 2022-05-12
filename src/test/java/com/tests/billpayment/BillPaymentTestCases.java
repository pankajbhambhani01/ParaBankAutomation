package com.tests.billpayment;

import com.pages.BillPaymentServicePage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class BillPaymentTestCases {
    @Test
    public void TC001_ValidateBillPayPageNevigation() {
        //click on bill pay link
        //validate the page

    }

    @Test
    public void TC002_SucessfullPayment() {
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
        public void TC003_InvalidPayeeName() {
            //enter invalid PayeeName
            //click on send Payment button
            //validate error message

        }
        @Test
        public void TC004_InvalidAccountNumber() {
            //enter invalid account number
            //click on send send payment button
            //validate error message
        }
        @Test
        public void TC005_EmptyTextFields(){
            //All fields are empty
            //click on send payment button
            //validate error message
       }
       @Test
       public void TC006_InvalidVerifyAccountNumber(){
             //enter valid acoount number
             //enter invalid VerifyAccountNumber
             //click on send Payment button
             //validate error message
       }
       @Test
       public void TC007_InvalidPhoneNumber(){
             //enter all valid fileds
             //enter invalid phone Number
            //validate error message
       }
       @Test
       public void TC008_InvalidState(){
              //enter all valid fields
             //enter invalid State
            //validate error message
       }
       @Test
       public void TC009_InvalidCity(){
             //enter all valid fields
            //enter invalid city
           //validate error message
       }
       @Test
        public void TC010_InvalidZipCode(){
             //enter all valid fields
            //enter invalid zipcode
            //validate error message
       }
       @Test
       public void TC011_InvalidFromAccount(){
            //enter all valid fields
            //enter invalid fromAccountId
            //validate error message
       }
       @Test
       public void TC012_SendPaymentButtonNotClickable(){
            //enter all valid fields
            //SendPayment button not clickable
            //validate error message
       }


}
