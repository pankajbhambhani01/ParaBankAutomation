package com.tests.atmservice;

import java.util.Map;

import org.testng.annotations.Test;

import com.constants.Constants;
import com.pages.ATMServicesPage;
import com.pages.LoginPage;
import com.tests.utilities.PrePost;
import com.utility.FileReading;

public class AtmServicesTestCase extends PrePost {

	    @Test
	    public void validateAllLablesAtmServices(){

	        Map<String, String> testData = FileReading.readProperties(Constants.atmservices + Constants.slash + "TC001");
	        ATMServicesPage atmservices = new ATMServicesPage(browser.getDriver());

	        atmservices.atmServiceLabel(testData.get("atmservices"));
	        atmservices.withdrawFunds(testData.get("withdrawfunds"));
	        atmservices.transferFunds(testData.get("transferfunds"));
	        atmservices.checkBalances(testData.get("checkbalances"));
	        atmservices.makeDeposits(testData.get("makedeposits"));
	    }
	    @Test
	    public void testWithdrawFunds(){
	        Map<String, String> testData = FileReading.readProperties("TC001");
	        ATMServicesPage atmservices=new ATMServicesPage(browser.getDriver());
	        atmservices.withdrawFunds("");
	    }
	    @Test
	    public void testTransferFunds(){
	        Map<String, String> testData = FileReading.readProperties("TC001");
	        ATMServicesPage atmservices=new ATMServicesPage(browser.getDriver());
	        atmservices.transferFunds("");
	    }

	    @Test
	    public void testCheckBalances(){
	        Map<String, String> testData = FileReading.readProperties("TC001");
	        ATMServicesPage atmservices=new ATMServicesPage(browser.getDriver());
	        atmservices.checkBalances("");
	    }

	    @Test
	    public void testMakeDeposits(){
	        Map<String, String> testData = FileReading.readProperties("TC001");
	        ATMServicesPage atmservices=new ATMServicesPage(browser.getDriver());
	        atmservices.makeDeposits("");
	    }


}
