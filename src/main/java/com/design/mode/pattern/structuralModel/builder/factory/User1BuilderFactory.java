package com.design.mode.pattern.structuralModel.builder.factory;

import com.design.mode.pattern.structuralModel.builder.build.IBuilder;
import com.design.mode.pattern.structuralModel.builder.build.User1Builder;

public class User1BuilderFactory implements IBuilderFactory {
    @Override
    public IBuilder getBuilder() {
        return new User1Builder();
    }
}
