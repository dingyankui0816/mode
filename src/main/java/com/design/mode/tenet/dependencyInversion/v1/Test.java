package com.design.mode.tenet.dependencyInversion.v1;

import com.design.mode.tenet.dependencyInversion.v1.boss.ABoss;
import com.design.mode.tenet.dependencyInversion.v1.boss.BBoss;

/**
 * 没有实现依赖倒置，boss模块依赖了具体的staff (抽象不能依赖于细节)（实现类需要依赖于抽象或者接口）
 */
public class Test {
    public static void main(String[] args) {
        ABoss aBoss =new  ABoss();
        BBoss bBoss = new BBoss();
        aBoss.ask(bBoss);
    }
}
