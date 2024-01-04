package com.design.pattern.AbstractDesignPattern;

public class AndroidDeveloperFactory extends EmployeeAbstractFactory{
    @Override
    public EmployeeOfAbstract createEmployee() {
        return new AndroidDeveloper();
    }
}
