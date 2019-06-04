package com.design.mode.pattern.structuralModel.builder.factory;

import com.design.mode.pattern.structuralModel.builder.build.IBuilder;
import com.design.mode.pattern.structuralModel.builder.build.User2Builder;

public class User2BuilderFactory implements IBuilderFactory {
    @Override
    public IBuilder getBuilder() {
        return new User2Builder();
    }
}
