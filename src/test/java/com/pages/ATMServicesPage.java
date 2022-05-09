package com.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class ATMServicesPage {
	// Vishwanath A

	private WebDriver driver;
	private WebDriverWait wait;

	@FindBy(xpath = "//li[@class='captionone']")
	public WebElement ATMServices;

	@FindBy(xpath = "//a[.='Withdraw Funds']") // <a href="services/ParaBank?wsdl">Withdraw Funds</a>
	public WebElement WithdrawFunds;

	@FindBy(xpath = "//a[.='Transfer Funds']")
	public WebElement TransferFunds;

	@FindBy(xpath = "//a[.='Check Balances']")
	public WebElement CheckBalances;

	@FindBy(xpath = "//a[.='Make Deposits']")
	public WebElement MakeDeposits;

	public ATMServicesPage(WebDriver driver) {
		this.driver = driver;
		this.wait = new WebDriverWait(driver, 60);
		PageFactory.initElements(driver, this);
	}

	public void atmServiceLabel(String atmLable){
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ATMServices));
        Assert.assertEquals(element.getText(), atmLable);
        Reporter.log("ATM Services Title has been verified " + element.getText());
    }
	
	public void withdrawFunds (String withdrawFundsLable){
        Reporter.log("withdrawFunds Link will be verified");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(WithdrawFunds));
        Assert.assertEquals(element.getText(),withdrawFundsLable );
        Reporter.log("withdrawFunds Link has been verified " + element.getText());
        WithdrawFunds.click();
    }
	
	public void transferFunds(String transferFundsLable){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(TransferFunds));
        Assert.assertEquals(element.getText(),transferFundsLable );
        Reporter.log("TransferFunds Link has been verified " + element.getText());
        TransferFunds.click();
    }
	
	public void checkBalances (String checkBalancesLable){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(CheckBalances));
        Assert.assertEquals(element.getText(),checkBalancesLable );
        Reporter.log("CheckBalances Link has been verified " + element.getText());
        CheckBalances.click();
    }
	
	public void makeDeposits (String makeDepositsLable){
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(MakeDeposits));
        Assert.assertEquals(element.getText(),makeDepositsLable );
        Reporter.log("MakeDeposits Link has been verified " + element.getText());
        MakeDeposits.click();
    }
}
