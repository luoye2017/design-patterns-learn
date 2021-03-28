package com.dahua.design.decorator;

public class MeiYanTikTok implements MeiYanDecorator{

    private ManTikTok manTikTok;

    public MeiYanTikTok(ManTikTok manTikTok) {
        this.manTikTok = manTikTok;
    }

    @Override
    public void enableMeiYan() {
        System.out.println("开启美颜");
        System.out.println("很多鲜花");
    }

    @Override
    public void tiktok() {
        enableMeiYan();
        manTikTok.tiktok();
    }
}
