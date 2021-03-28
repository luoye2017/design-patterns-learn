package com.dahua.design.structural.proxy.statics;

public class StaticsProxyTest {

    public static void main(String[] args) {
        WFTiktok wfTiktok = new WFTiktok();
        wfTiktok.tiktok();

        ZsTiktokProxy zsTiktokProxy = new ZsTiktokProxy(wfTiktok);
        zsTiktokProxy.tiktok();
    }
}
