package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.internal.WebElementToJsonConverter;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class RegistrationPage {
    // Prashant B
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h1[@class='title'and text()='Signing up is easy!']")
    public WebElement lblRegistrationHeader;

    @FindBy(xpath = "//*[@id='rightPanel']/p/text()")
   // @FindBy(xpath = "//div[@id=\"rightPanel\"]//p")
    public WebElement RegistrationText;

    @FindBy(xpath = "//tr/td/b[text()='First Name:']")
    public WebElement lblFirstName;

    @FindBy(id="customer.firstName")
    public WebElement txtFirstName;

    @FindBy(xpath = "//span[@id='customer.firstName.errors']")
    public WebElement FirstNameBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Last Name:']")
    public WebElement lblLastName;

    @FindBy(id="customer.lastName")
    public WebElement txtLastName;

    @FindBy(xpath = "//span[@id='customer.lastName.errors']")
    public WebElement LastNameBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Address:']")
    public WebElement lblAddress;

    @FindBy(id="customer.address.street")
    public WebElement txtAddress;

    @FindBy(xpath = "//span[@id='customer.address.street.errors']")
    public WebElement AddressBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='City:']")
    public WebElement lblCity;

    @FindBy(id="customer.address.city")
    public WebElement txtCity;

    @FindBy(xpath = "//span[@id='customer.address.city.errors']")
    public WebElement CityBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='State:']")
    public WebElement lblState;

    @FindBy(id="customer.address.state")
    public WebElement txtState;

    @FindBy(xpath = "//span[@id='customer.address.state.errors']")
    public WebElement StateBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Zip Code:']")
    public WebElement lblZipCode;

    @FindBy(id="customer.address.zipCode")
    public WebElement ZipCode;

    @FindBy(xpath = "//span[@id='customer.address.zipCode.errors']")
    public WebElement ZipCodeBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Phone #:']")
    public WebElement lblPhone;

    @FindBy(id="customer.phoneNumber")
    public WebElement PhoneNumber;

    @FindBy(xpath = "//tr/td/b[text()='SSN:']")
    public WebElement lblSSN;

    @FindBy(id="customer.ssn")
    public WebElement SSN;

    @FindBy(xpath = "//span[@id='customer.ssn.errors']")
    public WebElement SSNBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Username:']")
    public WebElement lblUsername;

    @FindBy(id="customer.username")
    public WebElement txtUsername;

    @FindBy(xpath = "//span[@id='customer.username.errors']")
    public WebElement UsernameBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Password:']")
    public WebElement lblPassword;

    @FindBy(id="customer.password")
    public WebElement txtPassword;

    @FindBy(xpath = "//span[@id='customer.password.errors']")
    public WebElement PasswordBlankMessage;

    @FindBy(xpath = "//tr/td/b[text()='Confirm:']")
    public WebElement lblConfirm;

    @FindBy(id="repeatedPassword")
    public WebElement txtConfirm;

    @FindBy(xpath = "//span[@id='repeatedPassword.errors']")
    public WebElement ConfirmBlankMessage;

    @FindBy(xpath = "//input[@class='button' and @value='Register']")
    public WebElement btnRegister;


    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateRegistrationLabel(String registrationLabel){
        Reporter.log("Registration Title will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblRegistrationHeader));
        Assert.assertEquals(element.getText(), registrationLabel);
        Reporter.log("Registration Title has been verified " + element.getText());
    }
    public void validateRegistrationText(String registrationText){
        Reporter.log("Registration Text will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(RegistrationText));
        Assert.assertEquals(element.getText(), registrationText);
        Reporter.log("Registration Text has been verified " + element.getText());
    }
    public void validateFirstNameLabel(String firstnameLabel){
        Reporter.log("First Name label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblFirstName));
        Assert.assertEquals(element.getText(),firstnameLabel);
        Reporter.log("First Name label has been verified" + element.getText());
    }

    public void enterTxtFirstName(String firstName){
        Reporter.log("First Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        element.sendKeys(firstName);
        Reporter.log("First Name has been entered " + firstName);
    }
    public void validatedFirstNameBlankErrorMessage(String firstnameisrequired){
        Reporter.log("First Name Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(FirstNameBlankMessage));
        Assert.assertEquals(element.getText(),firstnameisrequired);
        Reporter.log("First Name Is Required has been verified" + element.getText());
    }
    public void validateLastNameLabel(String lastnameLabel){
        Reporter.log("Last Name label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblLastName));
        Assert.assertEquals(element.getText(),lastnameLabel);
        Reporter.log("Last Name label has been verified" + element.getText());
    }
    public void enterTxtLastName(String lastName){
        Reporter.log("Last Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtLastName));
        element.sendKeys(lastName);
        Reporter.log("Last Name has been entered " + lastName);
    }
    public void validatedLastNameBlankErrorMessage(String lastnameisrequired) {
        Reporter.log("Last Name Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(LastNameBlankMessage));
        Assert.assertEquals(element.getText(), lastnameisrequired);
        Reporter.log("Last Name Is Required has been verified" + element.getText());
    }
    public void validateAddressLabel(String addressLabel){
        Reporter.log("Address label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAddress));
        Assert.assertEquals(element.getText(),addressLabel);
        Reporter.log("Address label has been verified" + element.getText());
    }
    public void enterTxtAddress(String address){
        Reporter.log("Address will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered " + address);
    }
    public void validatedAddressBlankErrorMessage(String addressisrequired) {
        Reporter.log("Address Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(AddressBlankMessage));
        Assert.assertEquals(element.getText(), addressisrequired);
        Reporter.log("Address Is Required has been verified" + element.getText());
    }
    public void validateCityLabel(String cityLabel){
        Reporter.log("City label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCity));
        Assert.assertEquals(element.getText(),cityLabel);
        Reporter.log("City label has been verified" + element.getText());
    }
    public void enterTxtCity(String city){
        Reporter.log("City will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City has been entered " + city);
    }
    public void validatedCityBlankErrorMessage(String cityisrequired) {
        Reporter.log("City Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(CityBlankMessage));
        Assert.assertEquals(element.getText(), cityisrequired);
        Reporter.log("City Is Required has been verified" + element.getText());
    }
    public void validateStateLabel(String stateLabel) {
        Reporter.log("State label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblState));
        Assert.assertEquals(element.getText(), stateLabel);
        Reporter.log("State label has been verified" + element.getText());
    }
    public void enterTxtState(String state){
        Reporter.log("State will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State has been entered " + state);
    }
    public void validatedStateBlankErrorMessage(String stateisrequired) {
        Reporter.log("State Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(StateBlankMessage));
        Assert.assertEquals(element.getText(), stateisrequired);
        Reporter.log("State Is Required has been verified" + element.getText());
    }
    public void validateZipCodeLabel(String zipcodeLabel) {
        Reporter.log("ZipCode label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblZipCode));
        Assert.assertEquals(element.getText(), zipcodeLabel);
        Reporter.log("ZipCode label has been verified" + element.getText());
    }
    public void enterZipCode(String zipCode){
        Reporter.log("ZipCode wll be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ZipCode));
        element.sendKeys(zipCode);
        Reporter.log("ZipCode has been entered " + zipCode);
    }
    public void validatedZipCodeBlankErrorMessage(String zipcodeisrequired) {
        Reporter.log("Zip Code Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ZipCodeBlankMessage));
        Assert.assertEquals(element.getText(), zipcodeisrequired);
        Reporter.log("Zip Code Is Required has been verified" + element.getText());
    }
    public void validatePhoneLabel(String phoneLabel) {
        Reporter.log("Phone label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPhone));
        Assert.assertEquals(element.getText(), phoneLabel);
        Reporter.log("Phone label has been verified" + element.getText());
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Phone Number will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("Phone Number has been entered " + phoneNumber);
    }
    public void validateSSNLabel(String ssnLabel) {
        Reporter.log("SSN label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblSSN));
        Assert.assertEquals(element.getText(), ssnLabel);
        Reporter.log("SSN label has been verified" + element.getText());
    }
    public void enterSSN(String ssn){
        Reporter.log("SSN will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SSN));
        element.sendKeys(ssn);
        Reporter.log("SSN has been entered " + ssn);
    }
    public void validatedSSNBlankErrorMessage(String ssnisrequired) {
        Reporter.log("SSN Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SSNBlankMessage));
        Assert.assertEquals(element.getText(), ssnisrequired);
        Reporter.log("SSN Is Required has been verified" + element.getText());
    }
    public void validateUsernameLabel(String usernameLabel) {
        Reporter.log("Username label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblUsername));
        Assert.assertEquals(element.getText(), usernameLabel);
        Reporter.log("Username label has been verified" + element.getText());
    }
    public void enterTxtUsername(String username){
        Reporter.log("Username will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUsername));
        element.sendKeys(username);
        Reporter.log("Username has been entered " + username );
    }
    public void validatedUsernameBlankErrorMessage(String usernameisrequired) {
        Reporter.log("Username Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(UsernameBlankMessage));
        Assert.assertEquals(element.getText(), usernameisrequired);
        Reporter.log("Username Is Required has been verified" + element.getText());
    }
    public void validatePasswordLabel(String passwordLabel) {
        Reporter.log("Password label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPassword));
        Assert.assertEquals(element.getText(), passwordLabel);
        Reporter.log("Password label has been verified" + element.getText());
    }
    public void enterTxtPassword(String password){
        Reporter.log("Password will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPassword));
        element.sendKeys(password);
        Reporter.log("Password has been entered " + password);
    }
    public void validatedPasswordBlankErrorMessage(String passwordisrequired) {
        Reporter.log("Password Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(PasswordBlankMessage));
        Assert.assertEquals(element.getText(), passwordisrequired);
        Reporter.log("Password Is Required has been verified" + element.getText());
    }
    public void validateConfirmLabel(String confirmLabel) {
        Reporter.log("Confirm label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblConfirm));
        Assert.assertEquals(element.getText(), confirmLabel);
        Reporter.log("Confirm label has been verified" + element.getText());
    }
    public void enterTxtXConfirm(String repeatedPassword){
        Reporter.log("Re-enter Password will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtConfirm));
        element.sendKeys(repeatedPassword);
        Reporter.log("Re-enter Password has been entered " + repeatedPassword);
    }
    public void validatedConfirmBlankErrorMessage(String passwordconfirmationisrequired) {
        Reporter.log("Password Confirmation Is Required will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ConfirmBlankMessage));
        Assert.assertEquals(element.getText(), passwordconfirmationisrequired);
        Reporter.log("Password Confirmation Is Required has been verified" + element.getText());
    }
    public void validateRegisterButtonLabel(String registerbtnlabel){
        Reporter.log("Register Button label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnRegister));
        Assert.assertEquals(element.getText(),registerbtnlabel);
        Reporter.log("Register Button label has been verified"+ element.getText());
    }
    public void clickRegisterButton(){
        Reporter.log("Register Button will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
        Reporter.log("Register Button Clicked");
        element.click();
    }
}
