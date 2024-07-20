package com.design.patterns.strategy;

public class Main {
    public static void main(String[] args) {
        ShoppingCart sc = new ShoppingCart(100,new DiwaliDiscount());
        System.out.printf("%.2f", sc.finalPrice());
    }
}
