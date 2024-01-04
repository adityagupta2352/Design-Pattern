package com.design.pattern.IteratorDesignPattern;

public class MainClass {

    public static void main(String[] args) {

        UserManagement userManagement = new UserManagement();

        userManagement.addUser(new User("1" , "Aditya"));
        userManagement.addUser(new User("2" , "Goutem"));
        userManagement.addUser(new User("3" , "Lalit"));
        userManagement.addUser(new User("4" , "Manav"));

        MyIterator myIterator = userManagement.getIterator();

        while (myIterator.hasNext()){
            User user = (User) myIterator.next();
            System.out.println(user.getName());
        }
    }
}
