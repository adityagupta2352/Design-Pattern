package com.design.pattern.StrategyDesignPattern;

public class CoupenDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Coupen Discount");
    }
}
