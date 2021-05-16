package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class OneWay implements FlightSearch{

    @FindBy(id = "ctl00_c_CtWNW_ltOneway")
    private WebElement oneWayTab;

    @FindBy(id = "ctl00_c_CtWNW_ddlFrom-suggest")
    private WebElement departure;

    @FindBy(id = "ctl00_c_CtWNW_ddlTo-suggest")
    private WebElement arrival;

    @FindBy(id = "txtDepartDate")
    private WebElement departureDate;

    @FindBy(css = "td.ui-datepicker-current-day")
    private WebElement currentDay;

    @Override
    public void enterSourceDestination(Map<String, String> details) {
        this.oneWayTab.click();
        this.departure.sendKeys(details.get("departure"));
        this.arrival.sendKeys(details.get("arrival"));
        this.departureDate.click();
        this.currentDay.click();
    }
}
