package com.dahua.design.creation.factory.factorymethod.factory;

import com.dahua.design.creation.factory.factorymethod.payway.AbstractPayWay;
import com.dahua.design.creation.factory.factorymethod.payway.TxPay;

public class TxPayWayFactory extends AbstractFactory{

    @Override
    public AbstractPayWay getPayWay() {
        return new TxPay();
    }
}
