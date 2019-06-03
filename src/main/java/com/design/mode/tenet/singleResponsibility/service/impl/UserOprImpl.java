package com.design.mode.tenet.singleResponsibility.service.impl;

import com.design.mode.tenet.singleResponsibility.User;
import com.design.mode.tenet.singleResponsibility.service.UserOpr;

/**
 * 符合职责单一原则 (一个方法只做一件事)
 */
public class UserOprImpl implements UserOpr {

    @Override
    public boolean updateName(User user, String newName) {
        //修改名称
        return false;
    }

    @Override
    public boolean updatePassword(User user, String newPassword) {
        //修改密码
        return false;
    }
}
