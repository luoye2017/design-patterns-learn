package com.dahua.design.creation.factory.simplefactory;

public class simplaFactoryTest {

    public static void main(String[] args) {
        AbstractPayWay ali = PayFactory.getPayWay("ali");
        ali.pay();

        AbstractPayWay tx = PayFactory.getPayWay("tx");
        tx.pay();
    }
}
