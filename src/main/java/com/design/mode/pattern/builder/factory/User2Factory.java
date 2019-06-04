package com.design.mode.pattern.builder.factory;

import com.design.mode.pattern.builder.bean.User;
import com.design.mode.pattern.builder.build.IBuilder;

public class User2Factory implements IUserFactory {
    @Override
    public User getUser() {
        IBuilderFactory iBuilderFactory = new User2BuilderFactory();
        IBuilder iBuilder =iBuilderFactory.getBuilder();
        iBuilder.build();
        return iBuilder.getUser();
    }
}
