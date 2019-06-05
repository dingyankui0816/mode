package com.design.mode.pattern.behavioralModel.mediatorPattern.v1;

/**
 * 强耦合 迪米特法则 （高内聚，低耦合）
 */
public class Tenant {
    private String name;
    private NongMinFangLandlord nongMinFangLandlord = new NongMinFangLandlord();
    private XiaoQuFangLandlord xiaoQuFangLandlord = new XiaoQuFangLandlord();
    public void lookAtHouse(){
        //农名房
        nongMinFangLandlord.supply();
        //小区房
        xiaoQuFangLandlord.supply();
    }
}
