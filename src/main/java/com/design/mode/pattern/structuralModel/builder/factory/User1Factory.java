package com.design.mode.pattern.structuralModel.builder.factory;

import com.design.mode.pattern.structuralModel.builder.bean.User;
import com.design.mode.pattern.structuralModel.builder.build.IBuilder;

public class User1Factory implements IUserFactory {
    @Override
    public User getUser() {
        IBuilderFactory iBuilderFactory = new User1BuilderFactory();
        IBuilder iBuilder =iBuilderFactory.getBuilder();
        iBuilder.build();
        return iBuilder.getUser();
    }
}
