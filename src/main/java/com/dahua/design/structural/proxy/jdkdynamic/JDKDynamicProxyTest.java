package com.dahua.design.structural.proxy.jdkdynamic;

public class JDKDynamicProxyTest {

    public static void main(String[] args) {
        ManTiktok wfTiktok = new WFTiktok();
        wfTiktok.tiktok();

        ManTiktok proxy = JDKDynamicProxy.getProxy(wfTiktok);
        proxy.tiktok();
    }
}
