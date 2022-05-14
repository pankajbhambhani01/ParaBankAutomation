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

public class TransferFundsPage {
    //Prashant G

    private WebDriver driver;
    private WebDriverWait wait;


    @FindBy(xpath = "//*[@id='leftPanel']/ul/li/a[@href='/parabank/transfer.htm']")
    public WebElement lnkTransferFunds;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1[@class='title']")
    public WebElement txtTitle;

    @FindBy(xpath = "//form[@ng-submit='submit()']/p/input[@id='amount']")
    public WebElement amount;

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

    public void validateTransferFunds(String lnkTransferFunds){
        Reporter.log("Transfer Fund Title will verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(this.lnkTransferFunds));
        Assert.assertEquals(element.getText(), lnkTransferFunds);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());
    }

    public void clickTransferFunds (){
        Reporter.log("Transfer Fund Link is getting clicked" );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkTransferFunds));
        lnkTransferFunds.click();
        Reporter.log("Transfer Fund Link has been clicked" );

    }

    public void validateTitle (String txtTitle){
        Reporter.log("Transfer Fund Title is getting verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(this.txtTitle));
        Assert.assertEquals(element.getText(), txtTitle);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());

    }

    public void validateAmount(String amount){
        Reporter.log("Validating Visibility of Amount input :" );
        WebElement element=wait.until(ExpectedConditions.visibilityOf(this.amount));
        Assert.assertEquals(element.getText(), amount);
        Reporter.log("input amount field Validated as " + element.getText());
    }

    public void clickInputAmount(){
        Reporter.log("Amount input field getting verified : " );
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(amount));
        amount.click();
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
        Assert.assertEquals(element.getText(),  btnTransfer);
        Reporter.log("TRANSFER button has verified" + element.getText());
    }



    public void clickLoginButton(){
        Reporter.log("TRANSFER button is getting clicked");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(btnTransfer));
        btnTransfer.click();
        Reporter.log("TRANSFER button is clicked");

    }

}
