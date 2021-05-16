package com.practice.seleniumdesign.test.strategy;

import com.practice.seleniumdesign.strategy.CookieHandling;
import com.practice.seleniumdesign.strategy.FlightOptionFactory;
import com.practice.seleniumdesign.strategy.FlightSearchScreen;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class EmiratesTest extends BaseTest {

    private FlightSearchScreen flightSearchScreen;
    private CookieHandling cookieHandling;

    @BeforeTest
    public void setFlightSearch(){
        this.flightSearchScreen = new FlightSearchScreen(this.driver);
        cookieHandling = new CookieHandling(this.driver);
    }

    @Test(dataProvider = "data")
    public void emiratesTest(String flightOption, Map<String, String> details){
        this.flightSearchScreen.setFlightSearch(FlightOptionFactory.get(flightOption));
        this.flightSearchScreen.goTo();
        this.cookieHandling.handleCookie();
        this.flightSearchScreen.enterDetails(details);
        this.flightSearchScreen.clickOnSearch();
    }

    @DataProvider(name = "data")
    public Object[][] getData(){

        Map<String, String> oneWay = new HashMap<>();
        oneWay.put("departure", "HYD");
        oneWay.put("arrival", "PNY");

        return new Object[][]{
                {"oneWay", oneWay}
        };
    }
}
