package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CookieHandling {

    @FindBy(id = "onetrust-accept-btn-handler")
    private WebElement accept;

    @FindBy(xpath = "//a[contains(text(),'New search')]")
    private WebElement newSearch;

    public CookieHandling(final WebDriver driver){
        PageFactory.initElements(driver, this);
    }

    public void handleCookie(){
        this.accept.click();
        this.newSearch.click();
    }

}
