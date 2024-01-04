package com.design.pattern.AdaptorDesignPattern;

public class CharzerXYZ implements AppleCharger{
    @Override
    public void chargePhone() {
        System.out.println("Your iphone is charged");
    }
}
