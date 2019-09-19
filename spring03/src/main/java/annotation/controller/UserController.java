package annotation.controller;

import annotation.entity.User;
import annotation.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;

/**
 * @author changyu
 * @version V1.0
 * @Package annotation.controller
 * @date 2019-09-12 14:55
 * @Copyright 北京木联能软件股份有限公司
 */
@Controller
public class UserController {
    @Autowired
    @Qualifier("myUserService")
    private UserService userService;

    public User getUserById(int id){
        return userService.getUserById(id);
    }
}
