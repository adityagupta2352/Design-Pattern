package com.design.pattern.BuilderDesignPattern;

public class Main {

    public static void main(String[] args) {

        User user = new User.UserBuilder()
                .setEmailId("adityagupta43144@gmail.coom")
                .setUserId("USER123")
                .setUserName("Aditya")
                .build();

        System.out.println(user);

        User user1 = User.UserBuilder.builder()
                .setEmailId("xyz@gmail.com")
                .setUserId("USER234")
                .setUserName("XYZ")
                .build();

        System.out.println(user1);
    }

}
