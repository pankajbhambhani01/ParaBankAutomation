package com.tests.login;

import com.constants.Constants;
import com.tests.utilities.PrePost;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.Reporter;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTestCases extends PrePost {

    @Test
    public void TC001_ValidateAllLablesOnLoginScreen(){
        Reporter.log(browser.getDriver().toString()) ;
        Reporter.log("Running my first test");
    }
}
