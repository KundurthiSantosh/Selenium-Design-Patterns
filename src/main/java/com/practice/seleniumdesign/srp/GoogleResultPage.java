package com.practice.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;

public class GoogleResultPage {

    private final SearchSuggestion searchSuggestion;
    private final SearchWidget searchWidget;
    private final ResultStat resultStat;
    private final NavigationBar navigationBar;

    public GoogleResultPage(final WebDriver driver){
        this.searchWidget = new SearchWidget(driver);
        this.searchSuggestion = new SearchSuggestion(driver);
        this.navigationBar = new NavigationBar(driver);
        this.resultStat = new ResultStat(driver);
    }

    public SearchSuggestion getSearchSuggestion() {
        return searchSuggestion;
    }

    public SearchWidget getSearchWidget() {
        return searchWidget;
    }

    public ResultStat getResultStat() {
        return resultStat;
    }

    public NavigationBar getNavigationBar() {
        return navigationBar;
    }
}
