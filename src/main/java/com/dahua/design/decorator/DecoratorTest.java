package com.dahua.design.decorator;

public class DecoratorTest {
    public static void main(String[] args) {
        WFTikTok wfTikTok = new WFTikTok();
        wfTikTok.tiktok();

        MeiYanTikTok meiYanTikTok = new MeiYanTikTok(wfTikTok);
        meiYanTikTok.tiktok();
    }
}
