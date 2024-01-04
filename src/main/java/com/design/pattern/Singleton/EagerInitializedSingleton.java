package com.design.pattern.Singleton;

public class EagerInitializedSingleton {
    private static final EagerInitializedSingleton instance = new EagerInitializedSingleton();

    private EagerInitializedSingleton() {
        // Private constructor to prevent instantiation from outside the class
    }

    public static EagerInitializedSingleton getInstance() {
        return instance;
    }

    public void showMessage() {
        System.out.println("Eager Initialized Singleton: Hello, I am a Singleton!");
    }
}
