package com.design.pattern.Factory;

public class DeveloperClient {

    public static void main(String[] args) {

        Employee employee = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
        System.out.println(employee.salary());

        Employee employee1 = EmployeeFactory.getEmployee("WEB DEVELOPER");
        System.out.println(employee1.salary());
    }

}
