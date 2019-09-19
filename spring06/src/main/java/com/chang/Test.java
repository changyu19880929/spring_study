package com.chang;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-19 16:24
 * @Copyright 北京木联能软件股份有限公司
 */
public class Test {
    public static void main(String[] args) {
        Cal cal = new CalImpl();
        MyInvocationHandler myInvocationHandler = new MyInvocationHandler();

        //代理对象
        Cal cal1 = (Cal)myInvocationHandler.bind(cal);
        cal1.add(1,2);
        cal1.sub(3,2);
    }
}
