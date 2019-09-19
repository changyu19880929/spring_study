import com.chang.entity.Car;
import com.chang.entity.Student;
import com.chang.entity.User;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.SQLException;

/**
 * @author changyu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2019-09-09 15:26
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Student student1 = (Student)context.getBean("stu1");
//        Student student2 = (Student)context.getBean("stu1");
//        System.out.println(student1 == student2);
//        //原型作用域
//        Student student3 = (Student)context.getBean("stu2");
//        Student student4 = (Student)context.getBean("stu2");
//        System.out.println(student3 == student4);
//        Student student5 = (Student)context.getBean("stu3");
//        System.out.println(student5);

//        Car car = (Car)context.getBean("car");
//        User user = (User)context.getBean("user");
//        System.out.println(car);
//        System.out.println(user);

//        DataSource dataSource = (DataSource)context.getBean("dataSource");
//        Connection connection = null;
//        try {
//            connection = dataSource.getConnection();
//            System.out.println(connection);
//        }catch (SQLException e){
//            e.printStackTrace();
//        }

        User user = (User)context.getBean("user1");
        System.out.println(user);
    }
}
