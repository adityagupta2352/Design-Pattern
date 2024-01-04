package com.design.pattern.Factory;

public class AndroidDeveloper implements Employee{

    @Override
    public int salary(){
        System.out.println("Getting android developer salary");
        return 5000;
    }

}
