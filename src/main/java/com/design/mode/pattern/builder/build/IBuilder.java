package com.design.mode.pattern.builder.build;

import com.design.mode.pattern.builder.bean.User;

public interface IBuilder {
    User getUser();
    void build();
}
