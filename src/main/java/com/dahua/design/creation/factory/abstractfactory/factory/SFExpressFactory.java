package com.dahua.design.creation.factory.abstractfactory.factory;

import com.dahua.design.creation.factory.abstractfactory.express.AbstractExpress;
import com.dahua.design.creation.factory.abstractfactory.express.SFExpress;

public class SFExpressFactory extends AbstractExpressFactory{
    @Override
    public AbstractExpress getExpress() {
        return new SFExpress();
    }
}
