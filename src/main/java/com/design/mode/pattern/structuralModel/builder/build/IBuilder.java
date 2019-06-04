package com.design.mode.pattern.structuralModel.builder.build;

import com.design.mode.pattern.structuralModel.builder.bean.User;

public interface IBuilder {
    User getUser();
    void build();
}
