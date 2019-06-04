package com.design.mode.pattern.builder.factory;

import com.design.mode.pattern.builder.build.IBuilder;
import com.design.mode.pattern.builder.build.User1Builder;

public class User1BuilderFactory implements IBuilderFactory {
    @Override
    public IBuilder getBuilder() {
        return new User1Builder();
    }
}
