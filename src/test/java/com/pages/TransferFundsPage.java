package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
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


    @FindBy(xpath = "//a[@href='/parabank/transfer.htm']")
    public WebElement lnkTransferFunds;

    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[3]/a")
    public WebElement txtTransferFunds;

    @FindBy(xpath = "//*[@id='rightPanel']/div/div/h1")
    public WebElement lblTitle;

    @FindBy(xpath = "//form/p/b")
    public WebElement lblAmount;

    @FindBy(xpath = "//form/p/text()")
    public WebElement lblDollor;

    @FindBy(xpath = "//form[@ng-submit='submit()']/p/input[@id='amount']")
    public WebElement txtAmount;

    @FindBy(xpath = "//*[contains(text(),'From account')")
    public WebElement lblFromAccount ;

    @FindBy(xpath = "//*[contains(text(),'To account')")
    public WebElement lblToAccount ;

    @FindBy(id = "fromAccountId")
    public WebElement ddFromAccount ;

    @FindBy(id = "toAccountId")
    public WebElement ddToAccount ;

    @FindBy(xpath = "//form[@ng-submit='submit()']/div/input[@type='submit' and @value='Transfer']")
    public WebElement lblTransfer ;


    @FindBy(xpath = "//form[@ng-submit='submit()']/div/input[@type='submit' and @value='Transfer']")
    public WebElement btnTransfer ;



    public TransferFundsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 90);
        PageFactory.initElements(driver, this);
        Actions actions = new Actions(driver);
    }
//---------TC001------
    public void validateLnkTransferFunds(String TransferFunds){
        Reporter.log("Transfer Fund Title will verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lnkTransferFunds));
        Assert.assertEquals(element.getText(), TransferFunds);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());
    }

    public void clickTxtTransferFunds (){
        Reporter.log("Transfer Fund Link is getting clicked" );
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(txtTransferFunds));
        txtTransferFunds.click();
        Reporter.log("Transfer Fund Link has been clicked" );

    }

    public void validatePageTitle (String Title){
        Reporter.log("Transfer Fund Title is getting verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblTitle));
        assertEquals(element.getText(), Title);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());
    }

//----------TC002------------
    //-------------------Amount Validation & Click------------------
    public void validateLblAmount(String Amount){
        Reporter.log("Validating Visibility of Amount input :" );
        WebElement element=wait.until(ExpectedConditions.visibilityOf(lblAmount));
        assertEquals(element.getText(), Amount);
        Reporter.log("input amount field Validated as " + element.getText());
    }

    public void validateLblDollor(String Dollor){
        Reporter.log("Validating Visibility of $ :" );
        WebElement element=wait.until(ExpectedConditions.visibilityOf(lblDollor));
        assertEquals(element.getText(), Dollor);
        Reporter.log("Dollor text visible as " + element.getText());
    }

    public void clickInputTxtAmount(){
        Reporter.log("Amount input field getting verified : " );
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(txtAmount));
        txtAmount.click();
        Reporter.log("Amount input field is Clickable : " );
    }

    //-------------------From Account Validation & Click------------------
    public void validateLblFromAcount(String FromAcount){
        Reporter.log("Transfer Fund Title will verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblFromAccount));
        Assert.assertEquals(element.getText(), FromAcount);
        Reporter.log("Transfer Fund Title has been verified " + element.getText());
    }

    public void validateDdFromAccount(){
        Reporter.log("ddFromAccount is getting Verified");
        WebElement dropdown = driver.findElement(By.id("fromAccountId"));

        if (dropdown.isEnabled() && dropdown.isDisplayed())
        Reporter.log("ddFromAccount is Verified");
    }

    public void selectDdFromAccount(int FromAccount){
        Reporter.log("ddFromAccount is getting Selected");
        WebElement dropdown = driver.findElement(By.id("fromAccountId"));
        Select s = new Select(dropdown);
        s.selectByIndex(FromAccount);
        Reporter.log("ddFromAccount is Selected");
    }

    //-------------------To Account Validation & Click------------------

    public void validateLblToAcount(String ToAcount){
        Reporter.log("Dropdown Label ToAccount will verified ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblToAccount));
        Assert.assertEquals(element.getText(), ToAcount);
        Reporter.log("Dropdown Label ToAccount has been verified " + element.getText());
    }

    public void validateDdToAccount(){
        Reporter.log("ddToAccount is getting Verified");
        WebElement dropdown = driver.findElement(By.id("toAccountId"));

        if (dropdown.isEnabled() && dropdown.isDisplayed())
            Reporter.log("ddToAccount is Verified");
    }

    public void selectDdToAccount(int ToAccount){
        Reporter.log("ddToAccount is getting Selected");
        WebElement dropdown = driver.findElement(By.id("toAccountId"));
        Select s = new Select(dropdown);
        s.selectByIndex(ToAccount);
        Reporter.log("ddToAccount is Selected");
    }

    //-------------------Transfer Button Validation & Click------------------

    public void validateLblBtnTransfer(String Transfer){
        Reporter.log("TRANSFER button Label is getting verified");
        WebElement element=wait.until(ExpectedConditions.visibilityOf(lblTransfer));
        assertEquals(element.getText(),  Transfer);
        Reporter.log("TRANSFER button Label has verified" + element.getText());
    }

    public void clickBtnTransfer(){
        Reporter.log("TRANSFER button is getting clicked");
        WebElement element=wait.until(ExpectedConditions.elementToBeClickable(btnTransfer));
        btnTransfer.click();
        Reporter.log("TRANSFER button is clicked");

    }

}
