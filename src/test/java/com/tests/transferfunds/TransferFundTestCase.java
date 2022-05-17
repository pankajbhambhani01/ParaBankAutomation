package com.tests.transferfunds;

import com.constants.Constants;
import com.pages.AccountServicesPage;
import com.pages.LoginPage;
import com.pages.TransferFundsPage;
import com.pages.UpdateProfilePage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.testng.annotations.Test;

import java.util.Map;

    public class TransferFundTestCase extends PrePost {
        //Prashant Gujar

        @Test
        public void TC001_validateTransferFundNavigation() {
            Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC001");
            LoginPage loginPage = new LoginPage(browser.getDriver());
            AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
            TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());

            String[] userDetail = users.get("user3").split(";");
            loginPage.loginParaBank(userDetail[0], userDetail[1]);
            transferFundsPage.validateLnkTransferFunds(testData.get("titleTransferFunds"));
            transferFundsPage.clickTxtTransferFunds();
            transferFundsPage.validatePageTitle(testData.get("titleTransferFunds"));

        }

        @Test
        public void TC002_enterEmptyAmount() {
            Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC001");
            LoginPage loginPage = new LoginPage(browser.getDriver());
            AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
            TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());

            String[] userDetail = users.get("user3").split(";");
            loginPage.loginParaBank(userDetail[0], userDetail[1]);
            transferFundsPage.validateLnkTransferFunds(testData.get("titleTransferFunds"));
            transferFundsPage.clickTxtTransferFunds();
            transferFundsPage.validatePageTitle(testData.get("titleTransferFunds"));
            transferFundsPage.validatelblAmount(testData.get());
        }

}
