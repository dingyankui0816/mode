package com.design.mode.pattern.behavioralModel.mediatorPattern.v2;

import java.util.List;

public class RentingMediator implements Mediator {
    private XiaoQuFangLandlord xiaoQuFangLandlord;
    private NongMinFangLandlord nongMinFangLandlord;

    public RentingMediator() {
        xiaoQuFangLandlord = new XiaoQuFangLandlord();
        nongMinFangLandlord = new NongMinFangLandlord();
    }

    @Override
    public void supplyHouse(List<String> types) {
        System.out.println("经纪人提供了如下房源");
        if (types.contains("XiaoQuFang")){
            xiaoQuFangLandlord.supply();
        }
        if (types.contains("NongMinFang")){
            nongMinFangLandlord.supply();
        }
    }
}
