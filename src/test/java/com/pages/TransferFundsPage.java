package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import static org.testng.Assert.assertEquals;

public class TransferFundsPage {
    //Prashant G

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(xpath = "//*[@id='leftPanel']/ul/li/a[@href='/parabank/transfer.htm']")
    public WebElement lblTransferFunds;

    @FindBy(xpath = "//*[@id='leftPanel']/ul/li/a[@href='/parabank/transfer.htm']")
    public WebElement txtTransferFunds;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1[@class='title']")
    public WebElement lblTitle;

    @FindBy(xpath = "//form[@ng-submit='submit()']/p/input[@id='amount']")
    public WebElement lblAmount;

    @FindBy(xpath = "//form[@ng-submit='submit()']/p/input[@id='amount']")
    public WebElement txtAmount;

    @FindBy(xpath = "//form[@ng-submit='submit()']/div/select[@id='fromAccountId']")
    public WebElement ddFromAccount ;

    @FindBy(xpath = "//form[@ng-submit='submit()']/div/select[@id='toAccountId']")
    public WebElement ddToAccount ;


    @FindBy(xpath = "//form[@ng-submit='submit()']/div/input[@type='submit' and @value='Transfer']")
    public WebElement btnTransfer ;



    public TransferFundsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateLblTransferFunds(String lblTransferFunds){
        Reporter.log("Transfer Fund Title will verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(this.lblTransferFunds));
        assertEquals(element.getText(), lblTransferFunds);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());
    }

    public void clickTransferFunds (){
        Reporter.log("Transfer Fund Link is getting clicked" );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(this.txtTransferFunds));
        txtTransferFunds.click();
        Reporter.log("Transfer Fund Link has been clicked" );

    }

    public void validateTitle (String lblTitle){
        Reporter.log("Transfer Fund Title is getting verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(this.lblTitle));
        assertEquals(element.getText(), lblTitle);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());

    }

    public void validatelblAmount(String lblAmount){
        Reporter.log("Validating Visibility of Amount input :" );
        WebElement element=wait.until(ExpectedConditions.visibilityOf(this.lblAmount));
        assertEquals(element.getText(), lblAmount);
        Reporter.log("input amount field Validated as " + element.getText());
    }

    public void clickInputTxtAmount(){
        Reporter.log("Amount input field getting verified : " );
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtAmount));
        txtAmount.click();
        Reporter.log("Amount input field is Clickable : " );
    }

    public void validateDdFromAccount(String ddFromAccount){
        Reporter.log("ddFromAccount is getting Verified");
        WebElement dropdown = driver.findElement(By.xpath(ddFromAccount));
        if (dropdown.isEnabled() && dropdown.isDisplayed())
        Reporter.log("ddFromAccount is Verified");
    }
    public void selectDdFromAccount(String ddFromAccount){
        Reporter.log("ddFromAccount is getting Verified");
        Select s = new Select(this.ddFromAccount);
        s.selectByVisibleText(ddFromAccount);
        Reporter.log("ddFromAccount is Verified");
    }

    public void validateDdToAccount(String ddToAccount){
        Reporter.log("ddToAccount is getting Verified");
        WebElement dropdown = driver.findElement(By.xpath(ddToAccount));
        if (dropdown.isEnabled()&&dropdown.isDisplayed())
        Reporter.log("ddToAccount is Verified");
    }
    public void selectDdToAccount(String ddToAccount){
        Reporter.log("ddToAccount is getting Verified");
        Select s = new Select(this.ddToAccount);
        s.selectByVisibleText(ddToAccount);
        Reporter.log("ddToAccount is Verified");
    }

    public void validateBtnTransfer(String btnTransfer){
        Reporter.log("TRANSFER button is getting verified");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(this.btnTransfer));
        assertEquals(element.getText(),  btnTransfer);
        Reporter.log("TRANSFER button has verified" + element.getText());
    }

    public void clickBtnTransfer(){
        Reporter.log("TRANSFER button is getting clicked");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(btnTransfer));
        btnTransfer.click();
        Reporter.log("TRANSFER button is clicked");

    }

}
