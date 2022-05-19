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
        public void TC002_validateAllElementsOnPage() {
            Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC002");
            LoginPage loginPage = new LoginPage(browser.getDriver());
            AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
            TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());

            String[] userDetail = users.get("user3").split(";");
            loginPage.loginParaBank(userDetail[0], userDetail[1]);
            transferFundsPage.clickTxtTransferFunds();
            transferFundsPage.validatePageTitle(testData.get("titleTransferFunds"));
            transferFundsPage.validateLblAmount(testData.get("lblAmount"));
            transferFundsPage.validateLblDollor(testData.get("lblDollor"));
            transferFundsPage.validateLblFromAcount(testData.get("lblFromAccount"));
            transferFundsPage.validateDdFromAccount();
            transferFundsPage.validateLblToAcount(testData.get("lblToAccount"));
            transferFundsPage.validateDdToAccount();
            transferFundsPage.validateLblBtnTransfer(testData.get("lblTransfer"));
            }

        @Test
        public void TC003_EnteringValidDataInAllElementsOnPage() {
            Map<String, String> testData = FileReading.readProperties(Constants.transferfunds + Constants.slash + "TC003");
            LoginPage loginPage = new LoginPage(browser.getDriver());
            AccountServicesPage accountServicesPage = new AccountServicesPage(browser.getDriver());
            TransferFundsPage transferFundsPage = new TransferFundsPage(browser.getDriver());

            String[] userDetail = users.get("user3").split(";");
            loginPage.loginParaBank(userDetail[0], userDetail[1]);
            transferFundsPage.clickTxtTransferFunds();
            transferFundsPage.validatePageTitle(testData.get("titleTransferFunds"));
            transferFundsPage.clickInputTxtAmount();
      //      transferFundsPage.enterValidAmount();
            transferFundsPage.selectDdFromAccount(Integer.parseInt(testData.get("intFromAccount")));
            transferFundsPage.selectDdToAccount(Integer.parseInt(testData.get("intToAccount")));
            transferFundsPage.clickBtnTransfer();
      //      transferFundsPage.validateSuccessfulMassage();
        }

    }
