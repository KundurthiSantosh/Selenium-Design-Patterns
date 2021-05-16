package com.practice.seleniumdesign.strategy;

import java.util.Map;

public interface PaymentOption {
    public void enterPaymentDetails(Map<String, String> paymentDetails);
}
