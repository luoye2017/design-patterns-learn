package com.dahua.design.structural.proxy.jdkdynamic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class JDKDynamicProxy<T> implements InvocationHandler{

    private T target;

    public JDKDynamicProxy(T target) {
        this.target = target;
    }

    public static <T> T getProxy(T t){

        /**
         * ClassLoader loader,
         * Class<?>[] interfaces,
         * InvocationHandler h
         */
        Object proxyInstance = Proxy.newProxyInstance(t.getClass().getClassLoader(),
                t.getClass().getInterfaces(),
                new JDKDynamicProxy(t));

        return (T)proxyInstance;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("开始JDK动态代理啦啦啦啦");

        Object returnString = method.invoke(target, args);

        return returnString;
    }
}
