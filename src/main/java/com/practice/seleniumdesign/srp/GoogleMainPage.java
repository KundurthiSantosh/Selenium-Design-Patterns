package com.practice.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class GoogleMainPage {

    private final WebDriver driver;
    private final SearchSuggestion searchSuggestion;
    private final SearchWidget searchWidget;

    public GoogleMainPage(final WebDriver driver){
        this.driver = driver;
        this.searchSuggestion = PageFactory.initElements(driver, SearchSuggestion.class);
        this.searchWidget = PageFactory.initElements(driver, SearchWidget.class);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public void goTo(){
        driver.manage().window().maximize();
        driver.get("https://www.google.com");
    }
}
