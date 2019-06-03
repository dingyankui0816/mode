package com.design.mode.tenet.dependencyInversion.v2;

import com.design.mode.tenet.dependencyInversion.v2.boss.ABoss;
import com.design.mode.tenet.dependencyInversion.v2.boss.BBoss;
import com.design.mode.tenet.dependencyInversion.v2.staff.AStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.BStaff;
import com.design.mode.tenet.dependencyInversion.v2.staff.CStaff;

/**
 * 实现了依赖倒置，boss模块依赖了抽象的staff (实现类应该依赖于抽象或者接口)（细节依赖于抽象）
 * 变量的表面类型尽量是接口或者抽象类
 * 面向接口编程
 */
public class Test {
    public static void main(String[] args) {
        ABoss aBoss =new ABoss(new AStaff());
        BBoss bBoss = new BBoss(new BStaff());
        aBoss.setiStaff(new CStaff());
        aBoss.ask(bBoss);
    }
}
