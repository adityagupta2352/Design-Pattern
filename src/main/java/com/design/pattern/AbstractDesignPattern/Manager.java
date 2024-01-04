package com.design.pattern.AbstractDesignPattern;

public class Manager implements EmployeeOfAbstract{


    @Override
    public int salary() {
        return 10000;
    }

    @Override
    public String name() {
        System.out.println("I am a manager");
        return "MANAGER";
    }
}
