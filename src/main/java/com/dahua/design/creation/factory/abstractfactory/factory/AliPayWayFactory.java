package com.dahua.design.creation.factory.abstractfactory.factory;

import com.dahua.design.creation.factory.abstractfactory.payway.AbstractPayWay;
import com.dahua.design.creation.factory.abstractfactory.payway.AliPay;

public class AliPayWayFactory extends AbstractPayFactory {

    @Override
    public AbstractPayWay getPayWay() {
        return new AliPay();
    }
}
