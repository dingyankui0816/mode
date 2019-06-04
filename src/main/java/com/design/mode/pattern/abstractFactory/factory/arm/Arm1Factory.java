package com.design.mode.pattern.abstractFactory.factory.arm;

import com.design.mode.pattern.abstractFactory.bean.arm.Arm;
import com.design.mode.pattern.abstractFactory.bean.arm.Arm1;

/**
 * 工厂模式，用于 一个维度多层产品(产品层数高的情况，有利于扩展符合开闭原则)
 */
public class Arm1Factory implements IArmFactory {
    @Override
    public Arm getArm() {
        return new Arm1();
    }
}
