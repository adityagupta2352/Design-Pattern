package com.design.pattern.AbstractDesignPattern;

public class AndroidDeveloper implements EmployeeOfAbstract {

    @Override
    public String name() {
        System.out.println("I am a android developer");
        return "Android Developer";
    }

    @Override
    public int salary() {
        return 50000;
    }
}
