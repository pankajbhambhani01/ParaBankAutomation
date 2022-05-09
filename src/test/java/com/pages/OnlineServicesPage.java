package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class OnlineServicesPage {
    //Snehal Bhagat

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//li[@class='captiontwo']")
    public WebElement Onlineservice;

    @FindBy(xpath = "//a[.='Bill Pay']")
    public WebElement BillPay;

    @FindBy(xpath = "//a[.='Account History']")
    public WebElement AccountHistory;

    @FindBy(xpath = "//a[.='Transfer Funds']")
    public WebElement TransferFunds;

    public OnlineServicesPage(WebDriver driver)
    {
        this.driver=driver;
        this.wait=new WebDriverWait(driver,60);
        PageFactory.initElements(driver,this);
    }


    public void onlineServicesTitle(String onlineServicestitle)
    {
        WebElement element=wait.until(ExpectedConditions.visibilityOf(Onlineservice));
        Assert.assertEquals(element.getText(),Onlineservice);
        Reporter.log("Online services Tiltle Has been verified " +element .getText());
    }

    public void billPay(String billPayLable)
    {
        WebElement element=wait.until(ExpectedConditions.visibilityOf(BillPay));
        Assert.assertEquals(element.getText(),BillPay);
        Reporter.log("Bill pay title  Has been verified " +element .getText());
        BillPay.click();.
    }

    public void clickbillPay()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(BillPay));
        Assert.assertEquals(element.getText(),BillPay);
        Reporter.log("Bill Pay link clickable");
        BillPay.click();
    }

    public void accountHistory(String accountHistoryLable)
    {
        WebElement element=wait.until(ExpectedConditions.visibilityOf(AccountHistory));
        Assert.assertEquals(element.getText(),AccountHistory);
        Reporter.log("Account History title  Has been verified " +element .getText());
        AccountHistory.click();
    }

    public void clickaccountHistory()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(AccountHistory));
        Assert.assertEquals(element.getText(),AccountHistory);
        Reporter.log("Account History link clickable");
        AccountHistory.click();
    }

    public void transferFunds(String transferFundsLable) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(TransferFunds));
        Assert.assertEquals(element.getText(), TransferFunds);
        Reporter.log("Transfer funds title Has been verified " + element.getText());
    }

    public void clicktransferFunds()
    {
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(TransferFunds));
        Assert.assertEquals(element.getText(),TransferFunds);
        Reporter.log("Transfer funds link clickable");
        TransferFunds.click();
    }

}
