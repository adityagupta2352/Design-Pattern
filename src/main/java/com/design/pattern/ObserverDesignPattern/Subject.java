package com.design.pattern.ObserverDesignPattern;


public interface Subject {

    void subscribe(Observer ob);

    void unsubscribe(String ob);

    void newVideoUploaded(String title);
}
