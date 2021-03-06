package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import java.util.Map;

public class PaymentScreen {

    private WebDriver driver;
    private UserDetails userDetails;
    private Order order;
    private PaymentOption paymentOption;

    public PaymentScreen(final WebDriver driver){
        this.driver = driver;
        this.userDetails = PageFactory.initElements(driver, UserDetails.class);
        this.order = PageFactory.initElements(driver, Order.class);
    }

    public void goTo(){
        this.driver.get("https://vins-udemy.s3.amazonaws.com/ds/strategy.html");
    }

    public UserDetails getUserDetails() {
        return userDetails;
    }

    public Order getOrder() {
        return order;
    }

    public void setPaymentOption(PaymentOption paymentOption){
        this.paymentOption = paymentOption;
        PageFactory.initElements(driver, this.paymentOption);
    }
    public void pay(Map<String, String> paymentDetails){
        this.paymentOption.enterPaymentDetails(paymentDetails);
    }
}
