package com.design.mode.pattern.behavioralModel.mediatorPattern.v2;

import java.util.Arrays;

/**
 * 中介者模式 符合迪米特法则（高内聚，低耦合）
 * 中介者模式 通过互相依赖的对象中间加了一层，让原本强依赖的对象变成弱依赖（两个类的关系需要第三个类进行维护）
 * eg. MVC
 */
public class Tenant {
    private String name;
    private RentingMediator rentingMediator = new RentingMediator();
    public void lookAtHouse(){
        //小区房、农名房
        rentingMediator.supplyHouse(Arrays.asList("XiaoQuFang","NongMinFang"));
    }
}
