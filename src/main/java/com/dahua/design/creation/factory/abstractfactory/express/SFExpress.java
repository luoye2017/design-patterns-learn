package com.dahua.design.creation.factory.abstractfactory.express;

public class SFExpress extends AbstractExpress{

    public SFExpress() {
        this.address = "深圳";
    }

    @Override
    public void express() {
        System.out.println(address + " 顺丰快递更快更强");
    }
}
