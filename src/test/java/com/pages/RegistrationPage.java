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

    @FindBy(tagName="h1")
    public WebElement lblRegistrationHeader;

    @FindBy(xpath = "//*[@id='rightPanel']/p/text()")
   // @FindBy(xpath = "//div[@id=\"rightPanel\"]//p")
    public WebElement RegistrationText;

    @FindBy(id="customer.firstName")
    public WebElement txtFirstName;

    @FindBy(id="customer.lastName")
    public WebElement txtLastName;

    @FindBy(id="customer.address.street")
    public WebElement txtAddress;

    @FindBy(id="customer.address.city")
    public WebElement txtCity;

    @FindBy(id="customer.address.state")
    public WebElement txtState;

    @FindBy(id="customer.address.zipCode")
    public WebElement ZipCode;

    @FindBy(id="customer.phoneNumber")
    public WebElement PhoneNumber;

    @FindBy(id="customer.ssn")
    public WebElement SSN;

    @FindBy(id="customer.username")
    public WebElement txtUsername;

    @FindBy(id="customer.password")
    public WebElement txtPassword;

    @FindBy(id="repeatedPassword")
    public WebElement txtConfirm;

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
    public void enterTxtFirstName(String firstName){
        Reporter.log("First Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        element.sendKeys(firstName);
        Reporter.log("First Name has been entered " + firstName);
    }
    public void enterTxtLastName(String lastName){
        Reporter.log("Last Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtLastName));
        element.sendKeys(lastName);
        Reporter.log("Last Name has been entered " + lastName);
    }
    public void enterTxtAddress(String address){
        Reporter.log("Address will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered " + address);
    }
    public void enterTxtCity(String city){
        Reporter.log("City will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City has been entered " + city);
    }
    public void enterTxtState(String state){
        Reporter.log("State will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State has been entered " + state);
    }
    public void enterZipCode(String zipCode){
        Reporter.log("ZipCode wll be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ZipCode));
        element.sendKeys(zipCode);
        Reporter.log("ZipCode has been entered " + zipCode);
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Phone Number will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(PhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("Phone Number has been entered " + phoneNumber);
    }
    public void enterSSN(String ssn){
        Reporter.log("SSN will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SSN));
        element.sendKeys(ssn);
        Reporter.log("SSN has been entered " + ssn);
    }
    public void enterTxtUsername(String username){
        Reporter.log("Username will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUsername));
        element.sendKeys(username);
        Reporter.log("Username has been entered " + username );
    }
    public void enterTxtPassword(String password){
        Reporter.log("Password will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPassword));
        element.sendKeys(password);
        Reporter.log("Password has been entered " + password);
    }
    public void enterTxtXConfirm(String repeatedPassword){
        Reporter.log("Re-enter Password will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtConfirm));
        element.sendKeys(repeatedPassword);
        Reporter.log("Re-enter Password has been entered " + repeatedPassword);
    }
    public void validateRegisterButtonLabel(String registerbtnlabel){
        Reporter.log("Register Button label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnRegister));
        Assert.assertEquals(element.getText(),registerbtnlabel);
        Reporter.log("Register Button label has been verified"+registerbtnlabel);
    }
    public void clickRegisterButton(){
        Reporter.log("Register Button will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnRegister));
        Reporter.log("Register Button Clicked");
        element.click();
    }
}
