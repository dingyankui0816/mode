package com.design.mode.pattern.builder.build;

import com.design.mode.pattern.builder.bean.User;
import com.design.mode.pattern.builder.bean.User1;

public class User1Builder implements IBuilder {
    private User1 user1 = new User1();
    @Override
    public User getUser() {
        return user1;
    }

    @Override
    public void build() {
        user1.setAaa("aaa");
        user1.setBbb("bbb");
    }
}
