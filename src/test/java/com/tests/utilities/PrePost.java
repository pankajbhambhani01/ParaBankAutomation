package com.tests.utilities;

import com.constants.Constants;
import com.utility.Browser;
import com.utility.FileReading;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;

import java.io.File;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class PrePost {
    public Browser browser = null;
    public Map<String, String> environment = new HashMap<String, String>();
    public Map<String, String> users = new HashMap<String, String>();

    @BeforeSuite
    public void beforeSuit() {
        String env = System.getProperty("env");
        if (env != null) {
            Constants.env = env;
        }
        String browser = System.getProperty("browser");
        if (browser != null) {
            Constants.browser = browser;
        } else {
            Constants.browser = "chrome";
        }
        environment = FileReading.readEnvironmentData(Constants.env, "env");
        users = FileReading.readEnvironmentData(Constants.env, "users");
    }

    @BeforeTest
    public void beforeTest() {
        Browser browser = new Browser();
        browser.launch();
        browser.maximize();
        browser.navigateUrl(environment.get("applicationUrl"));
        this.browser = browser;
    }

    @AfterTest
    public void afterTest() {
        takeScreenShot();
        this.browser.close();
    }

    public void takeScreenShot() {
        TakesScreenshot screenshot = ((TakesScreenshot) browser.getDriver());
        File srcScreenShot = screenshot.getScreenshotAs(OutputType.FILE);
        String date = (new Date()).toString();
        date = date.replaceAll(":", "_").replaceAll(" ", "_");
        File desScreenShot = new File("src/test/resources/ScreenShots/" + "SS_" + Constants.currentTCName + "_" + date + ".png");
        try {
            FileUtils.copyFile(srcScreenShot, desScreenShot);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
