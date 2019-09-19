package com.chang.dao;

import com.chang.entity.User;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang.dao
 * @date 2019-09-12 14:36
 * @Copyright 北京木联能软件股份有限公司
 */
public interface UserDao {
    public User getUserById(int id);
}
