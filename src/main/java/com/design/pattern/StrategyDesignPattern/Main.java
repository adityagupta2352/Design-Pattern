package com.design.pattern.StrategyDesignPattern;

public class Main {


    public static void main(String[] args) {

        ApplyDicount applyDicount = new ApplyDicount(new FlatDiscount());
        applyDicount.getDiscount();

        applyDicount.setStrategy(new CachbackDiscount());
        applyDicount.getDiscount();

    }

}
