package com.dahua.design.creation.factory.abstractfactory.express;

public class JDExpress extends AbstractExpress{

    public JDExpress() {
        this.address = "北京";
    }

    @Override
    public void express() {
        System.out.println(address + " 京东快读使命必达");
    }
}
