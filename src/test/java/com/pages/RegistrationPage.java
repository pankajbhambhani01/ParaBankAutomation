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
    public WebElement txtZipCode;

    @FindBy(id="customer.phoneNumber")
    public WebElement txtPhoneNumber;

    @FindBy(id="customer.ssn")
    public WebElement txtSSN;

    @FindBy(id="customer.username")
    public WebElement txtUsername;

    @FindBy(id="customer.password")
    public WebElement txtPassword;

    @FindBy(id="repeatedPassword")
    public WebElement txtConfirm;

    @FindBy(xpath = "//input[@class='button' and @value='Register']")
    public WebElement RegisterButton;



    public RegistrationPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateRegistrationLabel(String registrationLabel){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblRegistrationHeader));
        Assert.assertEquals(element.getText(), registrationLabel);
        Reporter.log("Registration Title has been verified " + element.getText());
    }

    public void enterTxtFirstName(String firstName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        element.sendKeys(firstName);
        Reporter.log("First Name has been entered " + firstName);
    }
    public void enterTxtLastName(String lastName){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtLastName));
        element.sendKeys(lastName);
        Reporter.log("Last Name has been entered " + lastName);
    }
    public void enterTxtAddress(String address){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered " + address);
    }
    public void enterTxtCity(String city){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("City has been entered " + city);
    }
    public void enterTxtState(String state){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State has been entered " + state);
    }
    public void enterTxtZipCode(String zipCode){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtZipCode));
        element.sendKeys(zipCode);
        Reporter.log("ZipCode has been entered " + zipCode);
    }
    public void enterTxtPhone(String phoneNumber){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPhoneNumber));
        element.sendKeys(phoneNumber);
        Reporter.log("Phone Number has been entered " + phoneNumber);
    }
    public void enterTxtSSN(String ssn){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtSSN));
        element.sendKeys(ssn);
        Reporter.log("SSN has been entered " + ssn);
    }
    public void enterTxtUsername(String username){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUsername));
        element.sendKeys(username);
        Reporter.log("Username has been entered " + username );
    }
    public void enterTxtPassword(String password){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPassword));
        element.sendKeys(password);
        Reporter.log("Password has been entered " + password);
    }
    public void enterTxtXConfirm(String repeatedPassword){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtConfirm));
        element.sendKeys(repeatedPassword);
        Reporter.log("Re-enter Password has been entered " + repeatedPassword);
    }
    public void enterTxtXREGISTER(String registerButton){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(RegisterButton));
        element.click();
    }

}
