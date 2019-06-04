package com.design.mode.pattern.builder.factory;

import com.design.mode.pattern.builder.build.IBuilder;
import com.design.mode.pattern.builder.build.User2Builder;

public class User2BuilderFactory implements IBuilderFactory {
    @Override
    public IBuilder getBuilder() {
        return new User2Builder();
    }
}
