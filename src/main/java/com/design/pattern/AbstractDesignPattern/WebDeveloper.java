package com.design.pattern.AbstractDesignPattern;

public class WebDeveloper implements EmployeeOfAbstract {

    @Override
    public String name() {
        System.out.println("I am a web developer");
        return "Web Developer";
    }

    @Override
    public int salary() {
        return 40000;
    }
}
