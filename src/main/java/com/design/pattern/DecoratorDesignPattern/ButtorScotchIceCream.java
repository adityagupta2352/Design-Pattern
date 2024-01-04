package com.design.pattern.DecoratorDesignPattern;

public class ButtorScotchIceCream extends IceCream{

    @Override
    String getDescription(){
        return "Buttor Scotch";
    }

    @Override
    int cost() {
        return 60;
    }
}
