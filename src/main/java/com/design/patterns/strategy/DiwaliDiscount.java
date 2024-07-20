package com.design.patterns.strategy;

public class DiwaliDiscount implements Discount{
    @Override
    public double applyDiscount(double price) {
        return price * 1.10;
    }
}
