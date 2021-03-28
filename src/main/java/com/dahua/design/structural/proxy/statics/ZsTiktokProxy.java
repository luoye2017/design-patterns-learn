package com.dahua.design.structural.proxy.statics;

public class ZsTiktokProxy implements ManTiktok {

    private ManTiktok manTiktok;

    public ZsTiktokProxy(ManTiktok manTiktok) {
        this.manTiktok = manTiktok;
    }

    @Override
    public void tiktok() {
        // 代理对象 替换被代理对象
        System.out.println("原本的直播被我代理啦");
        System.out.println("我是张三 正在直播");

        // 代理对象 增强被代理对象
        System.out.println("开启美颜");
        manTiktok.tiktok();
    }
}
