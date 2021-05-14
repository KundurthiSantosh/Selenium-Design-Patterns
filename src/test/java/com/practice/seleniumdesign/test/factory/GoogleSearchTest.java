package com.practice.seleniumdesign.test.factory;

import com.practice.seleniumdesign.factory.GoogleFactory;
import com.practice.seleniumdesign.factory.GooglePage;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleSearchTest extends BaseTest {

    @Test(dataProvider = "data")
    public void searchTest(String language, String keyword){
        GooglePage googlePage = GoogleFactory.get(language, driver);
        googlePage.launchSite();
        googlePage.search(keyword);
        System.out.println("Results count: " + googlePage.getResultCount());
    }

    @DataProvider(name = "data")
    public Object[][] getData(){
        return new Object[][]{
                {"ENG", "Selenium"},
                {"SA", "Santosh"},
                {"FR", "Selenium"},
        };
    }

}
