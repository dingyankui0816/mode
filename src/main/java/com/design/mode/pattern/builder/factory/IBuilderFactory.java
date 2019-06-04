package com.design.mode.pattern.builder.factory;

import com.design.mode.pattern.builder.build.IBuilder;

public interface IBuilderFactory {
    IBuilder getBuilder();
}
