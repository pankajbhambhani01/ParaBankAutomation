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
        public WebElement AboutUslink;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[@href='services.htm']")
        public WebElement Services;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[@href='http://www.parasoft.com/jsp/products.jsp']")
        public WebElement Products;

        @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Locations']")
        public WebElement Locations ;


        @FindBy(xpath = "//ul[@class='leftmenu']//a[.='Admin Page']")
        public WebElement AdminPage;

        @FindBy(xpath = "//h2[text()='Customer Login']")
        public WebElement CustomerLogin;

        @FindBy(xpath = "//b[.='Username']")
        public WebElement Username ;

        @FindBy(xpath = "//input[@type='text'and@name='username']")
        public WebElement Usernameinputbox;


        @FindBy(xpath = "//b[.='Password']")
        public WebElement Password;

        @FindBy(xpath = "//input[@name='password']")
        public WebElement passwordinput;

        @FindBy(xpath = "//input[@value='Log In']")
        public WebElement LogInbutton;

        @FindBy(xpath = "//a[.='Forgot login info?']")
        public WebElement Forgotlogininfolink ;

        @FindBy(xpath = "//a[.='Register']")
        public WebElement Registerlink;


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

        public void AboutUslink (String AboutusLabel){
            WebElement element = wait.until(ExpectedConditions.elementToBeClickable(AboutUslink));
            Assert.assertEquals(element.getText(),AboutusLabel );
            Reporter.log("Aboutus Link has been verified " + element.getText());
            AboutUslink.click();
        }

        public void validateServices(String ServicesLabel){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Services));
            Assert.assertEquals(element.getText(),ServicesLabel);
            Reporter.log("Services Link has verified"+element.getText());
            Services.click();
        }

        public void validateProduct(String ProductLabel){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Products));
            Assert.assertEquals(element.getText(),ProductLabel);
            Reporter.log("ProductLink has verified"+element.getText());
            Products.click();
        }
        public void validateLocation(String LocationLabel){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Locations));
            Assert.assertEquals(element.getText(),LocationLabel);
            Reporter.log("LocationLink has verified"+element.getText());
            Locations.click();
        }

        public void validateAdminPage(String Adminpagelable){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(AdminPage));
            Assert.assertEquals(element.getText(), Adminpagelable);
            Reporter.log("Adminpagelink has verified"+element.getText());
            AdminPage.click();
        }

        public void validateCustomerLabel(String CustomerLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(CustomerLogin));
            Assert.assertEquals(element.getText(), CustomerLabel);
            Reporter.log("CustomerLabel Title has been verified " + element.getText());
        }

        public void validateUserNameLabel(String UserNameLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(Username));
            Assert.assertEquals(element.getText(), UserNameLabel);
            Reporter.log("UserNameLabel Title has been verified " + element.getText());
        }

        public void enterUserName(String UserName){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(Usernameinputbox));
            element.sendKeys(UserName);
            Reporter.log(" UserName has been entered " + UserName);
        }

        public void validatePasswordLabel(String PasswordLabel ){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(Password));
            Assert.assertEquals(element.getText(),PasswordLabel );
            Reporter.log("PasswordLabel Title has been verified " + element.getText());
        }

        public void enterPassword(String Password){
            WebElement element = wait.until(ExpectedConditions.visibilityOf(passwordinput));
            element.sendKeys(Password);
            Reporter.log("Password has been entered " + Password);
        }

        public void validateLoginButton(String Loginbuttonlabel){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(LogInbutton));
            Assert.assertEquals(element.getText(),  Loginbuttonlabel);
            Reporter.log("LoginButton has verified"+element.getText());
            LogInbutton.click();

        }


        public void validateForgotPasswordLink(String ForgotLoginlabel){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Forgotlogininfolink));
            Assert.assertEquals(element.getText(), ForgotLoginlabel);
            Reporter.log("ForgotPasswordLink has verified"+element.getText());
            Forgotlogininfolink.click();
        }

        public void validateRegisterLink(String RegisterLinklable){
            WebElement element=wait.until(ExpectedConditions.elementToBeClickable(Registerlink));
            Assert.assertEquals(element.getText(), RegisterLinklable);
            Reporter.log("RegisterLink has verified"+element.getText());
            Registerlink.click();



        }
    }


