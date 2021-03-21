package com.dahua.design.creation.factory.abstractfactory.factory;

import com.dahua.design.creation.factory.abstractfactory.express.AbstractExpress;
import com.dahua.design.creation.factory.abstractfactory.payway.AbstractPayWay;

public abstract class AbstractExpressFactory extends AbstractFactory{


    abstract AbstractExpress getExpress();

    @Override
    AbstractPayWay getPayWay(){
        return null;
    }
}
