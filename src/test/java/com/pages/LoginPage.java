package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class LoginPage {
    // Abhijit R

    @FindBy(xpath = "//li[@class='Solutions']")
    public WebElement SolutionsHeader;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[.='About Us']")
    public WebElement lnkAboutUs;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Services']")
    public WebElement lnkServices;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Products']")
    public WebElement lnkProducts;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Locations']")
    public WebElement lnkLocations;
    @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Admin Page']")
    public WebElement lnkAdminPage;
    @FindBy(xpath = "//h2[text()='Customer Login']")
    public WebElement lblCustomerLogin;
    @FindBy(xpath = "//b[.='Username']")
    public WebElement lblUsername;
    @FindBy(xpath = "//input[@type='text'and@name='username']")
    public WebElement txtUsernameinputbox;
    @FindBy(xpath = "//b[.='Password']")
    public WebElement lblPassword;
    @FindBy(xpath = "//input[@name='password']")
    public WebElement txtpasswordinput;
    @FindBy(xpath = "//input[@value='Log In']")
    public WebElement btnLogIn;
    @FindBy(xpath = "//a[.='Forgot login info?']")
    public WebElement lnkForgotlogininfo;
    @FindBy(xpath = "//a[.='Register']")
    public WebElement lnkRegister;
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement error_tittle;
    @FindBy(xpath = "//p[@class='error'and text()='The username and password could not be verified.']")
    public WebElement errormessageWrong;
    @FindBy(xpath = "//p[@class='error'and text()='Please enter a username and password.']")
    public WebElement errormessageForBlank;

    @FindBy(xpath = "//h1[@class='title'and text()='Accounts Overview']")
    public WebElement accountOverViewTittle;

    @FindBy(xpath = "//h1[@class='title'and text()='ParaSoft Demo Website'] ")
    public WebElement parasoftPageTittle;

    @FindBy(xpath = "//span[@class='heading'and text()='Available Bookstore SOAP services:'] ")
    public WebElement servicesPageTittle;

    @FindBy(xpath = "//h2[@class='text-center 'and text()='Solutions for Every Testing Need'] ")
    public WebElement productPageTittle;




    private WebDriver driver;
    private WebDriverWait wait;


    public LoginPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateSolutionsLabel(String SolutionsLabel) {
        Reporter.log("Solutions Title will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(SolutionsHeader));
        Assert.assertEquals(element.getText(), SolutionsLabel);
        Reporter.log("Solutions Title has been verified " + element.getText());
    }

    public void validateAboutUslink(String AboutusLabel) {
        Reporter.log("Aboutus Link will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkAboutUs));
        Assert.assertEquals(element.getText(), AboutusLabel);
        Reporter.log("Aboutus Link has been verified " + element.getText());

    }

    public void clickAboutUslink() {
        Reporter.log("Aboutus Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkAboutUs));
        lnkAboutUs.click();
        Reporter.log("Aboutus Link has been clicked");
    }

    public void validateServicesLink(String ServicesLabel) {
        Reporter.log("Services Link will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkServices));
        Assert.assertEquals(element.getText(), ServicesLabel);
        Reporter.log("Services Link has been verified" + element.getText());
    }


    public void clickServicesLink() {
        Reporter.log("Services Link will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkServices));
        lnkServices.click();
        Reporter.log("Services Link has been clicked");
    }

    public void validateProductLink(String ProductLabel) {
        Reporter.log("ProductLink will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkProducts));
        Assert.assertEquals(element.getText(), ProductLabel);
        Reporter.log("ProductLink has been verified" + element.getText());
    }

    public void clickProductLink() {
        Reporter.log("ProductLink will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkProducts));
        lnkProducts.click();
        Reporter.log("ProductLink has been clicked");
    }

    public void validateLocationLink(String LocationLabel) {
        Reporter.log("LocationLink will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkLocations));
        Assert.assertEquals(element.getText(), LocationLabel);
        Reporter.log("LocationLink has been verified" + element.getText());
    }

    public void clickLocationLink() {
        Reporter.log("LocationLink will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkLocations));
        lnkLocations.click();
        Reporter.log("LocationLink has been clicked");
    }

    public void validateAdminPageLink(String Adminpagelable) {
        Reporter.log("Adminpagelink will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkAdminPage));
        Assert.assertEquals(element.getText(), Adminpagelable);
        Reporter.log("Adminpagelink has been verified" + element.getText());
    }

    public void clickAdminPageLink() {
        Reporter.log("Adminpagelink will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkAdminPage));
        lnkAdminPage.click();
        Reporter.log("Adminpagelink has been clicked");
    }

    public void validateCustomerLabel(String CustomerLabel) {
        Reporter.log("CustomerLabel Title will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCustomerLogin));
        Assert.assertEquals(element.getText(), CustomerLabel);
        Reporter.log("CustomerLabel Title has been verified " + element.getText());
    }

    public void validateUserNameLabel(String UserNameLabel) {
        Reporter.log("UserNameLabel Title will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblUsername));
        Assert.assertEquals(element.getText(), UserNameLabel);
        Reporter.log("UserNameLabel Title has been verified " + element.getText());
    }

    public void enterUserName(String UserName) {
        Reporter.log(" UserName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUsernameinputbox));
        element.sendKeys(UserName);
        Reporter.log(" UserName has been entered " + UserName);
    }

    public void validatePasswordLabel(String PasswordLabel) {
        Reporter.log("PasswordLabel Title will be verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPassword));
        Assert.assertEquals(element.getText(), PasswordLabel);
        Reporter.log("PasswordLabel Title has been verified " + element.getText());
    }

    public void enterPassword(String Password) {
        Reporter.log("Password will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtpasswordinput));
        element.sendKeys(Password);
        Reporter.log("Password has been entered " + Password);
    }

    public void validateLoginButton(String Loginbuttonlabel) {
        Reporter.log("LoginButton will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnLogIn));
        Assert.assertEquals(element.getText(), Loginbuttonlabel);
        Reporter.log("LoginButton has verified" + element.getText());
    }

    public void clickLoginButton() {
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnLogIn));
        Reporter.log("LoginButton will be clicked");
        btnLogIn.click();
        Reporter.log("LoginButton has been clicked");
    }

    public void validateForgotPasswordLink(String ForgotLoginlabel) {
        Reporter.log("ForgotPasswordLink will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkForgotlogininfo));
        Assert.assertEquals(element.getText(), ForgotLoginlabel);
        Reporter.log("ForgotPasswordLink has been verified" + element.getText());
    }

    public void clickForgotPasswordLink() {
        Reporter.log("ForgotPasswordLink will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkForgotlogininfo));
        lnkForgotlogininfo.click();
        Reporter.log("ForgotPasswordLink has been clicked");
    }

    public void validateRegisterLink(String RegisterLinklable) {
        Reporter.log("RegisterLink will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkRegister));
        Assert.assertEquals(element.getText(), RegisterLinklable);
        Reporter.log("RegisterLink has been verified" + element.getText());
    }

    public void clickRegisterLink() {
        Reporter.log("RegisterLink will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkRegister));
        lnkRegister.click();
        Reporter.log("RegisterLink has been clicked");
    }
    public void validateErrorMessageTittle(String errorTittle){
        Reporter.log("Error tittle will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(error_tittle));
        Assert.assertEquals(element.getText(), errorTittle);
        Reporter.log("Error tittle has been verified");
    }

    public void validateWrongErrorMessage(String errorwrMessage){
        Reporter.log("Error message for wrong username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(errormessageWrong));
        Assert.assertEquals(element.getText(), errorwrMessage);
        Reporter.log("Error message for wrong username or passwaord has been verified");
    }

    public void validateBlankErrorMessage(String errorMessage){
        Reporter.log("Error message for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(errormessageForBlank));
        Assert.assertEquals(element.getText(), errorMessage);
        Reporter.log("Error message for blank username or passwaord has been verified");
    }
    public void validateAccountOverViewTittle(String accountoverviewTittlelbl){
        Reporter.log("AccountOverview tittle will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(accountOverViewTittle));
        Assert.assertEquals(element.getText(),accountoverviewTittlelbl);
        Reporter.log("AccountOverview has been verified"+element.getText());
    }

    public void validateParasoftTittle(String paraSoftWebsiteTittle){
        Reporter.log("Parasoft Tittle for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(parasoftPageTittle));
        Assert.assertEquals(element.getText(), paraSoftWebsiteTittle);
        Reporter.log("Parasoft Tittle for blank username or passwaord has been verified");
    }
    public void validateServicePageTittle(String ServicePageTittle){
        Reporter.log("Services PageTittle for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(servicesPageTittle));
        Assert.assertEquals(element.getText(), ServicePageTittle);
        Reporter.log("Services PageTittle for blank username or passwaord has been verified");
    }

    public void validateProductPageTittle(String ProductPageTittle){
        Reporter.log("Services PageTittle for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(productPageTittle));
        Assert.assertEquals(element.getText(), ProductPageTittle);
        Reporter.log("Services PageTittle for blank username or passwaord has been verified");
    }

    public void validateLocationPageTittle(String LocationPageTittle){
        Reporter.log("Services PageTittle for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(productPageTittle));
        Assert.assertEquals(element.getText(), LocationPageTittle);
        Reporter.log("Services PageTittle for blank username or passwaord has been verified");
    }

    public void validateAdminstrationPageTittle(String AdminstrationPageTittle){
        Reporter.log("Adminstration PageTittle for blank username or passwaord will be verified");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(productPageTittle));
        Assert.assertEquals(element.getText(), AdminstrationPageTittle);
        Reporter.log("Adminstration PageTittle for blank username or passwaord has been verified");
    }










}


