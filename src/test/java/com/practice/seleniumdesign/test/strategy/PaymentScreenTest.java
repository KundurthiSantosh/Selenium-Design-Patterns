package com.practice.seleniumdesign.test.strategy;

import com.practice.seleniumdesign.strategy.*;
import com.practice.seleniumdesign.test.BaseTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.util.HashMap;
import java.util.Map;

public class PaymentScreenTest extends BaseTest {

    private PaymentScreen paymentScreen;

    @BeforeTest
    public void setPaymentScreen(){
        this.paymentScreen = new PaymentScreen(this.driver);
    }

    @Test(dataProvider = "data")
    public void paymentTest(String paymentOption, Map<String, String> paymentDetails){
        this.paymentScreen.goTo();
        this.paymentScreen.getUserDetails().enterDetails("Santosh", "Kundurthi", "santosh@gmail.com");
        this.paymentScreen.setPaymentOption(PaymentOptionFactory.get(paymentOption));
        this.paymentScreen.pay(paymentDetails);
        System.out.println("Order number: " + this.paymentScreen.getOrder().orderNow());
    }

    @DataProvider(name = "data")
    public Object[][] getData(){

        Map<String, String> cc = new HashMap<>();
        cc.put("cc", "12344567890");
        cc.put("year", "2023");
        cc.put("cvv", "123");

        Map<String, String> nb = new HashMap<>();
        nb.put("bank", "WELLS FARGO");
        nb.put("accountNumber", "762729201");
        nb.put("pin", "999");

        Map<String, String> pp = new HashMap<>();
        pp.put("username", "sampleUser");
        pp.put("password", "Dueyra&54!");

        return new Object[][]{
                {"CC", cc},
                {"NB", nb},
                {"PP", pp}
        };
    }
}
