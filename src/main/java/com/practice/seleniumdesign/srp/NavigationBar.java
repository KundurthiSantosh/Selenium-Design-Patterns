package com.practice.seleniumdesign.srp;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class NavigationBar extends AbstractComponent{

    @FindBy(id = "hdtb")
    private WebElement navBar;

    @FindBy(linkText = "Videos")
    private WebElement videos;

    @FindBy(linkText = "Images")
    private WebElement images;

    @FindBy(linkText = "News")
    private WebElement news;

    public NavigationBar(final WebDriver driver) {
        super(driver);
    }

    public void goToVideos(){
        this.videos.click();
    }

    public void goToImages(){
        this.images.click();
    }

    public void goToNews(){
        this.news.click();
    }

    @Override
    public boolean isDisplayed() {
        return this.wait.until(d -> this.navBar.isDisplayed());
    }
}
