package com.design.mode.tenet.singleResponsibility.service;

import com.design.mode.tenet.singleResponsibility.User;

public interface UserOpr {
    boolean updateName(User user, String newName);
    boolean updatePassword(User user,String newPassword);
}
