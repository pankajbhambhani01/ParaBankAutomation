package com.tests.utilities;

import com.constants.Constants;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

public class Listeners implements ITestListener {
    public void onTestStart(ITestResult iTestResult) {
        Reporter.log("Test cases has started " + iTestResult.getName());
    }

    public void onTestSuccess(ITestResult iTestResult) {
        Reporter.log("Test cases has been Passed " + iTestResult.getName());
        Constants.passedCount = Constants.passedCount + 1;
        System.out.println("Current Execution Status : Passed " + Constants.passedCount + " Failed " + Constants.failedCount);
    }

    public void onTestFailure(ITestResult iTestResult) {
        Reporter.log("Test cases has been Failed " + iTestResult.getName());
        Constants.failedCount = Constants.failedCount + 1;
        System.out.println("Current Execution Status : Passed " + Constants.passedCount + " Failed " + Constants.failedCount);
    }

    public void onTestSkipped(ITestResult iTestResult) {

    }

    public void onTestFailedButWithinSuccessPercentage(ITestResult iTestResult) {

    }

    public void onStart(ITestContext iTestContext) {

    }

    public void onFinish(ITestContext iTestContext) {

    }
}
