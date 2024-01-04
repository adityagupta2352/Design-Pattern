package com.design.pattern.IteratorDesignPattern;

import java.util.List;

public class MyIteratorImpl implements MyIterator {

    private List<User> userList;

    private int lenght;

    private int position = 0;

    public MyIteratorImpl(List<User> userList) {
        this.userList = userList;
        this.lenght = userList.size();
    }

    @Override
    public boolean hasNext() {
        if (position >= lenght)
            return false;
        else
            return true;
    }

    @Override
    public Object next() {
        User user = userList.get(position);
        position += 1;
        return user;
    }
}
