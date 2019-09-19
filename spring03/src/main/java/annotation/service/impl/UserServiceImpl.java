package annotation.service.impl;

import annotation.dao.UserDao;
import annotation.entity.User;
import annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author changyu
 * @version V1.0
 * @Package annotation.service.impl
 * @date 2019-09-12 14:54
 * @Copyright 北京木联能软件股份有限公司
 */
@Service("myUserService")
public class UserServiceImpl implements UserService {
    @Autowired
    private UserDao userDao;
    public User getUserById(int id) {
        return userDao.getUserById(id);
    }
}
