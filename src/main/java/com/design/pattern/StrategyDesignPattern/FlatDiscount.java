package com.design.pattern.StrategyDesignPattern;

public class FlatDiscount implements DiscountStrategy{

    @Override
    public void giveDiscount(){
        System.out.println("Flat Discount");
    }

}
