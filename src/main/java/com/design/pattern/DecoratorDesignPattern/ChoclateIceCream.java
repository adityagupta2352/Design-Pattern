package com.design.pattern.DecoratorDesignPattern;

public class ChoclateIceCream extends IceCream{

    @Override
    String getDescription(){
        return "Choclate";
    }

    @Override
    int cost() {
        return 70;
    }
}
