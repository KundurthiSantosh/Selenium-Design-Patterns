package com.practice.seleniumdesign.factory;

public abstract class GooglePage {

    public abstract void launchSite();
    public abstract void search(String keyWord);
    public abstract int getResultCount();

}
