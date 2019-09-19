package com.springaop;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author changyu
 * @version V1.0
 * @Package com.springaop
 * @date 2019-09-19 17:01
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        //加载 spring.xml
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring.xml");
        //获取代理对象
        Cal cal = (Cal) applicationContext.getBean("calImpl");
        //执行方法
        cal.add(10, 3);
        cal.sub(10, 3);
    }
}
