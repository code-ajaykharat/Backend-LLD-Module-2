package com.design.patterns.strategy;

public class HoliDiscount implements Discount{
    @Override
    public double applyDiscount(double price) {
        return price * 1.20;
    }
}
