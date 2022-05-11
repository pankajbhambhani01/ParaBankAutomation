package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class BillPaymentServicePage {
    // Vrushali Patil
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(tagName ="h1")
    public WebElement lblBillPayHeader;

    @FindBy(id="payee.name")
    public WebElement txtPayeeName;

    @FindBy(name="payee.address.street")
    public WebElement txtAddress;

    @FindBy(name="payee.address.city")
    public WebElement txtCity;

    @FindBy(name="payee.address.state")
    public WebElement txtState;

    @FindBy(id="payee.address.zipCode")
    public WebElement zipCode;

    @FindBy(id="payee.phoneNumber")
    public WebElement phoneNumber;

    @FindBy(name="payee.accountNumber")
    public WebElement accountNumber;

    @FindBy(name="verifyAccountNumber")
    public WebElement verifyAccountNumber;

    @FindBy(name="amount")
    public WebElement amount;

    @FindBy(name="fromAccountId")
    public WebElement fromAccountId;

    @FindBy(className="button")
    public WebElement btnSendPayment;


    public BillPaymentServicePage(WebDriver driver){
        this.driver = driver;
        this.wait =new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);

    }
    public void validateBillPaymentServicePage(String billPaymentServiceLabel) {
        Reporter.log("Bill Payment Service will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblBillPayHeader));
        Assert.assertEquals(element.getText(), billPaymentServiceLabel);
        Reporter.log("Bill Payment Service  has been verified:"+ element.getText());
    }
    public void enterPayeeName(String payeeName){
        Reporter.log("Payee name has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPayeeName));
        element.sendKeys(payeeName);
        Reporter.log("Payee name has been entered:"+payeeName );

    }
    public void enterAddress(String address) {
        Reporter.log("Address has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered:"+address);

    }
    public void enterCity(String city){
        Reporter.log("City name has been entered:");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City name has been entered:"+ city);

    }
    public void enterState(String state){
        Reporter.log("State name has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State name has been entered:"+ state);

    }
    public void enterZipCode(String zipcode){
        Reporter.log("Zipcode has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(zipCode));
        element.sendKeys(zipcode);
        Reporter.log("ZipCode has been entered:"+ zipcode);

    }
    public void enterPhoneNumber(String phonenumber)
    {
        Reporter.log("Phone number has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(phoneNumber));
        element.sendKeys(phonenumber);
        Reporter.log("Phone number has been entered:"+ phonenumber);
    }

    public void enterAccountNumber(String accountnumber){
        Reporter.log("Account number has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(accountNumber));
        element.sendKeys(accountnumber);
        Reporter.log("Account number has been entered:"+ accountNumber);
    }
    public void enterVerifyAccountNumebr(String verifyaccountNumber){
        Reporter.log("Verified account number has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(verifyAccountNumber));
        element.sendKeys(verifyaccountNumber);
        Reporter.log("Verified account number has been entered:"+ verifyaccountNumber);
    }
    public void enterAmount(String aamount){
        Reporter.log("Amount has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(amount));
        element.sendKeys(aamount);
        Reporter.log("Amount has been entered:"+aamount);
    }
    public void enterFromAccount(String fromaccountId){
        Reporter.log("From account has been entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(fromAccountId));
        element.sendKeys(fromaccountId);
        Reporter.log("From Account has been entered:"+fromaccountId);
    }
    public void clickSendPaymentButton(String btnSendpayment){
        Reporter.log("Send Payment button  clicked");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnSendPayment));
        element.sendKeys(btnSendpayment);
        Reporter.log("Send Payment button  clicked:"+btnSendPayment);
        btnSendPayment.click();

    }

    }