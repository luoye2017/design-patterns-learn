package com.dahua.design.creation.factory.abstractfactory.factory;

import com.dahua.design.creation.factory.abstractfactory.express.AbstractExpress;
import com.dahua.design.creation.factory.abstractfactory.payway.AbstractPayWay;

public abstract class AbstractPayFactory extends AbstractFactory{
    @Override
    AbstractExpress getExpress(){
        return null;
    }
    abstract AbstractPayWay getPayWay();
}
