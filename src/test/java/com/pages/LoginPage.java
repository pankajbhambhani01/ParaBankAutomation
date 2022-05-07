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


        private WebDriver driver;
        private WebDriverWait wait;

        @FindBy(xpath = "//li[@class='Solutions']")
        public WebElement SolutionsHeader;

        @FindBy(xpath = "//a[@href='/parabank/admin.htm']")
        public WebElement lnkAboutUs;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[@href='services.htm']")
        public WebElement lnkServices;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[@href='http://www.parasoft.com/jsp/products.jsp']")
        public WebElement lnkProducts;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Locations']")
        public WebElement lnkLocations ;


        @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Admin Page']")
        public WebElement lnkAdminPage;

        @FindBy(xpath = "//h2[text()='Customer Login']")
        public WebElement lblCustomerLogin;

        @FindBy(xpath = "//b[.='Username']")
        public WebElement lblUsername ;

        @FindBy(xpath = "//input[@type='text'and@name='username']")
        public WebElement txtUsernameinputbox;


        @FindBy(xpath = "//b[.='Password']")
        public WebElement lblPassword;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement txtpasswordinput;

        @FindBy(xpath = "//input[@value='Log In']")
        public WebElement btnLogIn;

        @FindBy(xpath = "//a[.='Forgot login info?']")
        public WebElement lnkForgotlogininfo ;

        @FindBy(xpath = "//a[.='Register']")
        public WebElement lnkRegister;


        public LoginPage(WebDriver driver){
            this.driver = driver;
            this.wait = new WebDriverWait(driver, 60);
            PageFactory.initElements(driver, this);
        }

        public void validateSolutionsLabel(String SolutionsLabel){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(SolutionsHeader));
            Assert.assertEquals(element.getText(), SolutionsLabel);
            Reporter.log("Solutions Title has been verified " + element.getText());
        }

        public void validateAboutUslink (String AboutusLabel){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkAboutUs));
            Assert.assertEquals(element.getText(),AboutusLabel );
            Reporter.log("Aboutus Link has been verified " + element.getText());

        }
         public void clickAboutUslink (){
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkAboutUs));
            Reporter.log("Aboutus Link has been clicked" + element.getText());
            lnkAboutUs.click();
        }

        public void validateServicesLink(String ServicesLabel){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkServices));
            Assert.assertEquals(element.getText(),ServicesLabel);
            Reporter.log("Services Link has verified"+element.getText());
        }

    public void ServicesLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkServices));
        Reporter.log("Services Link has clicked"+element.getText());
        lnkServices.click();
    }

        public void validateProductLink(String ProductLabel){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkProducts));
            Assert.assertEquals(element.getText(),ProductLabel);
            Reporter.log("ProductLink has verified"+element.getText());
        }
        public void clickProductLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkProducts));
        Reporter.log("ProductLink has clicked"+element.getText());
        lnkProducts.click();
        }
        public void validateLocationLink(String LocationLabel){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkLocations));
            Assert.assertEquals(element.getText(),LocationLabel);
            Reporter.log("LocationLink has verified"+element.getText());

        }

    public void clickLocationLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkLocations));

        Reporter.log("LocationLink has clicked"+element.getText());
        lnkLocations.click();
    }

        public void validateAdminPageLink(String Adminpagelable){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkAdminPage));
            Assert.assertEquals(element.getText(), Adminpagelable);
            Reporter.log("Adminpagelink has verified"+element.getText());

        }

    public void clickAdminPageLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkAdminPage));
        Reporter.log("Adminpagelink has clicked"+element.getText());
        lnkAdminPage.click();
    }

        public void validateCustomerLabel(String CustomerLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCustomerLogin));
            Assert.assertEquals(element.getText(), CustomerLabel);
            Reporter.log("CustomerLabel Title has been verified " + element.getText());
        }



        public void validateUserNameLabel(String UserNameLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(lblUsername));
            Assert.assertEquals(element.getText(), UserNameLabel);
            Reporter.log("UserNameLabel Title has been verified " + element.getText());
        }

        public void enterUserName(String UserName){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(txtUsernameinputbox));
            element.sendKeys(UserName);
            Reporter.log(" UserName has been entered " + UserName);
        }

        public void validatePasswordLabel(String PasswordLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPassword));
            Assert.assertEquals(element.getText(),PasswordLabel );
            Reporter.log("PasswordLabel Title has been verified " + element.getText());
        }

        public void enterPassword(String Password){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(txtpasswordinput));
            element.sendKeys(Password);
            Reporter.log("Password has been entered " + Password);
        }

        public void validateLoginButton(String Loginbuttonlabel){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(btnLogIn));
            Assert.assertEquals(element.getText(),  Loginbuttonlabel);
            Reporter.log("LoginButton has verified"+element.getText());

        }

    public void clickLoginButton(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(btnLogIn));

        Reporter.log("LoginButton has clicked"+element.getText());
        btnLogIn.click();
    }



    public void validateForgotPasswordLink(String ForgotLoginlabel){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkForgotlogininfo));
            Assert.assertEquals(element.getText(), ForgotLoginlabel);
            Reporter.log("ForgotPasswordLink has verified"+element.getText());

        }
    public void clickForgotPasswordLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkForgotlogininfo));
        Reporter.log("ForgotPasswordLink has clicked"+element.getText());
        lnkForgotlogininfo.click();
    }

    public void validateRegisterLink(String RegisterLinklable){
            WebElement element=wait.until(ExpectedConditions.visibilityOf(lnkRegister));
            Assert.assertEquals(element.getText(), RegisterLinklable);
            Reporter.log("RegisterLink has verified"+element.getText());
        }
    public void clickRegisterLink(){
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(lnkRegister));
        Reporter.log("RegisterLink has clicked"+element.getText());
        lnkRegister.click();
    }



    }


