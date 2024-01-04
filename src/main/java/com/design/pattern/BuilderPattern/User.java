package com.design.pattern.BuilderPattern;

import lombok.Setter;

@Setter
public class User {

    private String userId;

    private String userName;

    private String emailId;

    @Override
    public String toString() {
        return "User{" +
                "userId='" + userId + '\'' +
                ", userName='" + userName + '\'' +
                ", emailId='" + emailId + '\'' +
                '}';
    }
}
