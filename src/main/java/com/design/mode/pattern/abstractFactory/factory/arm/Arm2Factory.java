package com.design.mode.pattern.abstractFactory.factory.arm;

import com.design.mode.pattern.abstractFactory.bean.arm.Arm;
import com.design.mode.pattern.abstractFactory.bean.arm.Arm2;

public class Arm2Factory implements IArmFactory {
    @Override
    public Arm getArm() {
        return new Arm2();
    }
}
