package com.utilities;

import com.constants.Constants;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

public class PrePost {

    @BeforeSuite
    public void beforeSuit(){
        Constants.env = System.getProperty("env");
        String browser = System.getProperty("browser");
        if (browser != null) {
            Constants.browser = browser;
        }else{
            Constants.browser = "chrome";
        }
    }
}
