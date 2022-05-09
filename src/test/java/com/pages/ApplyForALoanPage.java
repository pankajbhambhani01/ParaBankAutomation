package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
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


    public ApplyForALoanPage(WebDriver driver){

        this.driver=driver;
        this.wait=new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);
    }

    public void enterTxtAmount(String amount){

        WebElement element=wait.until(ExpectedConditions.visibilityOf(txtAmount));
        element.sendKeys(amount);
        Reporter.log("Loan amount has been entered..." + amount);
    }
}
