package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
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
        Reporter.log("First name has been entered " + firstName);
    }
}
