package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class FlightSearchScreen {

    private WebDriver driver;
    private FlightSearch flightSearch;

    @FindBy(id = "ctl00_c_IBE_PB_FF")
    private WebElement searchButton;

    public FlightSearchScreen(final WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    public void goTo(){
        this.driver.get("https://fly10.emirates.com/CAB/IBE/SearchAvailability.aspx");
    }

    public void clickOnSearch(){
        this.searchButton.click();
    }

    public void setFlightSearch(FlightSearch flightSearch){
        this.flightSearch = flightSearch;
        PageFactory.initElements(driver, this.flightSearch);
    }

    public void enterDetails(Map<String, String> details){
        this.flightSearch.enterSourceDestination(details);
    }
}
