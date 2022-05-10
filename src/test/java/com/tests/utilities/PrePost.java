package com.tests.utilities;

import com.constants.Constants;
import com.utility.Browser;
import com.utility.FileReading;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.util.HashMap;
import java.util.Map;

public class PrePost {
    public Browser browser = null;
    Map<String, String> environment = new HashMap<String, String>();

    @BeforeSuite
    public void beforeSuit(){
        String env = System.getProperty("env");
        if (env != null) {
            Constants.env = env;
        }
        String browser = System.getProperty("browser");
        if (browser != null) {
            Constants.browser = browser;
        }else {
            Constants.browser = "chrome";
        }
    }

    @BeforeTest
    public void beforeTest(){
        environment = FileReading.readEnvironment(Constants.env);
        Browser browser = new Browser();
        browser.launch();
        browser.maximize();
        browser.navigateUrl(environment.get("applicationUrl"));
        this.browser = browser;
    }
    @AfterTest
    public void afterTest(){
        this.browser.close();
    }
}