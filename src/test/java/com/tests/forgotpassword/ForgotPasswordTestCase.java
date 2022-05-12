package com.tests.forgotpassword;

import org.testng.annotations.Test;

public class ForgotPasswordTestCase {
    //Abhijit raoot

    @Test
    public void TC001_validateForgotPasswordLinkNavigation(){
        //click on Forgot Password Info? Link
        //validate Customer Page appered.
    }

    @Test
    public void TC002_entercorrectInfoInFieldForgotPassword(){
        //click on Forgot Password Info? Link
        //enter All Field with correct information
        //click on FindMylogininfoBtn
        //validate message

    }

    @Test
    public void TC003_enterWrongInfoInFieldForgotPassword(){
        //click on Forgot Password Info? Link
        //enter All Field with wrong information
        //click on FindMylogininfoBtn
        //validate message

    }

    @Test
    public void TC004_enterSomeFieldBlankINForgotPassword(){
        //click on Forgot Password Info? Link
        //enter name city phonenumber Field with wrong information
        //click on FindMylogininfoBtn
        //validate message

    }


    @Test
    public void TC005_KeepAllFieldBlankINForgotPassword(){
        //click on Forgot Password Info? Link
        //click on FindMylogininfoBtn
        //validate message

    }

}
