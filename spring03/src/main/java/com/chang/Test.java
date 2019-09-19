package com.chang;

import com.chang.entity.Car;
import com.chang.entity.Person;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-12 14:10
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Car car = (Car) context.getBean("car1");
        System.out.println(car);


//        Car car2 = (Car) context.getBean("car2");
//        System.out.println(car2);


        Person person = (Person)context.getBean("person");
        System.out.println(person);
    }
}
