package com.design.mode.pattern.structuralModel.abstractFactory.factory.user;

import com.design.mode.pattern.structuralModel.abstractFactory.factory.arm.Arm2Factory;
import com.design.mode.pattern.structuralModel.abstractFactory.factory.arm.IArmFactory;
import com.design.mode.pattern.structuralModel.abstractFactory.factory.leg.ILegFactory;
import com.design.mode.pattern.structuralModel.abstractFactory.factory.leg.Leg2Factory;

/**
 * 抽象工厂 多个维度多层产品 (相当于将工厂模式的一个维度多层产品进行组装，为了可扩展，解耦)
 */
public class User1Factory implements IUserFactory {
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
