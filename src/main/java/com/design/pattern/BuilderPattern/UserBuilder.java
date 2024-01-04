package com.design.pattern.BuilderPattern;

public class UserBuilder {

    private final User user;

    public UserBuilder(){
        this.user = new User();
    }

    public UserBuilder withUserId(String userId) {
        user.setUserId(userId);
        return this;
    }

    public UserBuilder withUserName(String userName) {
        user.setUserName(userName);
        return this;
    }

    public UserBuilder withEmailId(String emailId) {
        user.setEmailId(emailId);
        return this;
    }

    public User build() {
        return user;
    }


}
