package com.design.mode.pattern.abstractFactory.factory.user;

import com.design.mode.pattern.abstractFactory.factory.arm.Arm2Factory;
import com.design.mode.pattern.abstractFactory.factory.arm.IArmFactory;
import com.design.mode.pattern.abstractFactory.factory.leg.ILegFactory;
import com.design.mode.pattern.abstractFactory.factory.leg.Leg2Factory;

public class User2Factory implements IUserFactory {
    @Override
    public void initLeg() {
        ILegFactory legFactory = new Leg2Factory();
        legFactory.getLeg();
    }

    @Override
    public void initArm() {
        IArmFactory armFactory = new Arm2Factory();
        armFactory.getArm();
    }
}
