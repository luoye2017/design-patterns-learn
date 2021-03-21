package com.dahua.design.creation.factory.abstractfactory.payway;

public class AliPay extends AbstractPayWay {

    public AliPay() {
        this.payUrl = "www.alibaba.com";
    }

    @Override
    public void pay() {
        System.out.println(payUrl + ".......pay way");
    }
}
