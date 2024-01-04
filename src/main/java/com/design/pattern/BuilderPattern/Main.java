package com.design.pattern.BuilderPattern;

public class Main {

    public static void main(String[] args) {

        User user = new UserBuilder().
                withUserId("123").
                withUserName("Aditya").
                withEmailId("aditya@gmail.com").build();

        System.out.println(user);
    }

}
