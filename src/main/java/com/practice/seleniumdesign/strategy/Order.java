package com.practice.seleniumdesign.strategy;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Order {

    @FindBy(id = "buy")
    private WebElement buyNow;

    @FindBy(id = "ordernumber")
    private WebElement orderNumber;

    public String orderNow(){
        this.buyNow.click();
        return this.orderNumber.getText();
    }
}
