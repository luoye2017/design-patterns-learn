package com.dahua.design.structural.facade;

public class WeiXinFacade {
    private Education education = new Education();

    private Police police = new Police();

    private Social social = new Social();

    public void handler(){
        education.handler();
        police.handler();
        social.handler();
    }
}
