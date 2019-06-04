package com.design.mode.pattern.structuralModel.builder.factory;

import com.design.mode.pattern.structuralModel.builder.build.IBuilder;

public interface IBuilderFactory {
    IBuilder getBuilder();
}
