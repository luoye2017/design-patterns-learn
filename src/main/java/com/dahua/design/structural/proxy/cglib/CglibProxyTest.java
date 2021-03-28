package com.dahua.design.structural.proxy.cglib;

public class CglibProxyTest {

    public static void main(String[] args) {
        WFTiktok wfTiktok = new WFTiktok();
        wfTiktok.tiktok();

        WFTiktok proxy = CglibProxy.getProxy(wfTiktok);
        proxy.tiktok();
    }
}
