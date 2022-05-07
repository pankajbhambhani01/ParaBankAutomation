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
    @FindBy(xpath ="//a[@href='/parabank/admin.htm']")
    public WebElement  textFindtransactions;

    //----------Find Transactions page-----//
    @FindBy(xpath = "//h1[@class='title']")
    public WebElement textFindtransactions1;

    //-------select An Account-----//
    @FindBy(xpath ="//select[@id='accountId']" )
    public WebElement textSelectAnAccount;

    @FindBy(linkText="Find transactions")
    public WebElement buttonFindTransaction;

    //---------Find By Transaction ID------//
    @FindBy(xpath ="//input[@id='criteria.transactionId']" )
    public WebElement textFindByTransactionId;
    @FindBy(linkText="Find transactions")
    public WebElement buttonFindTransaction1;

    //----------Find By Date-----//
    @FindBy(xpath ="//input[@id='criteria.onDate']" )
    public WebElement lblFindByDate;

    //------Find By Date Range-----//
    @FindBy(xpath = "//input[@id='criteria.fromDate']")
    public WebElement lblFindBydateRange1 ;

    @FindBy(xpath = "//input[@id='criteria.toDate']")
    public WebElement lblFindBydateRange2 ;

    //--------Find By Amount-------//
    @FindBy(xpath = "//input[@id='criteria.amount']")
    public WebElement lblFindByAmount;

    public FindTransactionsPage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);
    }

}


