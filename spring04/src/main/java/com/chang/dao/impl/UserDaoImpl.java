package com.chang.dao.impl;

import com.chang.dao.UserDao;
import com.chang.entity.User;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.dao.impl
 * @date 2019-09-12 14:37
 * @Copyright 北京木联能软件股份有限公司
 */
public class UserDaoImpl implements UserDao {
    private static Map<Integer,User> users;
    static {
        users = new HashMap<Integer,User>();
        users.put(1,new User(1,"zhangsan"));
        users.put(2,new User(2,"lisi"));
        users.put(3,new User(3,"wangwu"));
    }
    public User getUserById(int id) {
        return users.get(id);
    }
}
