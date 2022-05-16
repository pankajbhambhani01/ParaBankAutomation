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
    public WebElement lblBillPaymentHeader;
    @FindBy(id="Bill Pay")
    public WebElement lblBillPay;
    @FindBy(id= "payee.name")
    public WebElement lblPayeeName;
    @FindBy(id="payee.name")
    public WebElement txtPayeeName;
    @FindBy(name="payee.address.street")
    public WebElement lblAddress;
    @FindBy(name="payee.address.street")
    public WebElement txtAddress;
    @FindBy(name="payee.adress.city")
    public WebElement lblCity;
    @FindBy(name="payee.address.city")
    public WebElement txtCity;
    @FindBy(name="payee.address.state")
    public WebElement lblState;
    @FindBy(name="payee.address.state")
    public WebElement txtState;
    @FindBy(name="payee.address.zipCode")
    public WebElement lblZipCode;
    @FindBy(id="payee.address.zipCode")
    public WebElement zipCode;
    @FindBy(name="payee.phoneNumber")
    public WebElement lblPhoneNumber;
    @FindBy(id="payee.phoneNumber")
    public WebElement phoneNumber;
    @FindBy(name="payee.accountNumber")
    public WebElement lblAccountNumber;
    @FindBy(name="payee.accountNumber")
    public WebElement accountNumber;
    @FindBy(name="verifyAccountNumber")
    public WebElement lblVerifyAccountNumber;
    @FindBy(name="verifyAccountNumber")
    public WebElement verifyAccountNumber;
    @FindBy(name="amount")
    public WebElement lblAmount;
    @FindBy(name="amount")
    public WebElement amount;
    @FindBy(name="fromAccountId")
    public WebElement lblFromAccountId;
    @FindBy(name="fromAccountId")
    public WebElement fromAccountId;
    @FindBy(className="button")
    public WebElement btnSendPayment;
    @FindBy(name="paymentSuccessfullTitle")
    public WebElement paymentsuccessfullTitle;
    @FindBy(name="errorMessage")
    public WebElement errorMessage;
    @FindBy(name="emptyTextFields")
    public WebElement emptyTextFields;
    @FindBy(name="sendpaymentnotClick")
    public WebElement sendpaymentnotClick;
    @FindBy(name="allFields")
    public WebElement allFields;
    @FindBy(name="payee.name.error")
    public WebElement payeeNameEmptyMessage;
    @FindBy(name="payee.address.street.error")
    public WebElement addressEmptyMessage;
    @FindBy(name="payee.address.city.error")
    public WebElement cityEmptyMessage;
    @FindBy(name="payee.address.state.error")
    public WebElement stateEmptyMessage;
    @FindBy(name="payee.address.zipCode.error")
    public WebElement zipCodeEmptyMessage;
    @FindBy(name="payee.phone.error")
    public WebElement phoneEmptyMessage;
    @FindBy(name="payee.accountNumber.error")
    public WebElement accountNumberEmptyMessage;
    @FindBy(name="verifyAccountNumber.error")
    public WebElement verifyAccountNumberEmptyMessage;
    @FindBy(name="amount.error")
    public WebElement amountEmptyMessage;
    @FindBy(name="fromAccountId.error")
    public WebElement fromAccountIDEmptyMessage;
   // @FindBy(id="Bill Pay")
    //public WebElement billPayLabel;


    public BillPaymentServicePage(WebDriver driver){
        this.driver = driver;
        this.wait =new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);

    }
    public void clickBillPayLabel(String lblbillPay){
        Reporter.log("Bill Pay label will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(lblBillPay));
        Assert.assertEquals(element.getText(),lblbillPay);
        Reporter.log("Bill pay label has been verified:"+element.getText());
    }
    public void validateBillPayLabel(String billPayLabel){
        Reporter.log("Bill Pay Title will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblBillPay));
        Assert.assertEquals(element.getText(),billPayLabel);
        Reporter.log("Bill Pay Title has been verified:"+ element.getText());
    }
    public void validateBillPaymentServiceLabel(String billPaymentServiceLabel) {
        Reporter.log("Bill Payment Service will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblBillPaymentHeader));
        Assert.assertEquals(element.getText(), billPaymentServiceLabel);
        Reporter.log("Bill Payment Service  has been verified:"+ element.getText());
    }
    public void validatePayeeName(String payeeNameLabel){
        Reporter.log("Payee name will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPayeeName));
        Assert.assertEquals(element.getText(),payeeNameLabel);
        Reporter.log("Payee Name has been verified:"+ element.getText());
    }
    public void enterPayeeName(String payeeName){
        Reporter.log("Payee name will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPayeeName));
        element.sendKeys(payeeName);
        Reporter.log("Payee name has been entered:"+payeeName );

    }
    public void validateAddress(String addressLabel){
        Reporter.log("Address will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf((lblAddress)));
        Assert.assertEquals(element.getText(),addressLabel);
        Reporter.log("Address has been verified:"+element.getText());
    }

    public void enterAddress(String address) {
        Reporter.log("Address will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered:"+address);

    }
    public void validateCity(String cityLabel){
        Reporter.log("City will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCity));
        Assert.assertEquals(element.getText(),cityLabel);
        Reporter.log("City has been verified:"+element.getText());
    }
    public void enterCity(String city){
        Reporter.log("City name will be entered:");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City name has been entered:"+ city);

    }
    public void validateState(String stateLabel){
        Reporter.log("State will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblState));
        Assert.assertEquals(element.getText(),stateLabel);
        Reporter.log("State has been verified:"+element.getText());

    }
    public void enterState(String state){
        Reporter.log("State name will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State name has been entered:"+ state);

    }
    public void validateZipCode(String zipcodeLabel){
        Reporter.log("ZipCode will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblZipCode));
        Assert.assertEquals(element.getText(),zipcodeLabel);
        Reporter.log("ZipCode has been verified:"+element.getText());


    }
    public void enterZipCode(String zipcode){
        Reporter.log("Zipcode will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(zipCode));
        element.sendKeys(zipcode);
        Reporter.log("ZipCode has been entered:"+ zipcode);

    }
    public void validatePhoneNumber(String phonenumberLabel){
        Reporter.log("Phone number will be verified:");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(lblPhoneNumber));
        Assert.assertEquals(element.getText(),phonenumberLabel);
        Reporter.log("Phone number has been verified:"+element.getText());
    }

        public void enterPhoneNumber(String phonenumber)
    {
        Reporter.log("Phone number will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(phoneNumber));
        element.sendKeys(phonenumber);
        Reporter.log("Phone number has been entered:"+ phonenumber);
    }
    public void validateAccountNumber(String accountnumberLabel) {
        Reporter.log(("Account number will be verified:"));
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAccountNumber));
        Assert.assertEquals(element.getText(), accountnumberLabel);
        Reporter.log("Account number has been verified:" + element.getText());
    }

    public void enterAccountNumber(String accountnumber){
        Reporter.log("Account number will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(accountNumber));
        element.sendKeys(accountnumber);
        Reporter.log("Account number has been entered:"+ accountNumber);
    }
    public void validateVerifyAccountNumber(String verifyaccountNumberLabel){
        Reporter.log("Verify account number will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(verifyAccountNumber));
        Assert.assertEquals(element.getText(),lblVerifyAccountNumber);
        Reporter.log("VerifyAccountNumber has been verified:"+element.getText());
    }
    public void enterVerifyAccountNumber(String verifyaccountNumber){
        Reporter.log("Verified account number will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(verifyAccountNumber));
        element.sendKeys(verifyaccountNumber);
        Reporter.log("Verified account number has been entered:"+ verifyaccountNumber);
    }
    public void validateAmount(String amountLabel){
        Reporter.log("Amount will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAmount));
        Assert.assertEquals(element.getText(),amountLabel);
        Reporter.log("Amount has been verified:"+element.getText());
    }
    public void enterAmount(String aamount){
        Reporter.log("Amount will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(amount));
        element.sendKeys(aamount);
        Reporter.log("Amount has been entered:"+aamount);
    }
    public void validateFromAccountId(String fromAccountIdLabel){
        Reporter.log("From account Id will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblFromAccountId));
        Assert.assertEquals(element.getText(),fromAccountIdLabel);
        Reporter.log("From account Id has been verified:"+element.getText());
    }
    public void enterFromAccount(String fromaccount){
        Reporter.log("From account will be entered:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(fromAccountId));
        element.sendKeys(fromaccount);
        Reporter.log("From Account has been entered:"+fromaccount);
    }
    public void validateSendPaymentButtonLabel(String lblSendPay){
        Reporter.log("Send Payment label will be verified:");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(btnSendPayment));
        Assert.assertEquals(element.getText(),lblSendPay);
        Reporter.log("Send payment label has been verified:"+element.getText());

    }
    public void clickSendPaymentButton() {
        Reporter.log("Send Payment button will be clicked");
        WebElement element= wait.until(ExpectedConditions.visibilityOf(btnSendPayment));
        Reporter.log("Send Payment button  clicked:");
        element.click();
    }
     public void validatePaymentSuccessfullyTitle(String paymentsuccesfullTitlelbl){
         Reporter.log("Payment Successfully Title will be verified:");
         WebElement element =wait.until(ExpectedConditions.visibilityOf(paymentsuccessfullTitle));
         Assert.assertEquals(element.getText(),paymentsuccesfullTitlelbl);
         Reporter.log("Payment Successfully Title has been verified:"+element.getText());

    }
    public void validateErrorMessage(String errorMessageTitle){
        Reporter.log("Error message will be verified:");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(errorMessage));
        Assert.assertEquals(element.getText(),errorMessageTitle);
        Reporter.log("Error message has been verified:"+element.getText());
    }
    public void validateEmptyTextFieldsMessage(String emptytextFields){
        Reporter.log("Empty text fields will be verified:");
        WebElement element =wait.until(ExpectedConditions.visibilityOf(emptyTextFields));
        Assert.assertEquals(element.getText(),emptytextFields);
        Reporter.log("Empty text fields has been verified:"+element.getText());
    }
    public void validateSendPaymentButtonNotClickabel(String btnNotClick){
        Reporter.log("Send Payment button will not be verified:");
        WebElement element =wait.until(ExpectedConditions.visibilityOf(sendpaymentnotClick));
        Assert.assertEquals(element.getText(),btnNotClick);
        Reporter.log("Send Payment button has not verified:"+element.getText());
    }
    public void validateAllFieldsMessage(String allFieldsLabel){
        Reporter.log("All fields will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(allFields));
        Assert.assertEquals(element.getText(),allFieldsLabel);
        Reporter.log("All fields has been verified:"+element.getText());
    }
    public void validatePayeeNameEmptyMessageError(String payeeName){
        Reporter.log("Payee name required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(payeeNameEmptyMessage));
        Assert.assertEquals(element.getText(),payeeName);
        Reporter.log("Payee name required has been verified:"+element.getText());
    }
    public void validateAddressEmptyMessageError(String emptyAddress){
        Reporter.log("Address required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(addressEmptyMessage));
        Assert.assertEquals(element.getText(),emptyAddress);
        Reporter.log("Address required has been verified:"+element.getText());

    }
    public void validateCityEmptyMessageError(String emptyCity){
        Reporter.log("City required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(cityEmptyMessage));
        Assert.assertEquals(element.getText(),emptyCity);
        Reporter.log("City required has been verified:"+element.getText());
    }
    public void validateStateEmptyMessageError(String emptyState){
        Reporter.log("State required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(stateEmptyMessage));
        Assert.assertEquals(element.getText(),emptyState);
        Reporter.log("State required has been verified:"+element.getText());

    }
    public void validateZipCodeEmptyMessageError(String emptyZipCode){
        Reporter.log("ZipCode required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(zipCodeEmptyMessage));
        Assert.assertEquals(element.getText(),emptyZipCode);
        Reporter.log("ZipCode required has been verified:"+element.getText());

    }
    public void validatePhoneNumberEmptyMessage(String emptyPhone){
        Reporter.log("Phone number required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(phoneEmptyMessage));
        Assert.assertEquals(element.getText(),emptyPhone);
        Reporter.log("Phone number required has been verified:"+element.getText());
    }
    public void validateAccountEmptyMessage(String emptyAccount){
        Reporter.log("Account number required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(accountNumberEmptyMessage));
        Assert.assertEquals(element.getText(),emptyAccount);
        Reporter.log("Account number required has been verified:"+element.getText());
    }
    public void validateVerifyAccountEmptyMessage(String emptyVerifyAccount){
        Reporter.log("Verify account required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(verifyAccountNumberEmptyMessage));
        Assert.assertEquals(element.getText(),emptyVerifyAccount);
        Reporter.log("Verify account required has been verified:"+element.getText());
    }
    public void validateAmountEmptyMessage(String emptyAmount){
        Reporter.log("Amount required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(amountEmptyMessage));
        Assert.assertEquals(element.getText(),emptyAmount);
        Reporter.log("Amount required has been verified:"+element.getText());
    }
    public void validateFromAccountEmptyMessage(String emptyFromAccount){
        Reporter.log("From account required will be verified:");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(fromAccountIDEmptyMessage));
        Assert.assertEquals(element.getText(),emptyFromAccount);
        Reporter.log("From account required has been verified:"+element.getText());
    }



    }

