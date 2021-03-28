package com.dahua.design.structural.decorator;

public class DecoratorTest {

    public static void main(String[] args) {
        WFTiktok wfTiktok = new WFTiktok();
        wfTiktok.tiktok();

        MeiYanTiktok meiYanTiktok = new MeiYanTiktok(wfTiktok);
        meiYanTiktok.tiktok();
    }
}
