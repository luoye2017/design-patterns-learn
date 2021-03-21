package com.dahua.design.creation.factory.factorymethod;

import com.dahua.design.creation.factory.factorymethod.factory.AliPayWayFactory;
import com.dahua.design.creation.factory.factorymethod.factory.TxPayWayFactory;
import com.dahua.design.creation.factory.factorymethod.payway.AbstractPayWay;

public class FactoryMethodTest {

    public static void main(String[] args) {
        AliPayWayFactory aliPayWayFactory = new AliPayWayFactory();
        AbstractPayWay payWay = aliPayWayFactory.getPayWay();
        payWay.pay();

        TxPayWayFactory txPayWayFactory = new TxPayWayFactory();
        AbstractPayWay payWay1 = txPayWayFactory.getPayWay();
        payWay1.pay();
    }
}
