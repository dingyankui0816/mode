package com.design.mode.pattern.structuralModel.builder.build;

import com.design.mode.pattern.structuralModel.builder.bean.User;
import com.design.mode.pattern.structuralModel.builder.bean.User2;

/**
 * 建造者模式 用来处理复合对象，和工厂模式不同，工厂模式只是生产单个产品，不关注内部生产过程
 * guess : 通常使用建造者模式创建具体对象，使用工厂模式创建 建造者 (未证实)
 */
public class User2Builder implements IBuilder {
    private User2 user2 = new User2();
    @Override
    public User getUser() {
        return user2;
    }

    @Override
    public void build() {
        user2.setCcc("ccc");
        user2.setDdd("ddd");
    }
}
