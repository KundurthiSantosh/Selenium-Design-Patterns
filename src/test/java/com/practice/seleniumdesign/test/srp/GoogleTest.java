package com.practice.seleniumdesign.test.srp;

import com.practice.seleniumdesign.srp.main.GoogleMainPage;
import com.practice.seleniumdesign.srp.result.GoogleResultPage;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class GoogleTest extends BaseTest {

    private GoogleMainPage googleMainPage;
    private GoogleResultPage googleResultPage;

    @BeforeTest
    public void setUpPages(){
        this.googleMainPage = new GoogleMainPage(driver);
        this.googleResultPage = new GoogleResultPage(driver);
    }

    @Test(dataProvider = "data")
    public void googleWorkFlowTest(String keyWord, int index){

        googleMainPage.goTo();
        Assert.assertTrue(googleMainPage.getSearchWidget().isDisplayed());

        googleMainPage.getSearchWidget().enter(keyWord);
        Assert.assertTrue(googleMainPage.getSearchSuggestion().isDisplayed());

        googleMainPage.getSearchSuggestion().clickSuggestionByIndex(index);
        Assert.assertTrue(googleResultPage.getNavigationBar().isDisplayed());

        googleResultPage.getSearchWidget().enter(keyWord);
        Assert.assertTrue(googleResultPage.getSearchSuggestion().isDisplayed());

        googleResultPage.getSearchSuggestion().clickSuggestionByIndex(index);

        googleResultPage.getNavigationBar().goToNews();

        System.out.println(
                googleResultPage.getResultStat().getStat()
        );
    }

    @DataProvider(name = "data")
    public Object[][] getData(){
        return new Object[][]{
                {"Selenium", 3},
                {"Docker", 2},
                {"Java 8", 1}
        };
    }
}
