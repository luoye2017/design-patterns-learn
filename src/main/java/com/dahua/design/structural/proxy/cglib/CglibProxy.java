package com.dahua.design.structural.proxy.cglib;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class CglibProxy {

    public static<T> T getProxy(T t){
        // 1 创建一个增强器
        Enhancer enhancer = new Enhancer();

        // 2 设置要增强哪个类的功能
        enhancer.setSuperclass(t.getClass());

        enhancer.setCallback(new MethodInterceptor() {
            @Override
            public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
                System.out.println("cglib代理开始工作了");
                Object o = proxy.invokeSuper(obj, args);
                return o;
            }
        });

        Object o = enhancer.create();
        return (T)o;
    }
}
