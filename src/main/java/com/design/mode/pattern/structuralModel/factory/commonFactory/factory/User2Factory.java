package com.design.mode.pattern.structuralModel.factory.commonFactory.factory;

import com.design.mode.pattern.structuralModel.factory.commonFactory.bean.User;
import com.design.mode.pattern.structuralModel.factory.commonFactory.bean.User2;

public class User2Factory implements IFactory {
    @Override
    public User getUser() {
        return new User2();
    }
}
