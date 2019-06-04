package com.design.mode.pattern.structuralModel.singleton.lazy;

/**
 * 懒汉模式 单例模式
 */
public class Singleton {
    private Singleton(){
        /**empty**/
    }

    private static Singleton singleton;


    public static synchronized Singleton getSingleton(){
        if (singleton == null){
            singleton = new Singleton();
        }
        return singleton;
    }
}
