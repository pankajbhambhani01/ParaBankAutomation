package com.tests.login;

import org.testng.annotations.Test;

public class FindTransactionTestCases {
//-------sadik shitole----//
    @Test
    public void TC001_validFindByTransactionID(){
        // enter TransactionId
        // click FindTransaction
        // Validate page

    }

    @Test
    public void TC002_InvalidFindByTransactionID(){
        // enter wrong TransactionId
        //  click FindTransaction
        // validate error message

    }

    @Test
    public void TC003_ValidFindByDate(){
        //enter TransactionDate
        // click FindTransaction
        // Validate transaction Result Page
    }
    @Test
    public void TC004_InvalidFindByDate(){
        // enter wrong TransactionDate
        //  click FindTransaction
        // validate error message
    }
    @Test
    public void TC004_ValidFindByDateRange(){
        //enter  between TransactionDate
        //enter  and TransactionDate
        // click FindTransaction
        // Validate transaction Result Page
    }
    @Test
    public void TC005_InvalidFindByDateRange(){
        //enter  wrong between TransactionDate
        //enter  wrong and TransactionDate
        // click FindTransaction
        // validate error message
    }
    @Test
    public void TC006_ValidFindByAmount(){
        //enter TransactionAmount
        // click FindTransaction
        // Validate transaction Result Page
    }
    @Test
    public void TC007_InvalidFindByAmount(){
        //enter  wrong TransactionAmount
        // click FindTransaction
        // validate error message
    }
}
