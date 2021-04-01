package com.dahua.design.behavioral.mediator;


/**
 * 星星9527
 */
public class XC9527  extends Captain{

    public XC9527(ControlTower controlTower) {
        this.controlTower = controlTower;
    }

    @Override
    void fly() {
        System.out.println("XC9527请求起飞....");
    }

    @Override
    void land() {
        System.out.println("XC9527请求降落....");
    }

    @Override
    void success() {
        System.out.println("XC9527请求降落....");
    }
}
