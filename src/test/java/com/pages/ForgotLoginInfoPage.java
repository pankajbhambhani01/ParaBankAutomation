package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ForgotLoginInfoPage {

    @FindBy(xpath = "//h1[.='Customer Lookup']")
    public WebElement CustomerLookupTittle;
    @FindBy(xpath = "//p[.='Please fill out the following information in order to validate your account.']")
    public WebElement Commandlinetittle;

    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[1]/td[1]/b")
    public WebElement lblFirstname;
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement txtenterFirstname;

    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[2]/td[1]/b")
    public WebElement lblLastname;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement txtenterLastname;
    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[3]/td[1]/b")
    public WebElement lblAddress;
    @FindBy(xpath = "//input[@id='address.street']")
    public WebElement txtenterAddress;
    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[4]/td[1]/b")
    public WebElement lblCity;
    @FindBy(xpath = "//input[@id='address.city']")
    public WebElement txtenterCity;
    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[5]/td[1]/b")
    public WebElement lblState;
    @FindBy(xpath = "//input[@id='address.state']")
    public WebElement txtenterState;
    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[6]/td[1]/b")
    public WebElement lblZipCode;
    @FindBy(xpath = "//input[@id='address.zipCode']")
    public WebElement txtenterZipCode;
    @FindBy(xpath = "//*[@id=\"lookupForm\"]/table/tbody/tr[7]/td[1]/b")
    public WebElement lblSsn;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement txtenterssn;
    @FindBy(xpath = "//input[@value='Find My Login Info']")
    public WebElement findMylogininfoBt;

    @FindBy(xpath = "    //span[@id='firstName.errors']")
    public WebElement FirstNameBlankMessage;

    @FindBy(xpath = "//span[@id='lastName.errors']")
    public WebElement LastNameBlankMessage;

    @FindBy(xpath = "//span[@id='address.street.errors']")
    public WebElement AddressBlankMessage;

    @FindBy(xpath = "//span[@id='address.city.errors']")
    public WebElement CityBlankMessage;

    @FindBy(xpath = "//span[@id='address.state.errors']")
    public WebElement StateBlankMessage;

    @FindBy(xpath = "//span[@id='address.zipCode.errors']")
    public WebElement ZipCodeBlankMessage;

    @FindBy(xpath = "//span[@id='ssn.errors']")
    public WebElement SSNBlankMessage;


    @FindBy(xpath = "")
    public WebElement successMessage;
    @FindBy(xpath = "//div[@id=\"rightPanel\"]/p")
    public WebElement wrongInfoMessage;


    //Abhijt Raoot
    private WebDriver driver;
    private WebDriverWait wait;


    public ForgotLoginInfoPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateCustomerTittle(String customertittle) {
        Reporter.log("customertittle will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(CustomerLookupTittle));
        Assert.assertEquals(element.getText(), customertittle);
        Reporter.log("customertittle  has been verified " + element.getText());
    }


    public void validateCommandLine(String commandline) {
        Reporter.log("commandline tittle will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(Commandlinetittle));
        Assert.assertEquals(element.getText(), commandline);
        Reporter.log("commandline tittle  has been verified " + commandline);
    }

    public void validateFirstNameLabel(String firstNameLabel){
        Reporter.log("Firstname label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblFirstname));
        Assert.assertEquals(element.getText(),firstNameLabel);
        Reporter.log("Firstname label has been verified"+firstNameLabel);
    }


    public void enterFirstName(String FirstName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterFirstname));
        element.sendKeys(FirstName);
        Reporter.log(" UserName has been entered " + FirstName);
    }

    public void validatedFirstNameBlankErrorMessage(String firstNameBlankMessage){
        Reporter.log("First Name BlankMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(FirstNameBlankMessage));
        Assert.assertEquals(element.getText(),firstNameBlankMessage);
        Reporter.log("First Name BlankMessage has been verified" + element.getText());
    }

    public void validateLASTNameLabel(String lastNameLabel){
        Reporter.log("Lastname label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblLastname));
        Assert.assertEquals(element.getText(),lastNameLabel);
        Reporter.log("Lastname label has been verified"+lastNameLabel);
    }


    public void enterLastName(String LastName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterLastname));
        element.sendKeys(LastName);
        Reporter.log(" UserName has been entered " + LastName);
    }

    public void validatedLastNameBlankErrorMessage(String lastNameBlankErrorMessage) {
        Reporter.log("Last Name BlankMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(LastNameBlankMessage));
        Assert.assertEquals(element.getText(), lastNameBlankErrorMessage);
        Reporter.log("Last Name BlankMessage has been verified" + element.getText());
    }

    public void validateAddressLabel(String AddressLabel){
        Reporter.log("Address label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAddress));
        Assert.assertEquals(element.getText(),AddressLabel);
        Reporter.log("Address label has been verified"+AddressLabel);
    }

    public void enterAddress(String Address) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterAddress));
        element.sendKeys(Address);
        Reporter.log(" UserName has been entered " + Address);
    }

    public void validatedAddressBlankErrorMessage(String addressErrorMessage) {
        Reporter.log("Address Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(AddressBlankMessage));
        Assert.assertEquals(element.getText(), addressErrorMessage);
        Reporter.log("Address Blank Error Message has been verified" + element.getText());
    }
    public void validateCityLabel(String cityLabel){
        Reporter.log("city label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCity));
        Assert.assertEquals(element.getText(),cityLabel);
        Reporter.log("city label has been verified"+cityLabel);
    }

    public void enterCity(String CityName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterCity));
        element.sendKeys(CityName);
        Reporter.log(" UserName has been entered " + CityName);
    }
    public void validatedCityBlankErrorMessage(String cityErrorMessage) {
        Reporter.log("city Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(CityBlankMessage));
        Assert.assertEquals(element.getText(), cityErrorMessage);
        Reporter.log("city Blank Error Message has been verified" + element.getText());
    }
    public void validateStateLabel(String stateLabel){
        Reporter.log("state label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblState));
        Assert.assertEquals(element.getText(),stateLabel);
        Reporter.log("state label has been verified"+stateLabel);
    }

    public void enterState(String StateName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterState));
        element.sendKeys(StateName);
        Reporter.log(" UserName has been entered " + StateName);
    }

    public void validatedStateBlankErrorMessage(String stateErrorMessage) {
        Reporter.log("State Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(StateBlankMessage));
        Assert.assertEquals(element.getText(), stateErrorMessage);
        Reporter.log("State Blank Error Message has been verified" + element.getText());
    }

    
    public void validateZipCodeLabel(String zipcodeLabel){
        Reporter.log("Zipcode label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblZipCode));
        Assert.assertEquals(element.getText(),zipcodeLabel);
        Reporter.log("Zipcode label has been verified"+zipcodeLabel);
    }

    public void enterZipCode(String Zipcode) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterZipCode));
        element.sendKeys(Zipcode);
        Reporter.log(" UserName has been entered " + Zipcode);
    }

    public void validatedZipCodeBlankErrorMessage(String zipcodeErrorMessage) {
        Reporter.log("Zip Code Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ZipCodeBlankMessage));
        Assert.assertEquals(element.getText(), zipcodeErrorMessage);
        Reporter.log("Zip Code Blank Error Message has been verified" + element.getText());
    }
    public void validateSSNLabel(String ssnLabel){
        Reporter.log("Zipcode label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblSsn));
        Assert.assertEquals(element.getText(),ssnLabel);
        Reporter.log("Zipcode label has been verified"+ssnLabel
        );
    }

    public void enterSSN(String SSN) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterssn));
        element.sendKeys(SSN);
        Reporter.log(" UserName has been entered " + SSN);
    }

    public void validatedSSNBlankErrorMessage(String ssnErrorMessage) {
        Reporter.log("SSN Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SSNBlankMessage));
        Assert.assertEquals(element.getText(), ssnErrorMessage);
        Reporter.log("SSN Blank Error Message has been verified" + element.getText());
    }

    public void validateFindMYLoginInfoBtn(String findMylogininfobuttonlabel) {
        Reporter.log("FindMylogininfoBtnLbl will be verified");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findMylogininfoBt));
        Assert.assertEquals(element.getAttribute("value"), findMylogininfobuttonlabel);
        Reporter.log("FindMylogininfoBtnLbl has been verified" + findMylogininfobuttonlabel);


    }

    public void clickFindMYLoginInfo() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findMylogininfoBt));
        Reporter.log("FindMylogininfoBtn will be clicked");
        findMylogininfoBt.click();
        Reporter.log("FindMylogininfoBtn has been clicked");
    }
    public void validatforgotSucssesMessage(String sucessesmessage){
        Reporter.log("forgotSucssesMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertEquals(element.getText(),sucessesmessage);
        Reporter.log("forgotSucssesMessage  has been verified"+sucessesmessage);
    }

    public void validateWrongInfoMessage(String wronginfomessage){
        Reporter.log("WrongInfoMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(wrongInfoMessage));
        Assert.assertEquals(element.getText(),wronginfomessage);
        Reporter.log("WrongInfoMessage  has been verified"+wronginfomessage);
    }





}
