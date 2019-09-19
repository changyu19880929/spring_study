import com.chang.entity.Classes;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changyu
 * @version V1.0
 * @Package PACKAGE_NAME
 * @date 2019-09-09 15:26
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        System.out.println(1111);


        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Student student = (Student)context.getBean("stu");
//        Student student = (Student)context.getBean("stu1");
//        Student student = (Student)context.getBean("stu2");
//        Student student1 = context.getBean(Student.class);
//        Student student1 = (Student)context.getBean("stu4");
//        Student student1 = (Student)context.getBean("stu5");
//        Student student1 = (Student)context.getBean("stu6");
//        System.out.println(classes1);
        Classes classes1 = (Classes)context.getBean("classes1");
        System.out.println(classes1);
    }
}
