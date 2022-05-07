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
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h2[text()='Account Services']")
    public WebElement lblAccountServices;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[1]/a")
    public WebElement OpenNewAccount;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[2]/a")
    public WebElement AccountsOverView;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[3]/a")
    public WebElement TransferFunds;

    @FindBy(xpath = "//*[@id=\"leftPanel\"]/ul/li[4]/a")
    public WebElement BillPay;

    @FindBy(xpath = "//*[@id=\"leftPanel\"/ul/li[5]/a")
    public WebElement FindTransaction;

    @FindBy(xpath = "//*[@id=\"leftPanel\"/ul/li[6]/a")
    public WebElement UpdateContactInformation;

    @FindBy(xpath = "//*[@id=\"leftPanel\"/ul/li[7]/a")
    public WebElement RequestLoan;

    @FindBy(xpath = "//*[@id=\"leftPanel\"/ul/li[8]/a")
    public WebElement Logout;


    public AccountServicesPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }
    public void validateAccountServicesLabel(String accountservicesaabel){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAccountServices));
        Assert.assertEquals(element.getText(),accountservicesaabel);
        Reporter.log("Account Services Label is Verify" +element.getText());
    }
    public void ValidateOpenNewAccountLink(String opennewaccount){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(OpenNewAccount));
        Assert.assertEquals(element.getText(),opennewaccount);
        Reporter.log("Open New Account Link is Verify :"+element.getText());
    }
    public void ValidateAccountsOverviewLink(String accountoverview){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(AccountsOverView));
        Assert.assertEquals(element.getText(),accountoverview);
        Reporter.log("Accounts Overview Link is Verify :" + element.getText());
    }
    public void ValidateTransferfundsLink(String trasnferfunds) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(TransferFunds));
        Assert.assertEquals(element.getText(), trasnferfunds);
        Reporter.log("Transfer funds Link is Verify :" + element.getText());
    }
    public void ValidateBillpayLink(String billpay) {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(BillPay));
        Assert.assertEquals(element.getText(), billpay);
        Reporter.log("Bill Pay Link is Verify :" + element.getText());
    }
    public void ValidateFindtransactionsLink(String findtransactions){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(FindTransaction));
        Assert.assertEquals(element.getText(),findtransactions);
        Reporter.log("Find Transaction Link is verify :" +element.getText());
    }
    public void ValidagteupdatecontactinfoLink(String updatecontactdetails){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(UpdateContactInformation));
        Assert.assertEquals(element.getText(),updatecontactdetails);
        Reporter.log("Update Contact Info Link is Verify :" +element.getText());
    }
    public void ValidateRequestLoanLink(String requestloan){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(RequestLoan));
        Assert.assertEquals(element.getText(),requestloan);
        Reporter.log("Request Loan Link is Verify :"+ element.getText());
    }
    public void ValidateLogoutLink(String logout){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(Logout));
        Assert.assertEquals(element.getText(),logout);
        Reporter.log("Logout link is verify :" + element.getText());
    }

}