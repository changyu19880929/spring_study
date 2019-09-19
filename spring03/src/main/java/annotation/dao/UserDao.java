package annotation.dao;

import annotation.entity.User;
import com.chang.entity.Person;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;

/**
 * @author changyu
 * @version V1.0
 * @Package annotation.dao
 * @date 2019-09-12 14:55
 * @Copyright 北京木联能软件股份有限公司
 */

public interface UserDao {
    public User getUserById(int id);
}
