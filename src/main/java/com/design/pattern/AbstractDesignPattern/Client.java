package com.design.pattern.AbstractDesignPattern;


public class Client {

    public static void main(String[] args) {

        // I want to get android developer

        EmployeeOfAbstract employee  = (EmployeeOfAbstract) EmployeeFactory.getEmployee(new AndroidDeveloperFactory());
        employee.name();
        System.out.println(employee.salary());

        EmployeeOfAbstract employee1  = (EmployeeOfAbstract) EmployeeFactory.getEmployee(new WebDevFactory());
        employee1.name();
        System.out.println(employee1.salary());

        EmployeeOfAbstract employee2  = (EmployeeOfAbstract) EmployeeFactory.getEmployee(new ManagerFactory());
        employee2.name();
        System.out.println(employee2.salary());
    }

}
