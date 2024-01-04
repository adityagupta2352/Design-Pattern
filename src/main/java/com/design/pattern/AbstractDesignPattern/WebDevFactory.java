package com.design.pattern.AbstractDesignPattern;

public class WebDevFactory extends EmployeeAbstractFactory {
    @Override
    public EmployeeOfAbstract createEmployee() {
        return new WebDeveloper();
    }
}
