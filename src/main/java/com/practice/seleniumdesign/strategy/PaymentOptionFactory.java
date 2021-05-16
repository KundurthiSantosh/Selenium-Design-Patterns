package com.practice.seleniumdesign.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class PaymentOptionFactory {

    private static final Supplier<PaymentOption> CC = CreditCard::new;
    private static final Supplier<PaymentOption> NB = NetBanking::new;
    private static final Supplier<PaymentOption> PP = Paypal::new;

    private static final Map<String, Supplier<PaymentOption>> payments = new HashMap<>();

    static {
        payments.put("CC", CC);
        payments.put("NB", NB);
        payments.put("PP", PP);
    }

    public static PaymentOption get(String option){
        return payments.get(option).get();
    }
}
