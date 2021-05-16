package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class Paypal implements PaymentOption{

    @FindBy(id = "paypal_username")
    private WebElement paypalUserName;

    @FindBy(id = "paypal_password")
    private WebElement paypalPassword;

    @Override
    public void enterPaymentDetails(Map<String, String> paymentDetails) {
        this.paypalUserName.sendKeys(paymentDetails.get("username"));
        this.paypalPassword.sendKeys(paymentDetails.get("password"));
    }
}
