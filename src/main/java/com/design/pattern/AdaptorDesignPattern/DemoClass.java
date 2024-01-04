package com.design.pattern.AdaptorDesignPattern;

public class DemoClass {

    public static void main(String[] args) {

        System.out.println("Program Started");

//        AppleCharger charger = new CharzerXYZ();

        AppleCharger charger = new AdaptorCharger(new DkCharger());

        Iphone13 iphone13 = new Iphone13(charger);

        iphone13.chargeIphone();

    }
}
