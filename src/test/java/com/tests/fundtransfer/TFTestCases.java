package com.tests.fundtransfer;

import com.tests.utilities.PrePost;
import org.testng.annotations.Test;

public class TFTestCases extends PrePost {
    @Test
    public void TC001_openTransferFundsPage() {
        //Validate Transfer Fund Link;
        //Click Transfer Fund Link;
        //Validate Availability of Page Transfer Funds;
        //If Not Available Validate Error Massage "An internal error has occurred and has been logged.";
    }
    @Test
    public void TC002_ValidateTransferFundsPageDetails() {
        //Validate appearance of Label Amount: $;
        //Validate appearance & clickable of TextBox Amount: $;
        //Validate appearance of Label FromAccount#;
        //Validate appearance & Selectable of DropDown FromAccount#;
        //Validate appearance of Label ToAccount#;
        //Validate appearance & Selectable of DropDown FromAccount#;
        //Validate appearance & Clickable of Button TRANSFER;
    }

    @Test
    public void TC003_EnteringEmptyAmount() {
        //Enter Empty Amount;
        //Click Transfer Button;
        //Validate Empty Amount Error "The amount cannot be empty.";
    }

    @Test
    public void TC004_EnteringWrongAmount() {
        //Enter Wrong Amount;
        //Click Transfer Button;
        //Validate Wrong Amount Error Massage "Please enter a valid amount.";
    }

    @Test
    public void TC005_SelectDropDownFieldFromAccount() {
        //Validate for DropDown Fields Availability of FromAccount#;
        //if Available Select Account No. for FromAccount#;
        //if Not Available then Validate Error Massage - " xxxxxx ";
    }

    @Test
    public void TC006_SelectDropDownFieldToAccount() {
        //Validate for DropDown Fields Availability of ToAccount#;
        //if Available Select Account No. for ToAccount#;
        //if Not Available then Validate Error Massage - " yyyyyy ";
    }

    @Test
    public void TC007_ClickTransferButton() {
        //Enter Correct Amount;
        //Select Account No. of DropDown FromAccount#;
        //Select Account No. of DropDown ToAccount#;
        //Click on Transfer Button;
        //if Transaction Successful - Successful Massage " Successfull xxxxx ";
        //if Transaction Failed - Show Failed Massage - " Failed xxxxxx ";

    }

}
