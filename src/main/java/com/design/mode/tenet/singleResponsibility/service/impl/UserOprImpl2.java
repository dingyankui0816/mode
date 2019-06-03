package com.design.mode.tenet.singleResponsibility.service.impl;

import com.design.mode.tenet.singleResponsibility.User;
import com.design.mode.tenet.singleResponsibility.service.UserOpr2;
import com.design.mode.tenet.singleResponsibility.userType.UserOprEnum;

/**
 * 不符合职责单一原则
 */
public class UserOprImpl2 implements UserOpr2 {
    @Override
    public boolean update(User user, UserOprEnum oprEnum) {
        if (oprEnum == UserOprEnum.UPDATE_NAME){
            //修改名称
        }else if (oprEnum == UserOprEnum.UPDATE_PASSWORD){
            //修改密码
        }
        return false;
    }
}
