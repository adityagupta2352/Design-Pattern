package com.design.pattern.AssignmentForCDP.Receiver;

import java.time.LocalTime;

public class Lights {

    public void lightOn() {

        LocalTime currentTime = LocalTime.now();
        int hour = currentTime.getHour();

        if (hour >= 7) {
            System.out.println("Light Turned On");
        } else {
            System.out.println("It's not 7 o'clock yet");
        }
    }

    public void lightOff(){
        System.out.println("Light Turn Off");
    }

    public void lightUp(){
        System.out.println("Light Brightness Up");
    }

    public void lightDimDown(){
        System.out.println("Light Brightness Dim Down");
    }

}
