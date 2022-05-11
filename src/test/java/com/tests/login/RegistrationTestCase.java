package com.tests.login;

import org.testng.annotations.Test;

public class RegistrationTestCase {

    @Test
    public void TC001_ValidateRegistrationPageNavigation(){
        //Click On Registration Link
        //Validate The Page
    }
    @Test
    public void TC002_AllFieldsValidation_Lable_Textboxes_Button(){
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
    }
    @Test
    public void TC003_AllFiledsErrorMessageValidation(){
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
    }
    @Test
    public void TC004_SomeFiledsErrorMessageValidation(){
        //Enter Text First name
        //Enter Text Last Name
        //Enter Text Address
        //Enter Text City
        //Enter Text State
        //Enter Text ZipCode
        //Enter Text Phone
        //Enter Text SSN
        //Enter Text Username
        //Enter Text Password
        //Enter Text Confirm
        //Click On REGISTER Button
        //Validate Error Message
    }
    @Test
    public void TC005_Already_Used_Username_ErrorMessageValidation(){
            //Enter All Valid Field
           //Click On Register Button
          // Validate Error Message
}
