package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;


public class AccountServicesPage {
    //sachin k


    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h2[text()='Account Services']")
    public WebElement lblAccountServices;

    @FindBy(xpath = "//a[@href='/parabank/openaccount.htm']")
    public WebElement lnkOpenNewAccount;

    @FindBy(xpath = "//a[@href='/parabank/overview.htm']")
    public WebElement lnkAccountsOverView;

    @FindBy(xpath = "//a[@href='/parabank/transfer.htm']")
    public WebElement lnkTransferFunds;

    @FindBy(xpath = "//a[@href='/parabank/billpay.htm']")
    public WebElement lnkBillPay;

    @FindBy(xpath = "//a[@href='/parabank/findtrans.htm']")
    public WebElement lnkFindTransaction;

    @FindBy(xpath = "//a[@href='/parabank/updateprofile.htm']")
    public WebElement lnkUpdateContactInformation;

    @FindBy(xpath = "//a[@href='/parabank/requestloan.htm']")
    public WebElement lnkRequestLoan;

    @FindBy(xpath = "//a[@href='/parabank/logout.htm']")
    public WebElement lnkLogout;

    public AccountServicesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }
    public void validateAccountServicesLabel(String accountservicesaabel) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAccountServices));
        Assert.assertEquals(element.getText(), accountservicesaabel);
        Reporter.log("Account Services Label is Verify" + element.getText());
    }
    public void ValidateOpenNewAccountLink(String opennewaccount) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkOpenNewAccount));
        Assert.assertEquals(element.getText(), opennewaccount);
        Reporter.log("Open New Account Link is Verify :" + element.getText());
    }
    public void ClickOpenNewAccountLink() {
        Reporter.log("Open New Account Link will be Clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkOpenNewAccount));
        lnkOpenNewAccount.click();
        Reporter.log("Open New Account Link is Click");

    }
    public void ValidateAccountsOverviewLink(String accountoverview) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkAccountsOverView));
        Assert.assertEquals(element.getText(), accountoverview);
        Reporter.log("Accounts Overview Link is Verify :" + element.getText());
    }
    public void ClickAccountsOverviewLink() {
        Reporter.log("Accounts Overview Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkAccountsOverView));
        lnkAccountsOverView.click();
        Reporter.log("Accounts Overview Link is Click");

    }
    public void ValidateTransferfundsLink(String trasnferfunds) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFunds));
        Assert.assertEquals(element.getText(), trasnferfunds);
        Reporter.log("Transfer funds Link is Verify :" + element.getText());
    }
    public void ClickTransferfundsLink(){
        Reporter.log("Transfer Funds Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFunds));
        lnkTransferFunds.click();
        Reporter.log("Transfer Funds Link is Click");
    }
    public void ValidateBillpayLink(String billpay) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkBillPay));
        Assert.assertEquals(element.getText(), billpay);
        Reporter.log("Bill Pay Link is Verify :" + element.getText());
    }
    public void ClickBillpayLink(){
        Reporter.log("Bill Pay Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkBillPay));
        lnkBillPay.click();
        Reporter.log("Bill Pay Link is Click");
    }
    public void ValidateFindtransactionsLink(String findtransactions){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkFindTransaction));
        Assert.assertEquals(element.getText(),findtransactions);
        Reporter.log("Find Transaction Link is verify :" +element.getText());
    }
    public void ClickFindtransactionsLink(){
        Reporter.log("Find Transaction Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkFindTransaction));
        lnkFindTransaction.click();
        Reporter.log("Find Transaction Link is Click");
    }
    public void ValidateupdatecontactinfoLink(String updatecontactdetails){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkUpdateContactInformation));
        Assert.assertEquals(element.getText(),updatecontactdetails);
        Reporter.log("Update Contact Info Link is Verify :" +element.getText());
    }
    public void ClickUpdateContactInfoLink(){
        Reporter.log("Update Contact Information Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkUpdateContactInformation));
        lnkUpdateContactInformation.click();
        Reporter.log("Update Contact Information Link is Click");

    }
    public void ValidateRequestLoanLink(String requestloan){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkRequestLoan));
        Assert.assertEquals(element.getText(),requestloan);
        Reporter.log("Request Loan Link is Verify :"+ element.getText());
    }
    public void ClickRequestLoanLink(){
        Reporter.log("Request Loan Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkRequestLoan));
        lnkRequestLoan.click();
        Reporter.log("Request Loan Link is Click");
    }
    public void ValidateLogoutLink(String logout){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
        Assert.assertEquals(element.getText(),logout);
        Reporter.log("Logout link is verify :" + element.getText());
    }
    public void ClickLogoutLink(){
        Reporter.log("Logout Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkLogout));
        lnkLogout.click();
        Reporter.log("Logout Link is Click");
    }
}