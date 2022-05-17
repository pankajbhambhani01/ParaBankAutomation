package com.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

import java.util.List;

public class AccountOverViewPage {
    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//a[contains(@href,'activity.htm?id=')]")
    public WebElement lnkAccount;

    @FindBy(id = "transactionTable")
    public WebElement tblTransactions;

    @FindBy(xpath = "//*[@id='transactionTable']//tr")
    public List<WebElement> tblTransactionsRows;

    @FindBy(xpath = "//*[@id='transactionTable']//tr/th")
    public List<WebElement> tblTransactionsHeaders;



    public AccountOverViewPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);

        PageFactory.initElements(driver, this);
    }
    public void clickAccountLink() {
        lnkAccount.click();
    }

    public void validateAccountNumber(String accountNumber) {
        Assert.assertEquals(lnkAccount.getText(), accountNumber);
    }

    public void validateColoums(String cols) {// Date;Transaction;Debit (-);Credit (+)
       /* List<String> headers = new ArrayList<>();
        for (WebElement e : tblTransactionsHeaders) {
            headers.add(e.getText());
        }

        String[] col = cols.split(";");*/
      /*  if(col.length != headers.size()){
            Assert.fail("the size of expected and actual is not same");
        }

        for(int i = 0; i<col.length; i++){
            if(!col[i].equals(headers.get(i))){
                Assert.fail("index does not match " + i + "expected" + col[i] + "actual" + headers.get(i) );
            }
        }*/
        //Assert.assertEquals(Arrays.asList(col), headers);

        //----------------------------------------------
        // cols pass -> // "Date	Transaction	Debit (-)	Credit (+)"
        String textHeader = tblTransactionsRows.get(0).getText();
        Assert.assertEquals(textHeader, cols);
    }

    public void validateTransactions(String transaction, int expectedRow) {// "$12121.00" , 1
        List<WebElement> eleRows = tblTransactionsRows;
        WebElement row = eleRows.get(expectedRow);
        String text = row.getText();
        if (!text.contains(transaction)) {
            Reporter.log("Amount does not exist in the required row " + text);
            Assert.fail("Required row does not contains expected transactions" + text);
        }else{
            Reporter.log("Amount is present in the row" + text);
        }
        if (!text.contains("Funds Transfer Sent")) {
            Assert.fail("transaction message is not correct" + text);
        }
        WebElement eleDebit = row.findElement(By.xpath("//td[3]"));
        String colText = eleDebit.getText();
        Assert.assertEquals(colText, transaction);
    }

}
