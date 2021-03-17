package com.dahua.design.creation.singleton;

public class Person {

    private String name;
    private String age;

    private volatile static Person instance;

    private Person(){

    }

    public static Person getInstance(){
        if (instance == null) {
            synchronized (Person.class){
                if (instance == null) {
                    instance = new Person();
                }
            }
        }
        return instance;
    }
}
