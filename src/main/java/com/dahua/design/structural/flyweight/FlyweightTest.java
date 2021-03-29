package com.dahua.design.structural.flyweight;

public class FlyweightTest {
    public static void main(String[] args) {
        // 张三找服务员
        AbstractWaitress waitress = ZuLiao.getWaitress("");
        waitress.service();
        System.out.println(waitress);

        // 李四找服务员
        AbstractWaitress waitress1 = ZuLiao.getWaitress("");
        waitress1.service();
        System.out.println(waitress1);

        // 王五找服务员
        AbstractWaitress waitress2 = ZuLiao.getWaitress("");
        System.out.println(waitress2);
        System.out.println("王五找不到服务员");
    }
}
