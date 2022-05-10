package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ApplyForALoanPage {
    // sujit B

    public WebDriver driver;
    public WebDriverWait wait;

    @FindBy(tagName = "h1")
    public WebElement lblApplyLoan;

    @FindBy(id = "amount")
    public WebElement txtAmount;

    @FindBy(id = "downPayment")
    public WebElement txtDownPayment;

    @FindBy(id = "fromAccountId")
    public WebElement txtFromAccountId;

    @FindBy(className = "button")
    public WebElement btnApply;


    public ApplyForALoanPage(WebDriver driver){

        this.driver=driver;
        this.wait=new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);
    }

    public void validateLoanPageHeader(String loanPageHeaderLable){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(lblApplyLoan));
        Assert.assertEquals(element.getText(), loanPageHeaderLable);
        Reporter.log("Loan page header lable is verified...." + element.getText());
    }

    public void enterTxtAmount(String amount){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtAmount));
        element.sendKeys(amount);
        Reporter.log("Loan amount has been entered..." + amount);
    }

    public void enterDownPayment(String downPayment){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtDownPayment));
        element.sendKeys(downPayment);
        Reporter.log("Down payment amount has been entered..." + downPayment);
    }

    public void enterTxtFromAccountId(String accountId){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtFromAccountId));
        element.sendKeys(accountId);
        Reporter.log("From account is verified..." + accountId);
    }

    public void clickApplyButton(String btnApplyLoan){
        WebElement element=wait.until(ExpectedConditions.visibilityOf(btnApply));
        element.sendKeys(btnApplyLoan);
        Reporter.log("Apply button is clickable...");
        element.click();
    }
}
