package com.design.mode.tenet.lawOfDemeter;

/**
 * 迪米特法则（最少知识原则），一个类只与它最直接的类相关。高内聚，低耦合。
 * 这样代码中会出现大量的中介类，没有什么实际意义只是做信息的转换
 */
public class Phone {
    private App app = new App();
    public void readBook(){
        app.read();
    }
}
