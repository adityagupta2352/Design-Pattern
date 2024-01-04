package com.design.pattern.AdaptorDesignPattern;

public class AdaptorCharger implements AppleCharger{

    private AndroidCharger androidCharger;

    public AdaptorCharger(AndroidCharger androidCharger){
        this.androidCharger = androidCharger;
    }

    @Override
    public void chargePhone() {
        androidCharger.chargerAndroidPhone();
        System.out.println("Your phone is charging with adapter");
    }
}
