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
    // varushali P
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
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPayeeName));
        Assert.assertEquals(element.getText(), billPaymentServiceLabel);
        Reporter.log("Bill Payment Service  :"+ element.getText());
    }
    public void enterPayeeName(String payeeName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPayeeName));
        element.sendKeys(payeeName);
        Reporter.log("Payee name has been entered:"+payeeName );
       // txtPayeeName.sendKeys(payeeName);

    }
    public void enterAddress(String address) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered:"+address);


        //txtAddress.sendKeys(address);
    }
    public void enterCity(String city){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City name has been entered:"+ city);

       // txtCity.sendKeys(city);
    }
    public void enterState(String state){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State name has been entered:"+ state);
        //txtState.sendKeys(state);

    }
    public void enterZipCode(String zipcode){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(zipCode));
        element.sendKeys(zipcode);
        Reporter.log("ZipCode has been entered:"+ zipcode);
        //zipCode.sendKeys(zipcode);
    }
    public void enterPhoneNumber(String phonenumber)
    {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(phoneNumber));
        element.sendKeys(phonenumber);
        Reporter.log("Phone number is:"+ phonenumber);
      //  phoneNumber.sendKeys(phonenumber);
    }

    public void enterAccountNumber(String accountnumber){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(accountNumber));
        element.sendKeys(accountnumber);
        Reporter.log("Account number is:"+ accountNumber);
       // accountNumber.sendKeys(accountnumber);
    }
    public void enterVerifyAccountNumebr(String verifyaccountNumber){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(verifyAccountNumber));
        element.sendKeys(verifyaccountNumber);
        Reporter.log("Verified account number is:"+ verifyaccountNumber);
    }
    public void enterAmount(String aamount){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(amount));
        element.sendKeys(aamount);
        Reporter.log("Amount is:"+aamount);
    }
    public void enterFromAccount(String fromaccountId){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(fromAccountId));
        element.sendKeys(fromaccountId);
    }
    public void clickSendPaymentButton(){
        btnSendPayment.click();

    }
    /*public WebElement getTxtPayeeName(){
        return txtPayeeName;
    }
    public WebElement getTxtAddress(){
        return txtAddress;
    }
    public WebElement getTxtCity(){
        return txtCity;
    }
    public WebElement getTxtState(){
        return txtState;


     }
     public WebElement getZipCode(){
        return zipCode;
    }
    public WebElement getPhoneNumber(){
        return phoneNumber;
    }
    public WebElement getAccountNumber(){
        return accountNumber;
    }
    public WebElement getAmount(){
        return amount;
    }
    public WebElement getVerifyAccountNumber(){
        return verifyAccountNumber;
    }
    public WebElement getFromAccount(){
        return fromAccount;
    }
    public WebElement getBtnSendPayment(){
        return btnSendPayment;
    }*/

    }

