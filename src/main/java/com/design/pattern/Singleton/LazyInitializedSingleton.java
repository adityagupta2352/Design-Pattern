package com.design.pattern.Singleton;

import java.io.Serializable;

public class LazyInitializedSingleton implements Serializable , Cloneable {

    //    FOR ENUM
    //    INSTANCE;

    private static LazyInitializedSingleton instance;

    private LazyInitializedSingleton() {
        // Private constructor to prevent instantiation from outside the class

        // To Prevent It From Reflection
        if(instance != null)
            throw new RuntimeException();
    }


    // WITHOUT THREAD SAFE
//    public static LazyInitializedSingleton getInstance() {
//        // Lazy initialization - create the instance only if it's null
//        if (instance == null) {
//            instance = new LazyInitializedSingleton();
//        }
//        return instance;
//    }

    // WITH THREAD SAFE
    public static LazyInitializedSingleton getInstance() {
        // Lazy initialization - create the instance only if it's null
        if (instance == null) {

            synchronized (LazyInitializedSingleton.class) {

                if (instance == null)
                    instance = new LazyInitializedSingleton();

            }
        }
        return instance;
    }

    public Object readResolve(){
        return instance;
    }

    @Override
    public Object clone() throws CloneNotSupportedException{
//        return super.clone();
        return instance;
    }

    public void showMessage() {
        System.out.println("Lazy Initialized Singleton: Hello, I am a Singleton!");
    }

}
