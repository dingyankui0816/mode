package com.design.mode.tenet.singleResponsibility.service;

import com.design.mode.tenet.singleResponsibility.User;
import com.design.mode.tenet.singleResponsibility.userType.UserOprEnum;

public interface UserOpr2 {
    boolean update(User user , UserOprEnum oprEnum);
}
