package com.tests.login;

import org.testng.annotations.Test;

public class UpdateProfileTestCase {
    //Abhijit Raoot

    @Test
    public void TC001_validateUpdateProfileNavigation(){
        //enter username password
        //click on loginBtn
        //click on updateProfile Link
        //validate all elements of updateProfile Page
    }
    @Test
    public void TC002_allFieldValidation(){
        //enter username password
        //click on loginBtn
       // click on updateProfile Link
        //enter all Field with correct information
        //click on updateButton
        //validate message
     }

    public  void TC003_allFiledValidationErrorMessage(){
        //enter username password
        //click on loginButton
        // click on updateProfile Link
        //click on updateButton
        //validate message


    }
    public  void TC004_someFieldBlank(){
        //enter username password
        //click on loginBtn
        // click on updateProfile Link
        //enter name,city,zipcode with correct information
        //click on updateButton
        //validate message


    }
    public  void TC005_validationWithSameInformation() {
        //enter username password
        //click on loginBtn
        // click on updateProfile Link
        //enter all field with previous information
        //click on updateButton
        //validate message

    }

    }
