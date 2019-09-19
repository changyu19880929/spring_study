package annotation.dao.impl;

import annotation.dao.UserDao;
import annotation.entity.User;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyu
 * @version V1.0
 * @Package annotation.dao.impl
 * @date 2019-09-12 14:55
 * @Copyright 北京木联能软件股份有限公司
 */
@Repository
public class UserDaoImpl implements UserDao {

    public static Map<Integer, User> users;
    static {
        users = new HashMap<Integer, User>();
        users.put(1,new User(1,"zhangsna"));
        users.put(2,new User(2,"lisi"));
        users.put(3,new User(3,"wangwu"));
    }

    public User getUserById(int id){
        return users.get(id);
    }
}
