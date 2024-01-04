package com.design.pattern.StrategyDesignPattern;

public class CachbackDiscount implements DiscountStrategy{
    @Override
    public void giveDiscount() {
        System.out.println("Cashback Discount");
    }
}
