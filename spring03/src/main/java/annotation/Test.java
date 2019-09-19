package annotation;

import annotation.controller.UserController;
import annotation.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changyu
 * @version V1.0
 * @Package annotation
 * @date 2019-09-12 15:03
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
