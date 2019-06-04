package com.design.mode.pattern.abstractFactory.factory.leg;

import com.design.mode.pattern.abstractFactory.bean.leg.Leg;

public class Leg1Factory implements ILegFactory {
    @Override
    public Leg getLeg() {
        return new Leg();
    }
}
