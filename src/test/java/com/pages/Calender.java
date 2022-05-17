package com.pages;

import com.tests.utilities.PrePost;
import org.openqa.selenium.By;

import java.util.HashMap;
import java.util.Map;

public class Calender extends PrePost {
    public Map<String, Integer> months = new HashMap<>();

    public void createMonth(){
        months.put("January", 1);
        months.put("Febuary", 2);
        months.put("March", 3);
        months.put("April", 4);
        months.put("May", 5);
        months.put("June", 6);
        months.put("July", 7);
        months.put("August", 8);
        months.put("September", 9);
        months.put("October", 10);
        months.put("November", 11);
        months.put("December", 12);
    }




    public void selectDate(String date){
        date = "13-03-1992";
        String[] dateParts = date.split("-");
        String calenderPopup = "//div[contains(@id,'DobCalendarExtender_popupDiv')]";
        String calenderHeader = "//div[contains(@id,'DobCalendarExtender_header')]";
        String nextArrow = "//div[contains(@id,'DobCalendarExtender_nextArrow')]";
        String prevArrow = "//div[contains(@id,'DobCalendarExtender_prevArrow')]";
        String currentYear = browser.getDriver().findElement(By.xpath(calenderHeader)).getText();
        String[] currentDateExtract = currentYear.split(", ");
        if(Integer.parseInt(currentDateExtract[1]) > Integer.parseInt(dateParts[2])){
            // previous click ?
        }else if (Integer.parseInt(currentDateExtract[1]) < Integer.parseInt(dateParts[2])){
            // next click ?
        }
    }



}
