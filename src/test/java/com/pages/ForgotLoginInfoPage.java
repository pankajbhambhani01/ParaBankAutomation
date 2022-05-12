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
    @FindBy(xpath = "//input[@id='firstName']")
    public WebElement txtenterFirstname;
    @FindBy(xpath = "//input[@id='lastName']")
    public WebElement txtenterLastname;
    @FindBy(xpath = "//input[@id='address.street']")
    public WebElement txtenterAddress;
    @FindBy(xpath = "//input[@id='address.city']")
    public WebElement txtenterCity;
    @FindBy(xpath = "//input[@id='address.state']")
    public WebElement txtenterState;
    @FindBy(xpath = "//input[@id='address.zipCode']")
    public WebElement txtenterZipCode;
    @FindBy(xpath = "//input[@id='ssn']")
    public WebElement txtenterssn;
    @FindBy(xpath = "//input[@value='Find My Login Info']")
    public WebElement findMylogininfoBt;
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

    public void enterFirstName(String FirstName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterFirstname));
        element.sendKeys(FirstName);
        Reporter.log(" UserName has been entered " + FirstName);
    }

    public void enterLastName(String LastName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterLastname));
        element.sendKeys(LastName);
        Reporter.log(" UserName has been entered " + LastName);
    }

    public void enterAddress(String Address) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterAddress));
        element.sendKeys(Address);
        Reporter.log(" UserName has been entered " + Address);
    }

    public void enterCity(String CityName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterCity));
        element.sendKeys(CityName);
        Reporter.log(" UserName has been entered " + CityName);
    }

    public void enterState(String StateName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterState));
        element.sendKeys(StateName);
        Reporter.log(" UserName has been entered " + StateName);
    }

    public void enterZipCode(String Zipcode) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterZipCode));
        element.sendKeys(Zipcode);
        Reporter.log(" UserName has been entered " + Zipcode);
    }

    public void enterSSN(String SSN) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtenterssn));
        element.sendKeys(SSN);
        Reporter.log(" UserName has been entered " + SSN);
    }

    public void validateFindMYLoginInfo(String findMylogininfobuttonlabel) {
        Reporter.log("FindMylogininfoBtnLbl will be verified");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findMylogininfoBt));
        Assert.assertEquals(element.getText(), findMylogininfobuttonlabel);
        Reporter.log("FindMylogininfoBtnLbl has been verified" + findMylogininfobuttonlabel);


    }

    public void clickFindMYLoginInfo() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(findMylogininfoBt));
        Reporter.log("FindMylogininfoBtn will be clicked");
        findMylogininfoBt.click();
        Reporter.log("FindMylogininfoBtn has been clicked");

    }
}
