package com.dahua.design.behavioral.obsever;

public class PersonFans extends AbstractFans{

    @Override
    void acceptMsg(String msg) {
        System.out.println("人粉丝收到消息 " + msg);
    }

    @Override
    void follow(AbstractTiktok abstractTiktok) {
        abstractTiktok.addFans(this);
    }
}
