package com.tests.fundtransfer;

import com.constants.Constants;
import com.pages.AccountServicesPage;
import com.pages.LoginPage;
import com.pages.TransferFundsPage;
import com.pages.UpdateProfilePage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

public class FundTransferTestCases extends PrePost {
    @Test
    public void TC001_validateTransferFunds() {
        Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
        transferFundsPage.enterUserName();
        transferFundsPage.enterPassword();
        transferFundsPage.clickBtnLogin();

        /*String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);*/

        transferFundsPage.validateLblTransferFunds(testData.get("Transfer Funds"));
    }

    @Test
    public void TC002_clickLnkTransferFunds() {
        Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
        transferFundsPage.enterUserName();
        transferFundsPage.enterPassword();
        transferFundsPage.clickBtnLogin();
        /*String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);*/
        transferFundsPage.clickTransferFunds();
    }

    @Test
    public void TC003_validateTitle() {
        Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC001");
        LoginPage loginPage = new LoginPage(browser.getDriver());
        TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());
        transferFundsPage.enterUserName();
        transferFundsPage.enterPassword();
        transferFundsPage.clickBtnLogin();
        /*String[] userDetail = users.get("user2").split(";");
        loginPage.loginParaBank(userDetail[0], userDetail[1]);*/
        transferFundsPage.validateTitle(testData.get("Transfer Funds"));
    }

}
