package com.chang;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @author changyu
 * @version V1.0
 * @Package com.chang
 * @date 2019-09-19 16:17
 * @Copyright 北京木联能软件股份有限公司
 */
public class MyInvocationHandler implements InvocationHandler {
    //委托对象
    private Object obj;

    //返回代理对象
    public Object bind(Object obj){
        this.obj = obj;
        return Proxy.newProxyInstance(obj.getClass().getClassLoader(),obj.getClass().getInterfaces(),this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println(method.getName()+"的参数是"+ Arrays.toString(args));
        Object result = method.invoke(this.obj,args);
        System.out.println(method.getName()+"的结果是:"+result);
        return result;
    }
}
