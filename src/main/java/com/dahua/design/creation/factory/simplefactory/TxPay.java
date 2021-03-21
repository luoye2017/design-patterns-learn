package com.dahua.design.creation.factory.simplefactory;

public class TxPay extends AbstractPayWay{

    public TxPay() {
        this.payUrl = "www.tx.com";
    }

    @Override
    public void pay() {
        System.out.println(payUrl + ".......pay way");
    }
}
