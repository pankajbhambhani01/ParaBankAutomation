package com.pages;

        import org.openqa.selenium.WebDriver;
        import org.openqa.selenium.WebElement;
        import org.openqa.selenium.support.FindBy;
        import org.openqa.selenium.support.PageFactory;
        import org.openqa.selenium.support.ui.ExpectedConditions;
        import org.openqa.selenium.support.ui.WebDriverWait;
        import org.testng.Assert;
        import org.testng.Reporter;

        import javax.xml.xpath.XPath;

public class FindTransactionsPage {
    private WebDriver driver;
    private WebDriverWait wait;

    //---------click on Find Transaction page-------------//
    @FindBy(xpath = "//a[@href='/parabank/admin.htm']")
    public WebElement lblFindTransactionHeader;

    //----------Find Transactions page-----//
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement textFindtransactions;
    @FindBy(linkText = "Find Transactions")
    public WebElement btnFindTransaction;


    //-------select An Account-----//
    @FindBy(xpath = "//select[@id='accountId']")
    public WebElement textSelectAnAccount;
    @FindBy(linkText = "Find transactions")
    public WebElement btnFindTransaction1;

    //---------Find By Transaction ID------//
    @FindBy(xpath = "//input[@id='criteria.transactionId']")
    public WebElement textFindByTransactionId;
    @FindBy(linkText = "Find transactions")
    public WebElement btnFindTransaction2;

    //----------Find By Date-----//
    @FindBy(xpath = "//input[@id='criteria.onDate']")
    public WebElement textFindByDate;
    @FindBy(linkText = "Find transactions")
    public WebElement btnFindTransaction3;

    //------Find By Date Range-----//
    @FindBy(xpath = "//input[@id='criteria.fromDate']")
    public WebElement textFindBydateRange;
    @FindBy(xpath = "//input[@id='criteria.toDate']")
    public WebElement textFindBydateRange1;
    @FindBy(linkText = "Find transactions")
    public WebElement btnFindTransaction4;

    //--------Find By Amount-------//
    @FindBy(xpath = "//input[@id='criteria.amount']")
    public WebElement textFindByAmount;
    @FindBy(linkText = "Find transactions")
    public WebElement btnFindTransaction5;


    public FindTransactionsPage(WebDriver driver) {
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

    public void validateFindTransactionsPage(String FindTransactionsLabel) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(textFindtransactions));
        Assert.assertEquals(element.getText(), FindTransactionsLabel);
        Reporter.log("Find Transaction Title has been verified " + element.getText());
        btnFindTransaction.click();
    }

    public void enterSelectAnAccount(String SelectAccount) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(textSelectAnAccount));
        element.sendKeys(SelectAccount);
        Reporter.log("Select An  Account has been entered:" + SelectAccount);
        btnFindTransaction1.click();
    }

    public void enterFindByTransactionId(String FindTransactionId) {
        WebElement element = wait.until(ExpectedConditions.visibilityOf(textFindByTransactionId));
        element.sendKeys(FindTransactionId);
        Reporter.log("Find Transaction By ID has been entered:" + FindTransactionId);
        btnFindTransaction2.click();
    }
    public void enterFindByDate(String FindDate){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(textFindByDate));
        element.sendKeys(FindDate);
        Reporter.log("Find Transaction By Date has been entered:"+ FindDate);
        btnFindTransaction3.click();
}
    public void enterFindByDateRange(String FindDateRange,String FindDateRange1){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(textFindBydateRange));
        element.sendKeys(FindDateRange);
        element.sendKeys(FindDateRange1);
        Reporter.log("Find Transaction By Date has been entered:"+ FindDateRange+ ""+FindDateRange1);
        btnFindTransaction4.click();
}
    public void enterFindByAmount(String FindAmount){
        WebElement element= wait.until(ExpectedConditions.visibilityOf(textFindByAmount));
        element.sendKeys(FindAmount);
        Reporter.log("Find Transaction By Amount has been entered:"+ FindAmount);
        btnFindTransaction5.click();
}
}