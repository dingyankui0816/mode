package com.design.mode.pattern.structuralModel.factory.simpleFactory;

/**
 * 简单工厂模式，用于 一个维度多层产品 (产品层数不能太多)
 */
public class Factory {
    public static User getUser(UserType type) throws IllegalAccessException {
        if (type == UserType.USER1){
            return new User1();
        }else if(type == UserType.USER2){
            return new User2();
        }
        throw new IllegalAccessException("没有该类型产品");
    }
}
