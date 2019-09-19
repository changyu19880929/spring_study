package com.chang.service.impl;

import com.chang.dao.UserDao;
import com.chang.entity.User;
import com.chang.service.UserService;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.service.impl
 * @date 2019-09-12 14:40
 * @Copyright 北京木联能软件股份有限公司
 */
public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public UserDao getUserDao() {
        return userDao;
    }

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
