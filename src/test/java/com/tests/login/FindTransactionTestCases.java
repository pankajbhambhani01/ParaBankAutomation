package com.tests.login;

import com.constants.Constants;
import com.pages.FindTransactionsPage;
import com.pages.LoginPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.util.Map;

import static com.constants.Constants.browser;

@Listeners(com.tests.utilities.Listeners.class)
public class FindTransactionTestCases extends PrePost {
//-------sadik shitole----//
Map<String, String> testData = FileReading.readProperties(Constants.login + Constants.slash + "TC001");
    LoginPage loginPage = new LoginPage(browser.getDriver());

    public WebDriver driver;
    @Test
    public void TC001_validFindByTransactionID(){

        // enter username
        // enter password
        // click login
        // validate home page
        //click  find Transaction
        // enter TransactionId
        // click FindTransaction
        // Validate Find Transaction page
        Map<String, String> testData = FileReading.readProperties("TC001");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByTransactionId("14121");
        findTransactionPage.btnFindTransaction2.click();
    }

    @Test
    public void TC002_InvalidFindByTransactionID(){
        // enter username
        // enter password
        // click login
        // validate home page
        //click  find Transaction
        // enter wrong TransactionId
        //  click FindTransaction
        // validate error message
        Map<String, String> testData = FileReading.readProperties("TC002");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByTransactionId("1234");
        findTransactionPage.btnFindTransaction2.click();
    }

    @Test
    public void TC003_ValidFindByDate(){
        // enter username
        // enter password
        // click login
        // validate home page
        //enter TransactionDate
        // click FindTransaction
        // Validate transaction Result Page
        Map<String, String> testData = FileReading.readProperties("TC003");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByDate("12-04-2022");
        findTransactionPage.btnFindTransaction3.click();
    }
    @Test
    public void TC004_InvalidFindByDate(){
        // enter username
        // enter password
        // click login
        // validate home page
        // enter wrong TransactionDate
        //  click FindTransaction
        // validate error message
        Map<String, String> testData = FileReading.readProperties("TC004");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByDate("2022-12-04");
        findTransactionPage.btnFindTransaction3.click();
    }
    @Test
    public void TC005_ValidFindByDateRange(){
        // enter username
        // enter password
        // click login
        // validate home page
        //enter  between TransactionDate
        //enter  and TransactionDate
        // click FindTransaction
        // Validate transaction Result Page
        Map<String, String> testData = FileReading.readProperties("TC005");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByDateRange("01-01-2022","02-02-2022");
        findTransactionPage.btnFindTransaction4.click();
    }
    @Test
    public void TC006_InvalidFindByDateRange(){
        // enter username
        // enter password
        // click login
        // validate home page
        //enter  wrong between TransactionDate
        //enter  wrong and TransactionDate
        // click FindTransaction
        // validate error message
        Map<String, String> testData = FileReading.readProperties("TC006");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByDateRange("2022-01-02","2022-03-03");
        findTransactionPage.btnFindTransaction4.click();
    }

    @Test
    public void TC007_ValidFindByAmount(){
        // enter username
        // enter password
        // click login
        // validate home page
        //enter TransactionAmount
        // click FindTransaction
        // Validate transaction Result Page
        Map<String, String> testData = FileReading.readProperties("TC007");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByAmount("12000");
        findTransactionPage.btnFindTransaction5.click();
    }
    @Test
    public void TC008_InvalidFindByAmount(){
        // enter username
        // enter password
        // click login
        //enter  wrong TransactionAmount
        // click FindTransaction
        // validate error message
        Map<String, String> testData = FileReading.readProperties("TC008");
        LoginPage loginPage=new LoginPage(browser.getDriver());
        loginPage.enterUserName("");
        loginPage.enterPassword("");
        loginPage.clickLoginButton();
        loginPage.validateAccountOverViewTittle("");
        FindTransactionsPage findTransactionPage=new FindTransactionsPage(browser.getDriver());
        findTransactionPage.lblFindTransactionHeader.click();
        findTransactionPage.enterFindByAmount("120000000");
        findTransactionPage.btnFindTransaction5.click();
    }
}
