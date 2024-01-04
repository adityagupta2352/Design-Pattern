package com.design.pattern.ObserverDesignPattern;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
public class Subscriber implements Observer{

    String name;

    Subscriber(String name){
        this.name = name;
    }

    @Override
    public void notified(String title) {

        System.out.println("Hello " + this.name + " new video uploaded : " + title);

    }
}
