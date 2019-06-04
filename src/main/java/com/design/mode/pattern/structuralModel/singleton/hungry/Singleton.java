package com.design.mode.pattern.structuralModel.singleton.hungry;

/**
 * 饿汉模式 单例模式
 */
public class Singleton {
    private Singleton(){
        /**empty**/
    }
    private static Singleton singleton = new Singleton();
    public static Singleton getSingleton(){
        return singleton;
    }
}
