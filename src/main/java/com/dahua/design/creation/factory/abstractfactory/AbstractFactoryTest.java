package com.dahua.design.creation.factory.abstractfactory;


import com.dahua.design.creation.factory.abstractfactory.express.AbstractExpress;
import com.dahua.design.creation.factory.abstractfactory.factory.AliPayWayFactory;
import com.dahua.design.creation.factory.abstractfactory.factory.JDExpressFactory;
import com.dahua.design.creation.factory.abstractfactory.factory.SFExpressFactory;
import com.dahua.design.creation.factory.abstractfactory.factory.TxPayWayFactory;
import com.dahua.design.creation.factory.abstractfactory.payway.AbstractPayWay;

public class AbstractFactoryTest {

    public static void main(String[] args) {

        AliPayWayFactory aliPayWayFactory = new AliPayWayFactory();
        AbstractPayWay payWay = aliPayWayFactory.getPayWay();
        payWay.pay();

        TxPayWayFactory txPayWayFactory = new TxPayWayFactory();
        AbstractPayWay payWay1 = txPayWayFactory.getPayWay();
        payWay1.pay();

        SFExpressFactory sfExpressFactory = new SFExpressFactory();
        AbstractExpress express = sfExpressFactory.getExpress();
        express.express();

        JDExpressFactory jdExpressFactory = new JDExpressFactory();
        AbstractExpress express1 = jdExpressFactory.getExpress();
        express1.express();
    }
}
