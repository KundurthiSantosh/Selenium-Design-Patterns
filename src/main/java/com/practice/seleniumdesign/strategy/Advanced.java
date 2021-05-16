package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class Advanced implements FlightSearch{

    @FindBy(id = "ctl00_c_CtWNW_ltMultiDest")
    private WebElement advancedTab;

    @FindBy(id = "ctl00_c_CtWNW_ddlFrom1-suggest")
    private WebElement departure1;

    @FindBy(id = "ctl00_c_CtWNW_ddlTo1-suggest")
    private WebElement arrival1;

    @FindBy(id = "ctl00_c_CtWNW_ddlFrom2-suggest")
    private WebElement departure2;

    @FindBy(id = "ctl00_c_CtWNW_ddlTo2-suggest")
    private WebElement arrival2;

    @FindBy(id = "ctl00_c_CtWNW_txtD1")
    private WebElement departureDate1;

    @FindBy(id = "ctl00_c_CtWNW_txtD2")
    private WebElement departureDate2;

    @FindBy(css = "td.ui-datepicker-current-day")
    private WebElement currentDay;

    @Override
    public void enterSourceDestination(Map<String, String> details) {
        this.advancedTab.click();
        this.departure1.sendKeys(details.get("departure1"));
        this.departure2.sendKeys(details.get("departure2"));
        this.arrival1.sendKeys(details.get("arrival1"));
        this.arrival2.sendKeys(details.get("arrival2"));
        this.departureDate1.click();
        this.currentDay.click();
        this.departureDate2.click();
        this.currentDay.click();
    }
}
