package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.Map;

public class CreditCard implements PaymentOption{

    @FindBy(id = "cc")
    private WebElement creditCard;

    @FindBy(id = "year")
    private WebElement year;

    @FindBy(id = "cvv")
    private WebElement cvv;

    @Override
    public void enterPaymentDetails(Map<String, String> paymentDetails) {
        this.creditCard.sendKeys(paymentDetails.get("cc"));
        this.year.sendKeys(paymentDetails.get("year"));
        this.cvv.sendKeys(paymentDetails.get("cvv"));
    }
}
