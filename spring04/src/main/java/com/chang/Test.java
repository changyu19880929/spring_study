package com.chang;

import com.chang.controller.UserController;
import com.chang.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-12 14:45
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        UserController userController = (UserController)context.getBean("userController");
        User user = userController.getUserById(3);
        System.out.println(user);
    }
}
