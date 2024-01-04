package com.design.pattern.Singleton;

import com.design.pattern.Singleton.LazyInitializedSingleton;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.*;

@SpringBootApplication
public class DesignPatternApplication {

    public static void main(String[] args) throws Exception , CloneNotSupportedException {

        // One Way
//		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
//
//		lazyInitializedSingleton.showMessage();

        // Second Way
//		EagerInitializedSingleton eagerInitializedSingleton = EagerInitializedSingleton.getInstance();
//
//		eagerInitializedSingleton.showMessage();


        // Third Way
		/*
		1. Reflection API to breack singleton pattern

		Solution : 1 -> If object is there => throw exception from inside constructor
                   2 -> Use enum

        2. Deserialization

        Solution : Implementing readResolve method

        3. Cloning

         */

//		LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
//		System.out.println(lazyInitializedSingleton.hashCode());
//
//		Constructor<LazyInitializedSingleton> constructor = LazyInitializedSingleton.class.getDeclaredConstructor();
//		constructor.setAccessible(true);
//		LazyInitializedSingleton lazyInitializedSingleton1 = constructor.newInstance();
//		System.out.println(lazyInitializedSingleton1.hashCode());

          // ENUM
//        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.INSTANCE;
//        System.out.println(lazyInitializedSingleton.hashCode());
//        lazyInitializedSingleton.showMessage();
//
//        Constructor<LazyInitializedSingleton> constructor = LazyInitializedSingleton.class.getDeclaredConstructor();
//        constructor.setAccessible(true);
//        LazyInitializedSingleton lazyInitializedSingleton1 = constructor.newInstance();
//        System.out.println(lazyInitializedSingleton1.hashCode());

        // SERIALIZE
        LazyInitializedSingleton lazyInitializedSingleton = LazyInitializedSingleton.getInstance();
        ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream("abc.ob"));
        objectOutputStream.writeObject(lazyInitializedSingleton);
        System.out.println(lazyInitializedSingleton.hashCode());

        System.out.println("Serialiazation Done..");

        // DESERIALIZE
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream("abc.ob"));
        LazyInitializedSingleton lazyInitializedSingleton1 = (LazyInitializedSingleton) objectInputStream.readObject();
        System.out.println(lazyInitializedSingleton1.hashCode());

        // CLONING
        LazyInitializedSingleton lazyInitializedSingleton2 = (LazyInitializedSingleton) lazyInitializedSingleton1.clone();
        System.out.println(lazyInitializedSingleton2.hashCode());
    }

}
