package com.singleton.hungry;

public class HungrySingleton {

    private HungrySingleton(){}

    public static final HungrySingleton instance = new HungrySingleton();

    public HungrySingleton getInstance(){
        return instance;
    }

}
