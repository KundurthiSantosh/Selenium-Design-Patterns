package com.practice.seleniumdesign.strategy;

import java.util.HashMap;
import java.util.Map;
import java.util.function.Supplier;

public class FlightOptionFactory {

    private static Supplier<FlightSearch> oneWay = OneWay::new;
    private static Supplier<FlightSearch> twoWay = TwoWay::new;
    private static Supplier<FlightSearch> advanced = Advanced::new;

    private static Map<String, Supplier<FlightSearch>> flightOptions = new HashMap<>();

    static {
        flightOptions.put("oneWay", oneWay);
        flightOptions.put("twoWay", twoWay);
        flightOptions.put("advanced", advanced);
    }

    public static FlightSearch get(String option){
        return flightOptions.get(option).get();
    }
}
