package com.design.pattern.AbstractDesignPattern;

public class ManagerFactory extends EmployeeAbstractFactory{

    @Override
    public EmployeeOfAbstract createEmployee() {
        return new Manager();
    }
}
