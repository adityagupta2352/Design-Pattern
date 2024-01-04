package com.design.pattern.AbstractDesignPattern;

import com.design.pattern.Factory.Employee;

public class EmployeeFactory {

    // get the employee
    public static EmployeeOfAbstract getEmployee(EmployeeAbstractFactory employeeAbstractFactory) {
        return employeeAbstractFactory.createEmployee();
    }

}
