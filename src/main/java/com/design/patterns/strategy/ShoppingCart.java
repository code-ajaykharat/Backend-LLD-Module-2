package com.design.patterns.strategy;

public class ShoppingCart {
    private double price;
    private Discount discount;//ref of strategy and switch

    public ShoppingCart(double price, Discount discount) {
        this.price = price;
        this.discount = discount;
    }

    public double finalPrice(){
        return discount.applyDiscount(price);
    }
}
