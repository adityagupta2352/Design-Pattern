package com.design.pattern.AdaptorDesignPattern;

public class DkCharger implements AndroidCharger{
    @Override
    public void chargerAndroidPhone() {
        System.out.println("Your android phone is charging");
    }
}
