package com.zouxuan.crm.settings.service;

import com.zouxuan.crm.exception.LoginException;
import com.zouxuan.crm.settings.domain.User;

import java.util.List;

public interface UserService {
    User login(String loginAct, String loginPwd, String ip) throws LoginException;

    List<User> getUserList();
}
