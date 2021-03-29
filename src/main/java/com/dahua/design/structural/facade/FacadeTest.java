package com.dahua.design.structural.facade;

public class FacadeTest {

    public static void main(String[] args) {
        Education education = new Education();
        education.handler();
        Police police = new Police();
        police.handler();
        Social social = new Social();
        social.handler();

        System.out.println("---------------------------------");

        WeiXinFacade weiXinFacade = new WeiXinFacade();
        weiXinFacade.handler();
    }
}
