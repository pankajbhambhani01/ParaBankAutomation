package com.pages;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.Reporter;

public class UpdateProfilePage {
    //Abhijit Raoot

    private WebDriver driver;
    private WebDriverWait wait;

    @FindBy(xpath = "//h1[@class='title']")
    public WebElement lblUpdateProfileTittle;

    @FindBy(xpath = "//tr/td/b[text()='First Name:']")
    public WebElement lblFirstName ;

    @FindBy(xpath = "//input[@id='customer.firstName']")
    public WebElement txtFirstName ;

    @FindBy(xpath = "//tr/td/b[text()='Last Name:']")
    public WebElement lblLastName;

    @FindBy(xpath = "//input[@id='customer.lastName']")
    public WebElement txtLastName;
    @FindBy(xpath = "//tr/td/b[text()='Address:']")
    public WebElement lblAddress;
    @FindBy(xpath = "//input[@id='customer.address.street']")
    public WebElement txtAddress;

    @FindBy(xpath = "//tr/td/b[text()='City:']")
    public WebElement lblCity;
    @FindBy(xpath = "//input[@id='customer.address.city']")
    public WebElement txtCity;

    @FindBy(xpath = "//tr/td/b[text()='State:']")
    public WebElement lblState;
    @FindBy(xpath = "//input[@id='customer.address.state']")
    public WebElement txtState;

    @FindBy(xpath = "//tr/td/b[text()='Zip Code:']")
    public WebElement lblZipCode;


    @FindBy(xpath = "//input[@id='customer.address.zipCode']")
    public WebElement txtZipCode;

    @FindBy(xpath = "//tr/td/b[text()='Phone #:']")
    public WebElement lblPhoneNUmber;

    @FindBy(xpath = "//input[@id='customer.phoneNumber']")
    public WebElement txtPhoneNUmber;


    @FindBy(xpath = "//input[@type='submit']")
    public WebElement btnUpdateProfile;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/h1")
    public WebElement errormessage1;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/h1")
    public WebElement updatedMessageTittle;

    @FindBy(xpath = "//div[@id='rightPanel']/div/div/p")
    public WebElement successMessage;






    @FindBy(xpath = "//div[@id='leftPanel']/ul/li[6]/a")  ///dummy
    public  WebElement lnkUpdateInfo;



    @FindBy(xpath = "    //span[@ng-if='customer && !customer.firstName']")
    public WebElement FirstNameBlankMessage;

    @FindBy(xpath = "//span[@ng-if='customer && !customer.lastName']")
    public WebElement LastNameBlankMessage;

    @FindBy(xpath = "//span[@ng-if='customer && !customer.address.street']")
    public WebElement AddressBlankMessage;

    @FindBy(xpath = "//span[@ng-if='customer && !customer.address.city']")
    public WebElement CityBlankMessage;

    @FindBy(xpath = "//span[@ng-if='customer && !customer.address.state']")
    public WebElement StateBlankMessage;

    @FindBy(xpath = "//span[@ng-if='customer && !customer.address.zipCode']")
    public WebElement ZipCodeBlankMessage;

    @FindBy(xpath = "")
    public WebElement phoneBlankMessage;




    public UpdateProfilePage(WebDriver driver){
        this.driver = driver;
        this.wait = new WebDriverWait(driver, 60);
        PageFactory.initElements(driver, this);

        Actions actions=new Actions(driver);

    }

    public void validateUpdateLabel(String updateProfileTittle){
        Reporter.log("UpdateProfile Title will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblUpdateProfileTittle));
        Assert.assertEquals(element.getText(), updateProfileTittle);
        Reporter.log("UpdateProfile Title has been verified " + element.getText());
    }

    public void validateFirstNameLabel(String firstNameLabel){
        Reporter.log("Firstname label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblFirstName));
        Assert.assertEquals(element.getText(),firstNameLabel);
        Reporter.log("Firstname  label has been verified"+firstNameLabel);
    }


    public void enterTxtFirstName(String firstName){
        Reporter.log("First Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        element.sendKeys(firstName);
        Reporter.log("First Name has been entered " + firstName);
    }

    public void clearTxtFirstName(){
        Reporter.log("First Name will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtFirstName));
        Actions actions=new Actions(driver);
        actions.click(txtFirstName).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("First Name has been cleared " );
    }

    public void validateLastNameLabel(String LastNameLabel){
        Reporter.log("Lastname  label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblLastName));
        Assert.assertEquals(element.getText(),LastNameLabel);
        Reporter.log("Lastname  label has been verified"+LastNameLabel);
    }



    public void enterTxtLastName(String lastName){
        Reporter.log("Last Name will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtLastName));
        element.sendKeys(lastName);
        Reporter.log("Last Name has been entered " + lastName);
    }

    public void clearTxtLastName(){
        Reporter.log("Last Name will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtLastName));
        Actions actions=new Actions(driver);
        actions.click(txtLastName).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("Last Name has been cleared " );
    }

    public void validateAddressLabel(String addressLabel){
        Reporter.log("Address  label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblAddress));
        Assert.assertEquals(element.getText(),addressLabel);
        Reporter.log("Address  label has been verified"+addressLabel);
    }
    public void enterTxtAddress(String address){
        Reporter.log("Address will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        element.sendKeys(address);
        Reporter.log("Address has been entered " + address);
    }

    public void clearTxtAddress(){
        Reporter.log("Address will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtAddress));
        Actions actions=new Actions(driver);
        actions.click(txtAddress).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("Address Name has been cleared " );
    }
    public void validatecityLabel(String cityLabel){
        Reporter.log("City label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblCity));
        Assert.assertEquals(element.getText(),cityLabel);
        Reporter.log("City  label has been verified"+cityLabel);
    }
    public void enterTxtCity(String city){
        Reporter.log("CityName will be entered ");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtCity));
        element.sendKeys(city);
        Reporter.log("CityName has been entered " + city);
    }

    public void clearTxtCity(){
        Reporter.log("city will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtCity));
        Actions actions=new Actions(driver);
        actions.click(txtCity).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("City Name has been cleared " );
    }

    public void validateStateLabel(String stateLabel){
        Reporter.log("StateName label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblState));
        Assert.assertEquals(element.getText(),stateLabel);
        Reporter.log("StateName  label has been verified"+stateLabel);
    }
    public void enterTxtState(String state){
        Reporter.log("State will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        element.sendKeys(state);
        Reporter.log("State has been entered " + state);
    }
    public void clearTxtState(){
        Reporter.log("State will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtState));
        Actions actions=new Actions(driver);
        actions.click(txtState).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("State Name has been cleared " );
    }
    public void validateZipcode(String zipcodeLabel){
        Reporter.log("ZipCode label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblZipCode));
        Assert.assertEquals(element.getText(),zipcodeLabel);
        Reporter.log("ZipCode  label has been verified"+zipcodeLabel);
    }
    public void enterZipCode(String zipCode){
        Reporter.log("ZipCode wll be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtZipCode));
        element.sendKeys(zipCode);
        Reporter.log("ZipCode has been entered " + zipCode);
    }

    public void clearTxtZipCode(){
        Reporter.log("Zipcode will be cleared");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtZipCode));
        Actions actions=new Actions(driver);
        actions.click(txtZipCode).keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).sendKeys(Keys.BACK_SPACE).build().perform();

        Reporter.log("zipcode Name has been cleared " );
    }

    public void validatePhoneNumber(String phoneNumberLabel){
        Reporter.log("PhoneNumber  label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(lblPhoneNUmber));
        Assert.assertEquals(element.getText(),phoneNumberLabel);
        Reporter.log("PhoneNumber  label has been verified"+phoneNumberLabel);
    }
    public void enterPhoneNumber(String phoneNumber){
        Reporter.log("Phone Number will be entered");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(txtPhoneNUmber));
        element.sendKeys(phoneNumber);
        Reporter.log("Phone Number has been entered " + phoneNumber);
    }



    public void validateUpdateButtonLabel(String updatebtnlabel){
        Reporter.log("UpdateProfile  label will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(btnUpdateProfile));
        Assert.assertEquals(element.getText(),updatebtnlabel);
        Reporter.log("UpdateProfile  label has been verified"+updatebtnlabel);
    }
    public void clickUpdateProfileButton(){
        Reporter.log("updateProfile will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(btnUpdateProfile));
        Reporter.log("UpdateProfile  Clicked");
        element.click();
    }

    public void validatErrorMessage(String errormessage){
        Reporter.log("error message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(errormessage1));
        Assert.assertEquals(element.getText(),errormessage);
        Reporter.log("error message  has been verified"+errormessage);
    }

    public void validateSuccessfulUpdatedProfileTittle(String sucessesUpdatedTittle){
        Reporter.log("SuccesfulUpdatedProfileTittle will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(updatedMessageTittle));
        Assert.assertEquals(element.getText(),sucessesUpdatedTittle);
        Reporter.log("SuccesfulUpdatedProfileTittle  has been verified"+sucessesUpdatedTittle);
    }

    public void validateSuccessfulUpdateProfileMessage(String sucessesUpdateMessage){
        Reporter.log("SuccesfulUpdateProfileMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(successMessage));
        Assert.assertEquals(element.getText(),sucessesUpdateMessage);
        Reporter.log("SuccesfulUpdateProfileMessage  has been verified"+sucessesUpdateMessage);
    }


    public void clickUpdateProfile(){                         ////dummy
        Reporter.log("updateContact will be clicked");
        WebElement element = wait.until(ExpectedConditions.elementToBeClickable(lnkUpdateInfo));
        Reporter.log("UpdateContact Clicked");
        element.click();

    }

    public void validatedFirstNameBlankErrorMessage(String firstNameBlankMessage){
        Reporter.log("First Name BlankMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(FirstNameBlankMessage));
        Assert.assertEquals(element.getText(),firstNameBlankMessage);
        Reporter.log("First Name BlankMessage has been verified" + element.getText());
    }
    public void validatedLastNameBlankErrorMessage(String lastNameBlankErrorMessage) {
        Reporter.log("Last Name BlankMessage will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(LastNameBlankMessage));
        Assert.assertEquals(element.getText(), lastNameBlankErrorMessage);
        Reporter.log("Last Name BlankMessage has been verified" + element.getText());
    }
    public void validatedAddressBlankErrorMessage(String addressErrorMessage) {
        Reporter.log("Address Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(AddressBlankMessage));
        Assert.assertEquals(element.getText(), addressErrorMessage);
        Reporter.log("Address Blank Error Message has been verified" + element.getText());
    }

    public void validatedCityBlankErrorMessage(String cityErrorMessage) {
        Reporter.log("city Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(CityBlankMessage));
        Assert.assertEquals(element.getText(), cityErrorMessage);
        Reporter.log("city Blank Error Message has been verified" + element.getText());
    }

    public void validatedStateBlankErrorMessage(String stateErrorMessage) {
        Reporter.log("State Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(StateBlankMessage));
        Assert.assertEquals(element.getText(), stateErrorMessage);
        Reporter.log("State Blank Error Message has been verified" + element.getText());
    }

    public void validatedZipCodeBlankErrorMessage(String zipcodeErrorMessage) {
        Reporter.log("Zip Code Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(ZipCodeBlankMessage));
        Assert.assertEquals(element.getText(), zipcodeErrorMessage);
        Reporter.log("Zip Code Blank Error Message has been verified" + element.getText());
    }
    public void validatedPhoneNumberBlankErrorMessage(String phoneErrorMessage) {
        Reporter.log("phone Blank Error Message will be verified");
        WebElement element = wait.until(ExpectedConditions.visibilityOf(phoneBlankMessage));
        Assert.assertEquals(element.getText(), phoneErrorMessage);
        Reporter.log("phone Blank Error Message has been verified" + element.getText());
    }












}
