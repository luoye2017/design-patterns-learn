package com.dahua.design.creation.factory.simplefactory;

public class PayFactory {

    public static AbstractPayWay getPayWay(String type) {
        if (type.equals("ali")) {
            return new AliPay();
        } else if (type.equals("tx")) {
            return new TxPay();
        }

        return null;
    }
}
