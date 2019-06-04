package com.design.mode.pattern.structuralModel.factory.commonFactory.factory;

import com.design.mode.pattern.structuralModel.factory.commonFactory.bean.User;
import com.design.mode.pattern.structuralModel.factory.commonFactory.bean.User1;

/**
 * 工厂模式，用于 一个维度多层产品(产品层数高的情况，有利于扩展符合开闭原则)
 */
public class User1Facotry implements IFactory {
    @Override
    public User getUser() {
        return new User1();
    }
}
