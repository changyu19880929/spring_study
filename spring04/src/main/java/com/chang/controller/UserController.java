package com.chang.controller;

import com.chang.entity.User;
import com.chang.service.UserService;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.controller
 * @date 2019-09-12 14:41
 * @Copyright 北京木联能软件股份有限公司
 */
public class UserController {
    private UserService userService;

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public User getUserById(int id){
        return userService.getUserById(id);
    }
}
