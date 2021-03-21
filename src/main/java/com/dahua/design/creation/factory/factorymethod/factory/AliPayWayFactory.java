package com.dahua.design.creation.factory.factorymethod.factory;

import com.dahua.design.creation.factory.factorymethod.payway.AbstractPayWay;
import com.dahua.design.creation.factory.factorymethod.payway.AliPay;

public class AliPayWayFactory extends AbstractFactory {

    @Override
    public AbstractPayWay getPayWay() {
        return new AliPay();
    }
}
