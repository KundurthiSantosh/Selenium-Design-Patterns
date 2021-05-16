package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

import java.util.Map;

public class NetBanking implements PaymentOption{

    @FindBy(id = "bank")
    private WebElement bank;

    @FindBy(id = "acc_number")
    private WebElement accountNumber;

    @FindBy(id = "pin")
    private WebElement pin;

    @Override
    public void enterPaymentDetails(Map<String, String> paymentDetails) {
        Select bankDropDown = new Select(bank);
        bankDropDown.selectByVisibleText(paymentDetails.get("bank"));
        this.accountNumber.sendKeys(paymentDetails.get("accountNumber"));
        this.pin.sendKeys(paymentDetails.get("pin"));
    }
}
