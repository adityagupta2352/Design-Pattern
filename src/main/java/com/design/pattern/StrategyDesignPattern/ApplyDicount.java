package com.design.pattern.StrategyDesignPattern;

public class ApplyDicount {

    DiscountStrategy discountStrategy;

    public ApplyDicount(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

    void getDiscount(){
        discountStrategy.giveDiscount();
    }

    void setStrategy(DiscountStrategy discountStrategy){
        this.discountStrategy = discountStrategy;
    }

}
