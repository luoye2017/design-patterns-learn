package com.dahua.design.structural.decorator;

public class MeiYanTiktok implements MeiYanDecorator{

    private ManTiktok manTiktok;

    public MeiYanTiktok(ManTiktok manTiktok) {
        this.manTiktok = manTiktok;
    }

    @Override
    public void tiktok() {
        enableMeiYan();
        manTiktok.tiktok();
    }

    @Override
    public void enableMeiYan() {
        System.out.println("开启美颜");
        System.out.println("献上鲜花");
    }
}
