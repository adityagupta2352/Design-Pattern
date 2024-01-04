package com.design.pattern.DecoratorDesignPattern;

public abstract class IceCream {

    String description;

    abstract int cost();

    String getDescription(){
        return description;
    }
}
